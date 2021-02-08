package training;

interface Drinks
{
	int minTemperature(int mintemp);
	int maxTemperature(int maxtemp);
}


class Coffee implements Drinks
{

	@Override
	public int minTemperature(int mintemp) {
		System.out.println("coffee minimun temp is "+mintemp);
		return 0;
	}

	@Override
	public int maxTemperature(int maxtemp) {
		System.out.println("coffee max temp is "+maxtemp);

		return 0;
	}
	
}

class Tea implements Drinks
{

	@Override
	public int minTemperature(int mintemp) {
		System.out.println("tea minimun temp is "+mintemp);
		return 0;
	}

	@Override
	public int maxTemperature(int maxtemp) {
		System.out.println("tea max temp is "+maxtemp);
		return 0;
	}
	
}
public class InterDemo {

	public static void main(String[] args) {
		
		Drinks dk = new Coffee();
		dk.maxTemperature(35);
		dk.minTemperature(27);
		
		Drinks d = new Tea();
		d.maxTemperature(38);
		d.minTemperature(24);
	}

}
