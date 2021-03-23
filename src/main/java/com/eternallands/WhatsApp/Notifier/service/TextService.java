package com.eternallands.WhatsApp.Notifier.service;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class TextService {

    public void sendMessage(String message){
        Twilio.init("xxxxx", "xxxx");
        Message text = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:+xxx"),
                new com.twilio.type.PhoneNumber("whatsapp:+xxx"),
                message)
                .create();

        System.out.println(text.getSid());

    }

}
