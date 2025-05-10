package com.example.producer.consumer;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "test-topic", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }

}