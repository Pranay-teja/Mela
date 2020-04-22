package com.accenture.mela.controller;

import com.accenture.mela.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/books")
public class BookController {

    @Autowired
    KafkaProducerService kafkaProducerService;

    @RequestMapping(value = "/publish", method = RequestMethod.GET)
    public void publishBook() {
        kafkaProducerService.publish();
    }


}

