package com.naresh.bankingappaccountsapp.model;

public class Account {

	private Integer id;
	
	private Integer userId;
	
	private Integer balance;

	public Integer getId() {
		return id;
	}

	public Account(Integer id, Integer userId, Integer balance) {
		super();
		this.id = id;
		this.userId = userId;
		this.balance = balance;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getBalance() {
		return balance;
	}

	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	
}
