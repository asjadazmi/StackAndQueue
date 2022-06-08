package com.bridgelabz;

public class StackMain {
	public static void main(String[] args) {
		Stack num =new Stack();
		num.push(23);
		num.push(34);
		num.push(76);
		num.push(78);
		num.push(79);
		num.push(86);
		System.out.println("deleted "+num.pop());
		System.out.println("peek "+num.peek());
		num.peek();
		System.out.println("boolean "+num.isEmpty());
		System.out.println("size"+num.size());
		num.show();
		
	}

}
