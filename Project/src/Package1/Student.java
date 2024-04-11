package Package1;

public class Student 
{
	int age;
	int rollno;
	public void display1()
	{	System.out.println("Welcome to all of you");
}
	public void display2() 
	{
		System.out.println("automation is very easy");
	}
	public static void main(String[] args) {
		Student obj1= new Student();
		obj1.display1();
		obj1.display2();
		obj1.age=29;
		System.out.println("The Age is="+obj1.age);
		obj1.rollno=51;
		System.out.println("The Roll no. is="+obj1.rollno);
	}
	
}