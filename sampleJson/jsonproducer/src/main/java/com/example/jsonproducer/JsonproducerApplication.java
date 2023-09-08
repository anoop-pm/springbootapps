package com.example.jsonproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.jsonproducer.producer.ProducerMessage;

@SpringBootApplication
public class JsonproducerApplication {

	@Autowired
	private ProducerMessage message;

	public static void main(String[] args) {
		SpringApplication.run(JsonproducerApplication.class, args);

	}

}
