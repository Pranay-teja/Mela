package com.accenture.mela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class MelaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MelaApplication.class, args);
	}

}
