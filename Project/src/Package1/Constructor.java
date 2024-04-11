package Package1;

public class Constructor {
	public Constructor(int a, int b, int c) {
		
		System.out.println("Three Parameterized Constructor");
		
	}
public Constructor() {
	this(1,2,3);

	System.out.println("Default Constructor");
}
public Constructor(int a, int b, int c, int d) {
	this();
	System.out.println("Four Parameterized Constructor");
	
}
public Constructor(int a) {
	this(78, 89,84,5);
	System.out.println("One Parameterized Constructor");
	
}
public Constructor(int a, int b) {
	this(87);
	
	System.out.println("Two Parameterized Constructor");
	
}
public static void main(String[] args) {
	
Constructor ref=new Constructor(1,2);
}

}