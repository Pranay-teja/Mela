package com.accenture.mela.service;

import com.accenture.mela.Model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    @Autowired
    KafkaTemplate<String, Book> kafkaTemplate;

    private String topicName = "testtopic";

    public void publish() {
        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setBookId((long) i);
            book.setTitle("book" + i);

            kafkaTemplate.send(topicName, book);
        }
    }

}
