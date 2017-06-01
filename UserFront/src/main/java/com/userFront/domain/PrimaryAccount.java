package com.userFront.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;

@Entity
public class PrimaryAccount {
 
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	 private int accountNumber;
	 private BigDecimal accountBalance;
	 
	 private List<PrimaryTransaction> primaryTransactionList;

	public PrimaryAccount(Long id, int accountNumber, BigDecimal accountBalance,
			List<PrimaryTransaction> primaryTransactionList) {
		super();
		this.id = id;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
		this.primaryTransactionList = primaryTransactionList;
	}

	public PrimaryAccount() {
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

	public List<PrimaryTransaction> getPrimaryTransactionList() {
		return primaryTransactionList;
	}

	public void setPrimaryTransactionList(List<PrimaryTransaction> primaryTransactionList) {
		this.primaryTransactionList = primaryTransactionList;
	}

	@Override
	public String toString() {
		return "PrimaryAccount [id=" + id + ", accountNumber=" + accountNumber + ", accountBalance=" + accountBalance
				+ ", primaryTransactionList=" + primaryTransactionList + "]";
	}
	 
	 
}

