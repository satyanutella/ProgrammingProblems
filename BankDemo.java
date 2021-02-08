package training;

class Bank
{
	void rateOfInterest()
	{
		System.out.println("2%");
	}
	void minBalance()
	{
		System.out.println("1000 RS");

	}
}

class Axis extends Bank
{
	
	void rateOfInterest()
	{
		
		System.out.println("5%");
	}
}
class Icici extends Bank
{
	void rateOfInterest()
	{
		System.out.println("7%");
	}
}

public class BankDemo {

	public static void main(String[] args) {
		
		Bank ax = new Axis(); // upcasting
		
		Bank ic = new Icici(); //upcasting
		
		ax.rateOfInterest();
		ax.minBalance();
		ic.rateOfInterest();
		ic.minBalance();
	}

}
