package com.userFront.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SavingsAccount {

	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Long id;
	   private int accountNumber;
	   private BigDecimal accountBalance;
	   
	   private List<SavingsTransaction> savingsTransactionList;

	public SavingsAccount(Long id, int accountNumber, BigDecimal accountBalance,
			List<SavingsTransaction> savingsTransactionList) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.savingsTransactionList = savingsTransactionList;
	}

	public SavingsAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(BigDecimal accountBalance) {
		this.accountBalance = accountBalance;
	}

	public List<SavingsTransaction> getSavingsTransactionList() {
		return savingsTransactionList;
	}

	public void setSavingsTransactionList(List<SavingsTransaction> savingsTransactionList) {
		this.savingsTransactionList = savingsTransactionList;
	}

	@Override
	public String toString() {
		return "SavingsAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", savingsTransactionList=" + savingsTransactionList + "]";
	}
	   
}
