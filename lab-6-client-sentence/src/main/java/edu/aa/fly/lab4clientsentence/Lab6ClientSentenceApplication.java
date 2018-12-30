package edu.aa.fly.lab4clientsentence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication(scanBasePackages = "edu.aa.fly")
public class Lab6ClientSentenceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab6ClientSentenceApplication.class, args);
    }

}
