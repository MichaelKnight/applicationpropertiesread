package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

/**
 * Created by Javier on 20/12/2015.
 */
@Component
public class Email {

    @Autowired
    private MailSender sender;

    @Value("${admin.mail}")
    String email;

    public Email() {
    }

    public void sendMail() {
        SimpleMailMessage msg = new SimpleMailMessage();

        System.out.println(email);

        msg.setTo("sample@email.com");
        msg.setSubject("Send mail by Spring Boot");
        msg.setText("Send mail by Spring Boot");

        sender.send(msg);
    }
}
