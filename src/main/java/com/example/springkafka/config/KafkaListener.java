package com.example.springkafka.config;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {

    @org.springframework.kafka.annotation.KafkaListener(topics = "new-topic",
    groupId = "groupId")
    public void listener(String data){
        System.out.println("message received "+data+" ))");

    }
}
