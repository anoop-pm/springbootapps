package com.example.jsonproducer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jsonproducer.entity.Message;
import com.example.jsonproducer.producer.ProducerMessage;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/kafka")
public class MessageController {


	@Autowired
	private ProducerMessage jsonMessage;

	@GetMapping("/message")
	public String bookDetails(@RequestBody Message msg) throws JsonProcessingException
	{
		msg.setName(msg.getName());
		msg.setMessage(msg.getMessage());
		jsonMessage.sendMessage(msg);
		return "Message has been send";
	}


}
