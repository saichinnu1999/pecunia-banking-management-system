package com.capg.pecunia_banking_management.service;

import java.util.List;

import com.capg.pecunia_banking_management.model.Customer;




public interface CustomerService {
	public boolean addCustomer(Customer customer);
	public boolean deleteCustomer(int customerId);
	public boolean updateCustomer(Customer customer);
	public Customer findCustomer(int customerId);
	public List<Customer> getAllCustomer();


}
