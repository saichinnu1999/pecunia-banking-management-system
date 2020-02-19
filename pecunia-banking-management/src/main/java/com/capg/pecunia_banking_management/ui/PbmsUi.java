package com.capg.pecunia_banking_management.ui;

import com.capg.pecunia_banking_management.model.Customer;
import com.capg.pecunia_banking_management.service.CustomerService;

public class PbmsUi {
		CustomerService cs;
		void addCustomer()
		{
			Customer c=new Customer();
			cs.addCustomer(c);
			
		}

	}


