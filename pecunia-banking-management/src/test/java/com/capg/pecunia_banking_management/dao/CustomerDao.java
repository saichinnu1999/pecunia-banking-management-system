package com.capg.pecunia_banking_management.dao;

import java.util.List;

import com.capg.pecunia_banking_management.model.Customer;

public interface CustomerDao {
	public boolean saveCustomer(Customer customer);
	public boolean removeCustomer(int customerId);
	public boolean updateCustomer(Customer customer);
	public Customer findCustomer(int customerId);
	public List<Customer> getAllCustomer();

}
