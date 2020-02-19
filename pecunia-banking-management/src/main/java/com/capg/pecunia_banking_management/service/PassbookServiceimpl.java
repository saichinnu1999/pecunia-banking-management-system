package com.capg.pecunia_banking_management.service;


import com.capg.pecunia_banking_management.model.Passbook;
import com.capg.pecunia_banking_management.dao.PassbookDaoimpl;
import com.capg.pecunia_banking_management.dao.PassbookDao;
public class PassbookServiceimpl implements PassbookService {
	PassbookDao passbookdao=new PassbookDaoimpl();
	@Override
	public Passbook getPassbookInfo(long id) {
		return passbookdao.getPassbookById(id);
	}

	@Override
	public boolean addAmount(long id, float amount) {
		return passbookdao.addAmount(id, amount);
	}

	@Override
	public Passbook getaccountSummary(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
