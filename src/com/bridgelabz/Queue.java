package com.bridgelabz;

public class Queue {
	int queue[] =new int[5];
	
	int size;
	int front;
	int rear;
	public void enqueue(int data){
		queue[rear]=data;
		rear++;
		size++;
	}
	public int deQueue() {
		int data=queue[front];
		front=front+1;
		size=size-1;
		return data;
	}
	public void show() {
		System.out.println("element");
		for(int i=0;i<size;i++) {
			System.out.println(queue[front+i]+ " ");
		}
	}
}
