package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.*")
public class MailTestApplication implements CommandLineRunner {

    @Value("${admin.mail}")
    String email;

    public static void main(String[] args) {
        SpringApplication.run(MailTestApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {

        //System.out.println(email);
        Email email = new Email();
        email.sendMail();
    }
}
