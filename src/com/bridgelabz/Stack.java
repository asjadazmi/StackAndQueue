package com.bridgelabz;

import java.util.LinkedList;

public class Stack {
	int[] Stack=new int[10];
	LinkedList<Integer> Stack1 = new LinkedList<>();
	int top=0;
	public void push(int data) {
		Stack[top]=data;
		top++;
	}

	
	public int pop() {
		int data;
		top--;
		data=Stack[top];
		Stack[top]=0;
		return data;
	}
	public int size() {
		return top;
	}
	public boolean isEmpty() {
		return top<=0;
	}
	public int peek() {
		int data;
		data=Stack[top-1];
				return data;
	}
	public void show() {
		for(int n:Stack){
			System.out.println(n);
		}
	
	}
}
