package com.naresh.bankingappaccountsapp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AccountService {

	public List<String> getTransactions(Integer accountId) {
        String url = "http://localhost:8080/transaction/api/transactions/accounts/{accountId}";
		List transactions = new RestTemplate()
          .getForObject(url, List.class, accountId);
		return transactions;
    }
}
