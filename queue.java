import java.io.*;
import java.util.*;

class queue1<T> {
	int front = -1, rear = -1;
	ArrayList<T> AL;
	int size;
	
	queue1(int size)
	{
		this.size = size;
		this.AL = new ArrayList<T>(size);
	}
	void enqueue(T value)
	{
		if (this.empty()) {
			front = 0;
			rear = 0;
			AL.add(value);
			front++;
		}
		else if(front<size) {
			AL.add(value);
			front++;
		}
		else if(this.full()) {
			System.out.println("Queue is full");
		}
	}
	
	void dequeue()
	{
		if (this.empty())
			System.out.println("Queue is empty");
		else if (front == rear) {
			front = rear = -1;
		}
		else {
			rear++;
			size=size+1;
		}
	}
	
	void peek()
	{
		if (rear == -1 || front == rear)
			System.out.println("Queue is Empty");
		else
			System.out.println(AL.get(rear));
	}
	
	boolean empty()
	{
		if ((front == -1 && rear == -1)||(front==rear))
			return true;
		return false;
	}
	
	boolean full() {
		if(front==size)
			return true;
		return false;
	}
	
	void show()
	{
		if (this.empty())
			System.out.println("Queue is Empty");
		else {
		String Ans = "";
		for (int i = rear; i < front; i++) {
			Ans += String.valueOf(AL.get(i)) + " ";
		}
		//Ans += String.valueOf(AL.get(front));
		System.out.println(Ans);
		}
	}
}

public class queue {
		public static void main(String args[])
		{
			int n,number=0;
			int integer1,string1,double1;
			boolean inte,stri,doub;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for Integer array or 0 for not : ");
			integer1=sc.nextInt();
			System.out.println("Enter 1 for String array or 0 for not : ");
			string1=sc.nextInt();
			System.out.println("Enter 1 for Double of array or 0 for not : ");
			double1=sc.nextInt();
			inte=(integer1==1)?(true):(false);
			stri=(string1==1)?(true):(false);
			doub=(double1==1)?(true):(false);
			System.out.println("Enter the size of array : ");
			n=sc.nextInt();
			queue1<Integer> q1 = new queue1<>(n);
			queue1<String> q2 = new queue1<>(n);
			queue1<Double> q3 = new queue1<>(n);
			while(inte) {
			System.out.println("\nPress 1 for enqueue : \nPress 2 for dequeue  : \nPress 3 for Peek : \nPress 4 for Show : ");
			System.out.println("\nEnte your choice : ");
			number=sc.nextInt();
			switch(number) {
			case 1:
				System.out.println("Enter the value : ");
				q1.enqueue(sc.nextInt());
				break;
			case 2:
				q1.dequeue();
				break;
			case 3:
				q1.peek();
				break;
			case 4:
				q1.show();
				break;
			default:
				System.out.println("Wrong Input");
			}
			}
			while(stri) {
				System.out.println("\nPress 1 for enqueue : \nPress 2 for dequeue  : \nPress 3 for peek : \nPress 4 for Show : ");
				System.out.println("\nEnte your choice : ");
				number=sc.nextInt();
				switch(number) {
				case 1:
					System.out.println("Enter the value : ");
					q2.enqueue(sc.next());
					break;
				case 2:
					q2.dequeue();
					break;
				case 3:
					q2.peek();
					break;
				case 4:
					q2.show();
					break;
				default:
					System.out.println("Wrong Input");
				}
				}
			while(doub) {
				System.out.println("\nPress 1 for enqueue : \nPress 2 for dequeue  : \nPress 3 for Peek : \nPress 4 for Show : ");
				System.out.println("\nEnte your choice : ");
				number=sc.nextInt();
				switch(number) {
				case 1:
					System.out.println("Enter the value : ");
					q3.enqueue(sc.nextDouble());
					break;
				case 2:
					q3.dequeue();
					break;
				case 3:
					q3.peek();
					break;
				case 4:
					q3.show();
					break;
				default:
					System.out.println("Wrong Input");
				}
				}
		}

}
