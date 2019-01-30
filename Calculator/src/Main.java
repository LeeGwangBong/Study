class Cal{
	int top;
	int []cal;
	int size;
	
	public Cal(int size) {
		
		this.top= -1;
		this.size = size;
		cal = new int [size];
		  
	}
	
	public boolean empty(){
			
		return (top==-1);
	}
	
	public boolean full() {
		
		return (size-1==top);
	}
	

	public void push(int value) {
		
		top++;
		cal[top]=value;
		System.out.println(value+" < - PUSH ! ");
	}
	
	public int pop() {
		
		System.out.println(cal[top]+" <- POP ! ");
		top--;
		return cal[top];

	}
	
	public void add() {
		if(empty()) {
			System.out.println("숫자가 부족합니다. 입력하세요");
		}
		else {
		System.out.println(cal[top]+" + "+cal[top-1]+" = "+(cal[top]+cal[top-1])+" <- ADD ! ");
		top--;		
		cal[top]=cal[top+1]+cal[top];
		}
	}
	public void sub() {
		if(empty()) {
			System.out.println("숫자가 부족합니다. 입력하세요");
		}
		else {
		System.out.println(cal[top-1]+" - "+cal[top]+" = "+(cal[top-1]-cal[top])+" <- SUB ! ");
		top--;		
		cal[top]=cal[top]-cal[top+1];
		}
	}
	public void mul() {
		if(empty()) {
			System.out.println("숫자가 부족합니다. 입력하세요");
		}
		else {
		System.out.println(cal[top-1]+" X "+cal[top]+" = "+(cal[top-1]*cal[top])+" <- MUL ! ");
		top--;		
		cal[top]=cal[top]*cal[top+1];
		}
	}
	
	public void div() {
		if(empty()) {
			System.out.println("숫자가 부족합니다. 입력하세요");
		}
		else {
		System.out.println(cal[top-1]+" / "+cal[top]+" = "+cal[top-1]/cal[top]+" <- DIV ! ");
		top--;		
		cal[top]=cal[top]/cal[top+1];
		}
	}
	public void printStack() {                 //현재 스택 출력
		System.out.println("-- STACK LIST --");
		for (int i = top; i >= 0; i--)
			System.out.println(cal[i]);
		System.out.println("-- END OF LIST --");
	}
}
public class Main { 
	public static void main(String[] args) {
		
		Cal cal = new Cal(20);
		cal.push(10);
		cal.push(2);
		cal.push(2);
		cal.push(5);
		cal.push(3);
		cal.push(1);
		cal.printStack();
		
		cal.add();
		cal.sub();
		cal.mul();
		cal.div();
		cal.printStack();
	}
}
