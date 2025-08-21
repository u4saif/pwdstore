package com.codewithsaif.pwdstore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("email")
@Primary
public class EmailService implements NotificationService{
    @Override
    public Void sendNotification() {
        System.out.println("Email have been sent");
        return null;
    }
}
