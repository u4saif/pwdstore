package com.codewithsaif.pwdstore;

import org.springframework.stereotype.Service;

@Service("sms")
public class SmsService implements NotificationService{
    @Override
    public Void sendNotification() {
        System.out.println("SMS have been sent successfully!!");
        return null;
    }
}
