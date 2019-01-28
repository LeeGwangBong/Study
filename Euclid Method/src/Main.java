
public class Main {
	public static void main(String[] args) {
		int result = gcd(20,25);
		
		System.out.println(result);
	}
	
	public static int gcd(int m, int n) {
		if( m < n ) {                           //swap
			int tmp = m;
			m = n ;
			n = tmp;
		}
		if( m % n == 0) {                      
			return n;
		}
		else
			return gcd(n, m % n);
	}
}
