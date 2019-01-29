class Queue{
	
	int front;
	int rear;
	int size;
	int [] queue;
	
	public Queue(int size) {
		
		front = -1;
		rear = -1;
		queue = new int [size];
		this.size = size;
	}
	
	public boolean empty() {
		return(front == rear);
	}
	
	public boolean full() {
		return(rear == this.size-1);
	}
	
	public void enQueue(int value) {
		if(full()) {
			System.out.println(" Array Queue is full ! ");
		}
		else {
		queue[++rear] = value;
		System.out.println("Inserted Item : "+value);
		}
	}
	
	public void deQueue() {
		if(empty()) {
			System.out.println(" Array Queue is empty ! ");
		}
		else {
			++front;
		}
	}
	
	public int peek() {
		if(empty()) {
			System.out.println(" Array Queue is empty ! ");
			return 0;
		}
		else 
			return queue[front+1];
	}
	
	public void printQueue() {
		if(empty()) {
			System.out.println(" Array Queue is empty ! ");
		}
		else {
			System.out.println(" Array Queue >> ");
			for(int i = front+1; i<=rear; i++) {
				System.out.println(queue[i]);	
			}
		}
	}
}
public class Main {
	public static void main(String[] args) {
		Queue Q = new Queue(5);
		
		Q.enQueue(1);
		Q.enQueue(2);
		Q.enQueue(3);
		Q.enQueue(4);
		Q.enQueue(5);
		Q.printQueue();
		
		Q.deQueue();
		Q.deQueue();
		Q.deQueue();
		Q.printQueue();
	}

}
