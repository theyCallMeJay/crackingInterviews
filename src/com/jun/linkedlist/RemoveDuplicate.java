package com.jun.linkedlist;

public class RemoveDuplicate {
	
	public static void main(String[] args){
		Node head = new Node(1);
		head.next = new Node(1);
		head.next.next = new Node(1);
		head.next.next.next = new Node(5);
		head.next.next.next.next = new Node(4);
		Node resultList = removeDuplicatedNodes(head);
		displayList(resultList);
	}
	
	public static void displayList(Node head){
		Node current = head;
		
		while (current.next != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
	
	
	
	
	
	
	public static Node removeDuplicatedNodes(Node head){
		Node current = head;
		
		while (current.next != null) {
			Node runner = current;
			while (runner.next != null) {
				if (runner.next.data == current.data) {
					runner.next = runner.next.next;
				}else {
					runner = runner.next;
				}
				
			}
			current = current.next;
			
		}
		
		return current;
		
	}
}
