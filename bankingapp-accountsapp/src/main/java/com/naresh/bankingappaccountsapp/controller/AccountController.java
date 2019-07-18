package com.naresh.bankingappaccountsapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.bankingappaccountsapp.clients.TransactionService;
import com.naresh.bankingappaccountsapp.model.Account;
import com.naresh.bankingappaccountsapp.service.AccountService;

@RestController
@RequestMapping("api/accounts")
public class AccountController {

	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private TransactionService transactionService;
	
	@GetMapping
	public List<Account> list(){		
		List<Account> accounts = new ArrayList<>();
		accounts.add(new Account(1,1,1000));
		accounts.add(new Account(2,2,2000));
		return accounts;
	}
	
	@GetMapping("{accountId}/transactions")
	public List<String> findMyTransactions(@PathVariable("accountId") Integer accountId){
		List<String> transactions = transactionService.getTransactions(accountId);
		System.out.println("AccountController- findMyTransactions:" + transactions);
		return transactions;
	}
}
