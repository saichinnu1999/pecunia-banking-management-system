package com.capg.pecunia_banking_management.service;

import com.capg.pecunia_banking_management.model.Passbook;

public interface PassbookService 
{
    
	public Passbook getPassbookInfo(long id);
	
	public boolean addAmount(long id, float amount);
	
	public Passbook getaccountSummary(int id);
}
