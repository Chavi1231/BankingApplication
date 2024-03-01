package com.BankingApplication.service;

import com.BankingApplication.dto.AccountDto;


public interface AccountService {
	AccountDto createAccount(AccountDto account);
	AccountDto getAccountById(Long id);
	AccountDto deposit(Long id,double amount);
	AccountDto withdraw(Long id, double amount);
	

}
