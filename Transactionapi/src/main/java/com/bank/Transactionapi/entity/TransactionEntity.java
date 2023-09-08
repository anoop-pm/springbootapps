package com.bank.Transactionapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TransactionEntity {
	
	@Id
    private Long id;
	
    private int accountnumber;
   

    private int receiveraccount;
   
 
    private int amount;


	public TransactionEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAccountnumber() {
		return accountnumber;
	}


	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}


	public int getReceiveraccount() {
		return receiveraccount;
	}


	public void setReceiveraccount(int receiveraccount) {
		this.receiveraccount = receiveraccount;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}
   


}
