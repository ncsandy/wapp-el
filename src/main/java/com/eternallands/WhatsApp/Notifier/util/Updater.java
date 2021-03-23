package com.eternallands.WhatsApp.Notifier.util;
import com.eternallands.WhatsApp.Notifier.model.Invance;
import com.eternallands.WhatsApp.Notifier.model.Pear;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Updater {

    public String findPear(List<Pear> pearList){
        String pearID = "";

        for(Pear p: pearList){
           pearID = p.getIdmodmessages();
        }

        return pearID;
    }
    public String findPearFinder(List<Pear> pearList){
        String pearFinder = " ";
        for(Pear p: pearList){
            pearFinder = p.getModmessages();
        }
        return pearFinder;
    }

    public String findInvance(List<Invance> invanceList){
        String invanceID = "";

        for(Invance i: invanceList)   {
            invanceID = i.getIdinvance();
        }

        return invanceID;
    }
    public String invanceLevel(List<Invance> invanceList) {
        String invanceLevel = "";
        for(Invance i: invanceList){
            invanceLevel = i.getLevel();
        }
        return invanceLevel;
    }


}
