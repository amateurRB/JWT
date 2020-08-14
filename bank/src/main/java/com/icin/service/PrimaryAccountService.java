package com.icin.service;

import java.security.Principal;
import java.util.List;

import com.icin.model.PrimaryAccount;

public interface PrimaryAccountService {
	public PrimaryAccount createPrimaryAccount();
	public List<PrimaryAccount> getAllPrimaryAccounts();
	void deposit(double amount, Principal principal);
    void withdraw( double amount, Principal principal);
}
