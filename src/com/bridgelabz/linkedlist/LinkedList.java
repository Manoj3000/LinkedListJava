package com.bridgelabz.linkedlist;

class Node{
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}
public class LinkedList {
	
	static Node head;
	
	public void add(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	
	public void printAllList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}
}
