package com.example.demo;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {
    @Bean
    public Queue queue(){
        return new Queue("SAMPLE-INPUT");
    }
}
