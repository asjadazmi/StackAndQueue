package com.bridgelabz;

import java.util.Scanner;
class Queueu{
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			super();
			this.data = data;
			this.next = next;
		}
		Node head=null;
}
	private Node head;
	void enqueue(int data)
	{
		Node new_node=new Node(data);
		 if(head==null) {
			 head=new_node;
		 }
		 else {
			 new_node.next=head;
			 head=new_node;
		 }
	}
	public int dequeue() {
		if(head == null) {
			return 0;
		}else {
			Node temp = head;
			head = temp.next;
			return temp.data;
		}
	}
	 void display() {
		 Node temp=head;
		 while(temp!=null) {
			 System.out.print(temp.data+" ");
			 temp=temp.next;
		 }
	 }
		
	}


public class QueueLinkedList {
	public static void main(String[] args) {
		int d;
		Scanner sc=new Scanner(System.in);
		Queueu queue=new Queueu();
		
		queue.enqueue(76);
		queue.enqueue(87);
		queue.enqueue(78);
		queue.dequeue();
		queue.display();
	}}


	


