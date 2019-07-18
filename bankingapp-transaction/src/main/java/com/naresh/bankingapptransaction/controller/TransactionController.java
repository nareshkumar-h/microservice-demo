package com.naresh.bankingapptransaction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.naresh.bankingapptransaction.service.TransactionService;

@RestController
@RequestMapping("api/transactions")
public class TransactionController {
	
	//@RemoteServerPort
	private int port;

	@Autowired
	private TransactionService transactionService;

	@GetMapping
	public List<String> list() {
		return transactionService.listAllAccounts();
	}

	@GetMapping("accounts/{accountId}")
	public List<String> findByAccountId(@PathVariable("accountId") Integer accountId) {
		return transactionService.list(accountId);
	}
	
	@GetMapping("port")
	public Integer getPort() {
		return port;
	}
}
