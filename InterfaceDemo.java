package training;

interface Banks
{
	int rateofInterest(int percent);
	double minBalance(double amount);
}



class Hdfc implements Banks{

	@Override
	public int rateofInterest(int percent) {
		System.out.println("rateofInterest of Icici " +percent);
		
		return 0;
	}

	@Override
	public double minBalance(double amount) {
		System.out.println("minBalance is " +amount);

		return 0;
	}
	
	
}
public class InterfaceDemo {

	public static void main(String[] args) {
		
		Banks b = new Hdfc();
		b.minBalance(2000);
		b.rateofInterest(5);
		
	}

}
