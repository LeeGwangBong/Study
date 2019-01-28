
public class main {
	public static void main(String[] args) {
		
		int result = factorial(4); //4 * 3 * 2 * 1 =24
		
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		if(n == 0)
			
			return 1;
		
		else
			return n * factorial(n-1);
	}
}
