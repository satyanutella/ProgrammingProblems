package Assignmet_08_02_21;

import java.util.Scanner;

class SavingsAccount
{
	double balance;
	double interest;
	
	public SavingsAccount(double balance, double interest) {
		super();
		this.balance = balance;
		this.interest = interest;
	}
	
	void withdraw()
	{	
		
		System.out.println("your amount is debited");
	}
	void deposit()
	{
		System.out.println("Amount Deposited : " +balance);

		balance+=interest/100;
		System.out.println("Interest on deposit : " +balance);
	}
	/*
	 * void rateOfInterest() {
	 * System.out.println("rate of interest is : "+interest);
	 * 
	 * }
	 */
}

public class BankAcc {

	public static void main(String[] args) {
		
		SavingsAccount sa = new SavingsAccount(5000.0,5.1);
		
		sa.deposit();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter the amount to be withdrawn : ");
			
			double w = sc.nextDouble();
			sa.balance-=w;
			System.out.println(sa.balance);
			sa.withdraw();
		
		
			
		}
		
		
	}

