package com.bank.Transactionapi.consumer;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.bank.Transactionapi.TransactionapiApplication;
import com.bank.Transactionapi.entity.TransactionEntity;
import com.bank.Transactionapi.repository.TransactionValidationRepository;

@Service
public class TransactionConsume {
	
	
	@Autowired
	private TransactionapiApplication transactionrepostory;
	
	
	
	
	@KafkaListener(topics = "kafka-testing2")
    public void consume(String message) {
        System.out.println("Consumed message: " + message.getClass().getName());
        
        
        JSONObject json = new JSONObject(message);
        System.out.println(json.get("AccountNumber"));
//        
////     
        Object id =json.get("AccountNumber");
        
		TransactionEntity transactions =new TransactionEntity();
        transactions.setAccountnumber(3306);
        transactions.setReceiveraccount(2255);
        transactions.setAmount(2333);
        
//        
        
	
        
       
//        setmethod(transactions);
	}
	
	public void setmethod(TransactionEntity transactions) {
		
		
		
		System.out.println(transactions);

		try {

		
			//accountbalance=balancerepository.getamount(transferamount.getAccountnumber());



			}
			catch(Exception e) 
			{
				
				System.out.println(e.getMessage());
			}
      
		
	}
	
    }
	


////int sendvalue = Integer.parseInt(id);
//
//String id2 = (String) json.get("RAccountNumber");
////int receivevalue = Integer.parseInt(id2);
//
//
//String id3 = (String) json.get("balance");
////int amount = Integer.parseInt(id3);
//
////
//TransactionEntity transactions =new TransactionEntity();
//transactions.setAccountnumber(3306);
//transactions.setReceiveraccount(2255);
//transactions.setAmount(2333);
//
//
//try {
//
//sender=transactionrepostory.getaccountnumber(transactions.getAccountnumber());
//receiver=transactionrepostory.getreceiveraccountnumber(transactions.getReceiveraccount());
////accountbalance=balancerepository.getamount(transferamount.getAccountnumber());
//
//
//
//}
//catch(Exception e) 
//{
//	
//	System.out.println(e.getMessage());
//}
////
////System.out.println(Integer.parseInt(id2));
//System.out.println(id2);
////
	



