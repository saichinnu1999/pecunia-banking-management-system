package com.capg.pecunia_banking_management.dao;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.capg.pecunia_banking_management.model.Passbook;

public interface PassbookDao
{
	public boolean addAccount(Passbook account);
	public Passbook getPassbookById(long id);
	public boolean updatePassbook(Passbook account);
	public boolean addAmount(long id,float amount);
}
