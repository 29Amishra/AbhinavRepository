package Package1;

public class Arithmetic2 {
	public int multiply(int a, int b)
	{
	int c= a*b;
	System.out.println("The multiplication is="+c);
return c;
}
	public int sum(int d, int e) {
		int f=d+e;
		System.out.println("The summation is="+f);
		return f;
	}
	public int sub(int g, int h)
	{ int i= g-h;
	System.out.println("The substraction is="+i);
	return i;
		}
	public void divide(int j, int k) {
	int	l=j/k ;
		System.out.println("The final result is="+l);
		}
	public static void main(String[] args) {
		Arithmetic2 obj= new Arithmetic2();
		int multiplication1=obj.multiply(10, 2);
		int sumresult=obj.sum(multiplication1, 2);
		int subresult=obj.sub(sumresult, 2);
		int multiplication2=obj.multiply(subresult, 2);
		obj.divide(multiplication2, 2);
	}
	}
