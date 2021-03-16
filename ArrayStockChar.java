package pracs;

public class ArrayStackChar {
	
	private int size;
	private char[] stackArray;
	private int top;
	
	public static void main(String[] args) {
		ArrayStackChar theStack = new ArrayStackChar(10);
		theStack.push('a');
		theStack.push('b');
		theStack.push('c');
		theStack.push('d');
		System.out.println(theStack.head());
		System.out.println(theStack.isEmpty());
		theStack.display();
		System.out.println();
		System.out.print(theStack.head());
		System.out.print("  ");
		while(!theStack.isEmpty()) {
			char value = theStack.pop();
			System.out.print(value);
			System.out.print("  ");
		}
		
	}
	public ArrayStackChar(int s) {
		size = s;
		stackArray = new char[size];
		top = -1;
	}
		

	public int getHeight() {
		return stackArray.length;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
	public void push(char i) {
		stackArray[++ top] = i;
	}
	public char pop() {
		return stackArray[top--];
	}
	public char head() {
		return stackArray[top];
	}
	public void display() {
		for(int i = 0 ; i<= top ; i++) {
			System.out.print(stackArray[i]);
			System.out.print(" ");
		}
	}

}

