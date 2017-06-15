/*2.2 4th edition

find the nth element till the last element*/


package com.jun.linkedlist;

public class FindAnElement {

	public static void main(String[] args){
		Node node = new Node(1);
		node.next = new Node(2);
		node.next.next = new Node(3);
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		node.next.next.next.next.next = new Node(6);
		node.next.next.next.next.next.next = new Node(7);
		
		findNthElement(2, node);
	}
	
	//display the node
	public static void displayList(Node node){
		if (node == null) {
			System.out.println("This list is not valid");
		}
		
		Node n = node;
		while (n.next != null) {
			System.out.println(n.getData());
			n = n.next;
		}
	}	
	
	
	public static void findNthElement(int n, Node head){
		Node current = head;
		if (head == null) {
			System.out.println("this linked list null");
		}
		
		//retrieve the number of the list
		int counter = 1;
		while (current.next != null) {
			current = current.next;
			counter ++;
		}
		
		
		if (counter < n) {
			System.out.println("Number is too small");
		}
		
		//get the nth node
		int newCounter = 1;
		Node newCurrent = head;
		while (newCounter < n) {
			newCurrent = newCurrent.next;
			newCounter ++;
		}
		
		System.out.println(newCounter);
		
		while (newCurrent != null) {
			displayList(newCurrent);
			newCurrent = newCurrent.next;
		}
		
	}
}
