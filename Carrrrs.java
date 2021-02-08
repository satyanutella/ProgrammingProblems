package Assignment3;



class Carr
{
	
	
	int yearModel;
	String make;
	int speed=5;
	public Carr(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
	}
	public int getYearModel() {
		return yearModel;
	}
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	void accelerate()
	{
		System.out.println(speed+5);
	}
	void brake()
	{
		System.out.println(speed-5);
	}
	

	
	
}

public class Carrrrs {

	public static void main(String[] args) {
		
		Carr cr = new Carr(1965,"BATMOBILE");
		System.out.println(cr.getYearModel());
		System.out.println(cr.getMake());
		cr.accelerate();
		cr.brake();
		
		
	}

}
