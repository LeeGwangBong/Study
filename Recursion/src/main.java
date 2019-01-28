
public class main {
	public static void main(String[] args) {
		
		int result = func(4); //func(5)+func(4)+func(3)+func(2)+func(1)= 15
		                              
		System.out.println("result :"+result);
		
	}
	
	private static int func(int n) {
		if (n == 0)
			return 0;
		else
			return n + func(n-1); //재귀 : 자기 자신을 호출,recursion 
	}
}
