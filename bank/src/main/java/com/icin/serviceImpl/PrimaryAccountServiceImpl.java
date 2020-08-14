package com.icin.serviceImpl;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dao.PrimaryAccountDao;
import com.icin.model.PrimaryAccount;
import com.icin.model.User;
import com.icin.service.PrimaryAccountService;
import com.icin.service.UserService;

@Service
public class PrimaryAccountServiceImpl implements PrimaryAccountService {

	 @Autowired
	 private PrimaryAccountDao primaryAccountDao;
	   
	 @Autowired
	 private UserService userService;
     private static int nextAccountNumber = 22113344;
     
     
	@Override
	public PrimaryAccount createPrimaryAccount() {
		PrimaryAccount primaryAccount = new PrimaryAccount();
        primaryAccount.setAccountBalance(new Long(0));
        primaryAccount.setAccountNumber(++nextAccountNumber);
        primaryAccountDao.save(primaryAccount);
        return primaryAccountDao.findByAccountNumber(primaryAccount.getAccountNumber());
	}

	@Override
	public List<PrimaryAccount> getAllPrimaryAccounts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deposit(double amount, Principal principal) {
		User user = userService.findByUsername(principal.getName());
      	PrimaryAccount primaryAccount = user.getPrimaryAccount();
        primaryAccount.setAccountBalance((long) (primaryAccount.getAccountBalance() + amount) );
        primaryAccountDao.save(primaryAccount);

//        Date date = new Date();
//        SavingsTransaction savingsTransaction = new SavingsTransaction(date, "Deposit to savings Account", "Account", "Finished", amount, savingsAccount.getAccountBalance(), savingsAccount);
//        transactionService.saveSavingsDepositTransaction(savingsTransaction);
		
	}

	@Override
	public void withdraw(double amount, Principal principal) {
		User user = userService.findByEmail(((User) principal).getMailid());

    	PrimaryAccount primaryAccount = user.getPrimaryAccount();
        primaryAccount.setAccountBalance((long) (primaryAccount.getAccountBalance() - amount) );
        primaryAccountDao.save(primaryAccount);

		
	}



}
