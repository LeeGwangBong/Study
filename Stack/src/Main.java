class Stack {

	int top;
	int[] stack;
	int size;

	public Stack(int size) {                   //스택생성
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public int peek() {                        //스택 가장위에 있는 값 리턴
		return stack[top];        
	}

	public void push(int value) {              //스택에 값 추가
		stack[++top] = value;
		System.out.println(stack[top] + " PUSH !");
	}

	public int pop() {                         //스택 가장 위에 있는 값 제거
		System.out.println(stack[top] + " POP !");
		return stack[top--];
	}

	public void printStack() {                 //현재 스택 출력
		System.out.println("-- STACK LIST --");
		for (int i = top; i >= 0; i--)
			System.out.println(stack[i]);
		System.out.println("-- END OF LIST --");
	}
}
public class Main {
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);            //테스트 12345 추가 후 543 제거
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		
		stack.printStack();
		
		stack.pop();
		stack.pop();
		stack.pop();
		
		stack.printStack();
	}	
}
