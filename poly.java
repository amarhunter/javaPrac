class person 
{
	void walk()
{
System.out.println("can run...");
}
}
class Employee extends person{
	void walk()
	{
		System.out.println("Running fast...");
	}


public static void main(String args[])
{
	person p = new Employee();
	p.walk();
}
}