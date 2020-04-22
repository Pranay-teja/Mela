package com.accenture.mela.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics = "testtopic")
    public void kafkaConsumer(ConsumerRecord consumerRecord) {
//        System.out.println(consumerRecord.key());
        System.out.println(consumerRecord.value());
    }

}
