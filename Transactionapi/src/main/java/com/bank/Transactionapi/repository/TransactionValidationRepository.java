package com.bank.Transactionapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bank.Transactionapi.entity.TransactionEntity;



public interface TransactionValidationRepository extends JpaRepository <TransactionEntity, Integer>
{
//
//	@Transactional
//	@Modifying
//	@Query("UPDATE useraccounts SET balance  = :balance WHERE userid = :userid")
//	Integer updatebalance(int balance, int userid);
//
	@Query(value="select accountnumber from useraccounts u where u.accountnumber =:Anumber", nativeQuery=true)
	Integer getaccountnumber(@Param("Anumber") int Anumber);
	

	@Query(value="select senderaccountnumber from accounts u where u.senderaccountnumber =:Bnumber", nativeQuery=true)
	Integer getreceiveraccountnumber(@Param("Bnumber") int Bnumber);

	 
}