package training;

class employee
{
	int empid;
	String name;
	String dept;
	double salary;
	
	void displayempdetails()
	{
		System.out.println("id is "+empid);
		System.out.println("id is "+name);
		System.out.println("id is "+dept);
		System.out.println("id is "+salary);
	}
	
	String Checkforloanoption()
	{
		if(salary>50000)
		{
			return "you can apply for loan";
		}
		else
		{
			return "you cannot apply for loan";
		}
	}
}




public class Emp {

	public static void main(String[] args) {
		
		System.out.println("emp demo");
		
		employee ramesh = new employee();
		employee suresh = new employee();
		ramesh.empid=100;
		ramesh.name="ramesh";
		ramesh.dept="hr";
		ramesh.salary=45000.0;
		
		ramesh.displayempdetails();
		
		System.out.println(ramesh.Checkforloanoption());
		
	}

}
