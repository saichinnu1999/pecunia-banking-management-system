package com.capg.pecunia_banking_management.ui;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;  

import com.capg.pecunia_banking_management.model.Passbook;
import com.capg.pecunia_banking_management.service.PassbookService;
import com.capg.pecunia_banking_management.service.PassbookServiceimpl;

public class PassbookUi {

	static PassbookService passbookService=new PassbookServiceimpl();
	static Scanner in= new Scanner(System.in);
	public static void main(String[] args)throws Exception {
		for(;;) {
		int choice;
		System.out.println("Enter your choice : ");
		System.out.println("1 - Get Passbook Info");
		System.out.println("2 - AccountSummary");
		System.out.println("3 - Exit");
		
		choice=in.nextInt();
		switch (choice) {
		case 1:
			getPassbookInfo();
			break;
		case 2:
			accountSummary();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		}
		
		}
		
	
	}
	private static void accountSummary() {
		
		System.out.println("Enter Account id :");
		long id=in.nextLong();
		int d1,d2;
		int m1,m2;
		int y1,y2;
		System.out.println("please type after date");
		d1=in.nextInt();
		m1=in.nextInt();
		y1=in.nextInt();
		System.out.println("please enter before date");
		d2=in.nextInt();
		m2=in.nextInt();
		y2=in.nextInt();
		Passbook acc=passbookService.getPassbookInfo(id);
		if(acc!=null) {
		System.out.println("Account id : "+acc.getAccountId());
		System.out.println("Current balance : "+acc.getBalance());
		acc.getTransactions().stream()
			.filter(t->t.getTransactionDate().isAfter(LocalDate.of(y1, m1, d1)) && t.getTransactionDate().isBefore(LocalDate.of(y2, m2, d2)))
			.forEach(t->System.out.println(t));
		
	}
		else {
			System.out.println("Account Not found...");
		}
	}


	private static void getPassbookInfo() {
		System.out.println("Enter Account id :");
		long id=in.nextLong();
		Passbook acc=passbookService.getPassbookInfo(id);
		if(acc!=null) {
		System.out.println("Account id : "+acc.getAccountId());
		System.out.println("Current balance : "+acc.getBalance());
		acc.getTransactions().stream()
			.filter(t->t.getTransactionDate().isBefore(LocalDate.now()))
			.forEach(t->System.out.println(t));
		
	}
		else {
			System.out.println("Account Not found or wrong account number...");
			System.out.println("PLEASE TRY AGAIN........");
		}
	}

}
