package com.codewithsaif.pwdstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PwdstoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PwdstoreApplication.class, args);
		var manager = context.getBean(NotificationManager.class);
		manager.sendNotification();
	}

}
