package com.eternallands.WhatsApp.Notifier;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class WhatsAppNotifierApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to the Eternal Lands WhatsApp Notifier");
		SpringApplication.run(WhatsAppNotifierApplication.class, args);
	}

}
