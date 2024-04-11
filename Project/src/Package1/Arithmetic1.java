package Package1;

public class Arithmetic1 {
public int sum(int a, int b)
{ int c= a+b ;
System.out.println("The sum is="+c);
return c;
}
public int sub(int d, int e) {
	int f= d-e;
	System.out.println("The substraction is="+f);
	return f;
}
public int multiply(int g, int h) {
	int i=g*h;
	System.out.println("The multiplication is="+i);
	return i;
}
public void divide(int j, int k) {
	int l= j/k ;
	System.out.println("The result is="+l);
	
}
public static void main(String[] args) {
	Arithmetic1 xyz= new Arithmetic1();
	int sumresult1= xyz.sum(10, 2);
int sumresult2=	xyz.sum(sumresult1, 2);
	int subresult= xyz.sub(sumresult2, 2);
	int multiplication= xyz.multiply(subresult, 2);
xyz.divide(multiplication, 2);

}
}
