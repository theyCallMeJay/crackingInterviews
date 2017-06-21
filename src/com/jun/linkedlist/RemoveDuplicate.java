package com.jun.linkedlist;

public class RemoveDuplicate {
	
	public static void main(String[] args){
		LinkedListNode head = new LinkedListNode(1);
		head.next = new LinkedListNode(1);
		head.next.next = new LinkedListNode(1);
		head.next.next.next = new LinkedListNode(5);
		head.next.next.next.next = new LinkedListNode(4)	;
		LinkedListNode resultList = removeDuplicatedNodes(head);
		displayList(resultList);
	}
	
	public static void displayList(LinkedListNode head){
		LinkedListNode current = head;
		
		while (current.next != null) {
			System.out.println(current.getData());
			current = current.next;
		}
	}
	
	
	
	
	
	
	public static LinkedListNode removeDuplicatedNodes(LinkedListNode head){
		LinkedListNode current = head;
		
		while (current.next != null) {
			LinkedListNode runner = current;
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
