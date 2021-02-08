package training;

import java.util.Scanner;

abstract class Timing
{
	abstract void login();
}
class morningShift extends Timing
{

	@Override
	void login() {
		System.out.println("Good morning!!");
		System.out.println("Welcome to General Shift");
		System.out.println("Your timings are 9am to 5pm");
		
	}
	
}

class afternoonShift extends Timing
{

	@Override
	void login() {
		System.out.println("Good Afternoon!!");
		System.out.println("Welcome to Afternoon Shift");
		System.out.println("Your timings are 2 pm to 10pm");
		
	}
	
}

class nightShift extends Timing
{

	@Override
	void login() {
		System.out.println("Good Evening!!");
		System.out.println("Welcome to Night Shift");
		System.out.println("Your timings are 10 pm to 7am");
		
	}
	
}

public class Abs {

	public static void main(String[] args) 
	{	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		morningShift ms = new morningShift();
		afternoonShift as = new afternoonShift();
		nightShift ns = new nightShift();
		
		int num = scanner.nextInt();
		
		
		switch(num)
		{
		case 1 : ms.login();
					break;
			
		case 2: as.login();
				break;
				
		case 3 : ns.login();
					break;
					
		default : System.out.println("wrong input!!");
		}
		
		
		
	}

}
