package com.icin.service;

import java.security.Principal;
import java.util.List;

import com.icin.model.PrimaryAccount;
import com.icin.model.SavingsAccount;

public interface SavingsAccountService {
	
	public SavingsAccount createSavingsAccount();
	public List<SavingsAccount> getAllSavingsAccounts();
	void deposit(double amount, Principal principal);
    void withdraw( double amount, Principal principal);
	
}
