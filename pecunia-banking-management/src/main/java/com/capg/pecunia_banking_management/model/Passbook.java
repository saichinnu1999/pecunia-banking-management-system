package com.capg.pecunia_banking_management.model;
import java.util.ArrayList;
import java.util.List;

public class Passbook {
	long AccountId;
	float balance;
	long phone;
	String userName;
	List<AccountSummary> transactions=new ArrayList<AccountSummary>();
	public Passbook() {
		// TODO Auto-generated constructor stub
	}
	public long getAccountId() {
		return AccountId;
	}
	public void setAccountId(long AccountId) {
		this.AccountId = AccountId;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<AccountSummary> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<AccountSummary> transactions) {
		this.transactions = transactions;
	}
	public Passbook(long walletId, float balance, long phone, String userName,
			List<AccountSummary> transactions) {
		super();
		this.AccountId = walletId;
		this.balance = balance;
		this.phone = phone;
		this.userName = userName;
		this.transactions = transactions;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(balance);
		result = prime * result + (int) (phone ^ (phone >>> 32));
		result = prime * result + ((transactions == null) ? 0 : transactions.hashCode());
		result = prime * result + ((userName == null) ? 0 : userName.hashCode());
		result = prime * result + (int) (AccountId ^ (AccountId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passbook other = (Passbook) obj;
		if (Float.floatToIntBits(balance) != Float.floatToIntBits(other.balance))
			return false;
		if (phone != other.phone)
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		if (userName == null) {
			if (other.userName != null)
				return false;
		} else if (!userName.equals(other.userName))
			return false;
		if (AccountId != other.AccountId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Passbook [AccountId=" + AccountId + ", balance=" + balance + ", phone=" + phone + ", userName="
				+ userName + ", transactions=" + transactions + "]";
	}
	

}
