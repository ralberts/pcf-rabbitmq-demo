package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoApplication {

    private final MessageProducer messageProducer;

    public DemoApplication(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @PostMapping("/testRabbit")
    public void sendMessage(@RequestBody SampleRequest request) {
        messageProducer.sendMessage(request);
    }
}
