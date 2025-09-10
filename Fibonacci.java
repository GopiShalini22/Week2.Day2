package Week1.day2;

public class Fibonacci {
	
	public void fibonacci (int n)
	{
		int a = 0;
		int b = 1;
		for (int i=0; i<n; i++)
		{
			System.out.println(a+ " ");
			int c = a + b;
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) 
	{

		Fibonacci fb = new Fibonacci();
		fb.fibonacci(8);
	}

}
