package com.naresh.bankingappaccountsapp.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient( name="transaction", url = "http://localhost:8080/transaction")
public interface TransactionService {
	
	@GetMapping("/api/transactions/accounts/{accountId}")
	public List<String> getTransactions(@PathVariable("accountId") Integer accountId);
	
	/*
	public List<String> getTransactions(Integer accountId) {
        String url = "http://localhost:8080/transaction/api/transactions/accounts/{accountId}";
		List transactions = new RestTemplate()
          .getForObject(url, List.class, accountId);
		return transactions;
    }*/
}
