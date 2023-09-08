package com.example.jsonproducer.producer;

import java.io.IOException;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.jsonproducer.entity.Message;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProducerMessage {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;


	private static final Logger log = LoggerFactory.getLogger(ProducerMessage.class);
	private ObjectMapper objectMapper = new ObjectMapper();

	public void sendHello(String name) {
		kafkaTemplate.send("messagedump", "Hello " + name);
	}


	public void sendMessage(Message msg) throws JsonProcessingException {
		Object json = objectMapper.writeValueAsString(msg);
		kafkaTemplate.send("messagedump", json.toString());
	}

	@KafkaListener(topics = "messagedump")
	public void consume(String message) throws JsonParseException, JsonMappingException, IOException {
		Object emp = objectMapper.readValue(message, Message.class);
		JSONObject mess=new JSONObject(emp);//{"name":"Jaya","message":"Gud morning Kafka learning"}
		log.info("Name is {}", mess.get("name"));
		log.info("Message is {}", mess.get("message"));
		log.info("Message is {}", message);
	}

}
