package com.bridgelabz;
import java.util.Scanner;


class Stack12
{
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = next;
		}
        Node top=null;
	}
	private Node top;

	void push(int data ) {
		Node new_node=new Node(data);
		 if(top==null) {
			 top=new_node;
		 }
		 else {
			 new_node.next=top;
			 top=new_node;
		 }
	 }
	 void pop() {
		 if(top==null) {
			 System.out.println("it is emty");
		 }
		 else {
			 top=top.next;
		 }
	 }
	 void display() {
		 Node temp=top;
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	 }
	 
	
}

public class StackLinkedList {
	public static void main(String[] args) {
		int d;
		Scanner sc=new Scanner(System.in);
		Stack12 stack=new Stack12();
		stack.push(56);
		stack.push(54);
		stack.push(80);
		stack.pop();
		stack.display();
		
		
}}
