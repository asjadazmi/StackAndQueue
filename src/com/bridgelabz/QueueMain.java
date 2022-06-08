package com.bridgelabz;

public class QueueMain {
	public static void main(String[] args) {
		Queue q=new Queue();
		q.enqueue(5);
		q.enqueue(7);
		q.enqueue(53);
		q.enqueue(454);
		q.deQueue();
		
		q.show();

}}
