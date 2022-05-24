import java.io.*;
import java.util.*;
class stack1<T> {

	ArrayList<T> AL;
	int top = -1;
	int size;

	stack1(int size)
	{
		this.size = size;
		this.AL = new ArrayList<T>(size);
	}

	void push(T value)
	{
		if (top + 1 == size) {
			System.out.println("Stack is full");
		}
		else {
			top = top + 1;
			if (AL.size() > top)
				AL.set(top, value);
			else
				AL.add(value);
		}
	}

	void pop()
	{
		if (top == -1)
			System.out.println("Stack is Empty");
		else
			top--;
	}
	
	void peek()
	{
		if (top == -1)
			System.out.println("Stack is Empty");

		else
			System.out.println( AL.get(top));
	}

	boolean empty() {
		return top == -1;
		}
	
	void search(T value) {
		int count=0;
		if(empty()) {
			System.out.println("Stack is Empty");
		}
		else {
		for(int i=top; i>=0; i-- ) {
			if(AL.get(i).equals(value)) {
				System.out.println("position : "+i);
			}
			else {
				count++;
			}
		}
		}
		if(count==top+1) {
			System.out.println("\nvalue is not there");
		}
	}

	void show()
	{
		if (this.empty())
			System.out.println("Stack is Empty");
		else {
		String Res = "";
		for (int i = top; i >= 0; i--) {
			Res += String.valueOf(AL.get(i)) + " ";
		}
		System.out.println(Res);
		}
	}
}
public class stack {

	public static void main(String[] args)
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
		stack1 <Integer> s1 = new stack1<>(n);
		stack1 <String> s2 = new stack1<>(n);
		stack1 <Double> s3 = new stack1<>(n);
		while(inte) {
		System.out.println("\nPress 1 for Push : \nPress 2 for Pop  : \nPress 3 for Peek : \nPress 4 for search : \nPress 5 for Show : ");
		System.out.println("\nEnte your choice : ");
		number=sc.nextInt();
		switch(number) {
		case 1:
			System.out.println("Enter the value : ");
			s1.push(sc.nextInt());
			break;
		case 2:
			s1.pop();
			break;
		case 3:
			s1.peek();
			break;
		case 4:
			System.out.println("Enter the number for search : ");
			s1.search(sc.nextInt());
			break;
		case 5:
			s1.show();
			break;
		default:
			System.out.println("Wrong Input");
		}
		}
		while(stri) {
			System.out.println("\nPress 1 for Push : \nPress 2 for Pop  : \nPress 3 for Peek : \nPress 4 for search : \nPress 5 for Show : ");
			System.out.println("\nEnte your choice : ");
			number=sc.nextInt();
			switch(number) {
			case 1:
				System.out.println("Enter the value : ");
				s2.push(sc.next());
				break;
			case 2:
				s2.pop();
				break;
			case 3:
				s2.peek();
				break;
			case 4:
				System.out.println("Enter the string for search : ");
				s2.search(sc.next());
				break;
			case 5:
				s2.show();
				break;
			default:
				System.out.println("Wrong Input");
			}
			}
		while(doub) {
			System.out.println("\nPress 1 for Push : \nPress 2 for Pop  : \nPress 3 for Peek : \nPress 4 for search : \nPress 5 for Show : ");
			System.out.println("\nEnte your choice : ");
			number=sc.nextInt();
			switch(number) {
			case 1:
				System.out.println("Enter the value : ");
				s3.push(sc.nextDouble());
				break;
			case 2:
				s3.pop();
				break;
			case 3:
				s3.peek();
				break;
			case 4:
				System.out.println("Enter the number for search : ");
				s3.search(sc.nextDouble());
				break;
			case 5:
				s3.show();
				break;
			default:
				System.out.println("Wrong Input");
			}
			}
	}
}
