package com.eternallands.WhatsApp.Notifier.service;

import com.eternallands.WhatsApp.Notifier.model.Message;
import com.eternallands.WhatsApp.Notifier.util.Updater;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;



@Component
public class FetchService {

    String currentPearID = "";
    String currentInvanceID = "";
    String currentModMessage = "";

    String incomingPearID = "";
    String incomingInvanceID = "";
    String incomingModMessage = "";




    Long cycleCount = 0L;



    @Autowired
    Updater updater;

    @Autowired
    TextService textService;

    @Scheduled(cron = "*/10 * * * * *")
    @Transactional
    public void fetchData() {


        try {
            URL url = new URL("https://holy-eternalland.de/eldata.php");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String myJsonString = "";
            while (null != (myJsonString = br.readLine())) {
                ObjectMapper om = new ObjectMapper();
                Message[] message = om.readValue((myJsonString), Message[].class);

               incomingPearID = updater.findPear(message[1].getPear());
               incomingInvanceID = updater.findInvance(message[1].getInvance());
               incomingModMessage = message[0].getGIWSText();

               if(cycleCount == 0){
                   currentInvanceID = incomingInvanceID;
                   currentPearID = incomingPearID;
                   currentModMessage = incomingModMessage;


                   System.out.println(updater.findPearFinder(message[1].getPear()));

                   System.out.println("The " +updater.invanceLevel(message[1].getInvance()) + " invance" );

                   System.out.println(message[0].getGametimestamp());
               }

               if(!incomingInvanceID.equals(currentInvanceID) && cycleCount > 0){
                    currentInvanceID = incomingInvanceID;

                    textService.sendMessage("The" + updater.invanceLevel(message[1].getInvance()) +  " invance is initiated you have 20 minutes ");


               }
               if(!incomingPearID.equals(currentPearID) && cycleCount > 0){
                   currentPearID = incomingPearID;
                   textService.sendMessage(updater.findPearFinder(message[1].getPear()));
               }
               if(!incomingModMessage.equals(currentModMessage) && cycleCount > 0){
                   currentModMessage = incomingModMessage;
                   System.out.println("message sent");
                   textService.sendMessage(currentModMessage);

               }


            }

            cycleCount++;
        } catch (Exception ex) {
            System.out.println("Failed to fetch data or bad format");
            ex.printStackTrace();
        }
    }
}