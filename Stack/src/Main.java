class Stack {

	int top;
	int[] stack;
	int size;

	public Stack(int size) {                   //���û���
		top = -1;
		stack = new int[size];
		this.size = size;
	}

	public int peek() {                        //���� �������� �ִ� �� ����
		return stack[top];        
	}

	public void push(int value) {              //���ÿ� �� �߰�
		stack[++top] = value;
		System.out.println(stack[top] + " PUSH !");
	}

	public int pop() {                         //���� ���� ���� �ִ� �� ����
		System.out.println(stack[top] + " POP !");
		return stack[top--];
	}

	public void printStack() {                 //���� ���� ���
		System.out.println("-- STACK LIST --");
		for (int i = top; i >= 0; i--)
			System.out.println(stack[i]);
		System.out.println("-- END OF LIST --");
	}
}
public class Main {
	public static void main(String[] args) {
		
		Stack stack = new Stack(5);            //�׽�Ʈ 12345 �߰� �� 543 ����
		
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
