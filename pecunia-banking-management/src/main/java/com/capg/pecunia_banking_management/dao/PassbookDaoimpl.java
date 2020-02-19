package com.capg.pecunia_banking_management.dao;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.capg.pecunia_banking_management.model.Passbook;
import com.capg.pecunia_banking_management.model.AccountSummary;


public class PassbookDaoimpl implements PassbookDao {
Map<Long, Passbook> Accounts=new HashMap<>();
	
	public PassbookDaoimpl() {
		addSomeAccount();
	}
	public void addSomeAccount() {
		Passbook ac1=new Passbook(1001121312L,2000.0F,99586566L,"sai",
					Arrays.asList(new AccountSummary(1012121L,LocalDate.now(),10000),
							new AccountSummary(1012115L,LocalDate.now().minusDays(10),3000),
							new AccountSummary(1012125L,LocalDate.now().minusDays(1),7000),
		                    new AccountSummary(1012126L,LocalDate.now().minusDays(2),8000),
		                    new AccountSummary(1012127L,LocalDate.now().minusDays(12),800),
		                    new AccountSummary(1012128L,LocalDate.now().minusDays(8),90909),
		                    new AccountSummary(1012129L,LocalDate.now().minusDays(25),9000)));
		Passbook ac2=new Passbook(10011213021L,1000.0F,99586562L,"chinnu",
				Arrays.asList(new AccountSummary(10125323L,LocalDate.now().minusDays(100),999),
						new AccountSummary(1012115L,LocalDate.now().minusDays(10),6000),
						new AccountSummary(1012125L,LocalDate.now().minusDays(1),900),
	                    new AccountSummary(1012126L,LocalDate.now().minusDays(11),7000),
	                    new AccountSummary(1012127L,LocalDate.now().minusDays(12),8900),
	                    new AccountSummary(1012128L,LocalDate.now().minusDays(18),9000),
	                    new AccountSummary(1012129L,LocalDate.now().minusDays(25),1000)));
		
		Accounts.put(ac1.getAccountId(), ac1);
		Accounts.put(ac2.getAccountId(), ac2);
	}


	@Override
	public boolean addAccount(Passbook account) {
		if(Accounts.containsKey(account)) {
			return false;
		}
		Accounts.put(account.getAccountId(), account);
		
		return true;
	}

	@Override
	public Passbook getPassbookById(long id) {
		return Accounts.get(id);
	}

	@Override
	public boolean updatePassbook(Passbook account) {
		if(!Accounts.containsKey(account.getAccountId())) {
			return false;
		}
		Passbook accountToUpdate=Accounts.get(account.getAccountId());
		accountToUpdate.setBalance(account.getBalance());
		return true;
	}

	@Override
	public boolean addAmount(long id, float amount) {
		if(!Accounts.containsKey(id)) {
			return false;
		}
		Passbook acc=Accounts.get(id);
		AccountSummary tx=new AccountSummary();
		List<AccountSummary> trns=new ArrayList<AccountSummary>();
		for(AccountSummary t:acc.getTransactions())
		{
			trns.add(t);
		}
		trns.add(tx);
		acc.setTransactions(trns);
		
		return true;
		
	}

}
