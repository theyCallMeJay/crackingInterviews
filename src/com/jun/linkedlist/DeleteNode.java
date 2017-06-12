/*2.3
implement an algorithm to delete a node,
given access to that node only
*
*/

package com.jun.linkedlist;


public class DeleteNode {

	public static void main(String[] args) {
		Node node = new Node(1);
		node.next = new Node(2);
		Node mid = new Node(3);
		node.next.next = mid;
		node.next.next.next = new Node(4);
		node.next.next.next.next = new Node(5);
		deleteMiddleNode(mid);
		displayNode(node);
	}
	
	private static void displayNode(Node node) {
		if (node == null) {
			System.out.println("This list is null");
		}
		
		while (node.next != null) {
			System.out.println(node.getData());
			node = node.next;
		}
	}

	public static void deleteMiddleNode(Node mid){
		Node current = mid;
		if (mid == null || mid.next == null) {
			System.out.println("This node is not valid");
		}
		
		Node next = current.next;
		current.data = next.data;
		current.next = next.next;
		
		
	}

}
