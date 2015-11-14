package com.artcoffer.utilities.list;

public class LinkedList<T> {
	
	Node<T> head = null;

	public void offer(T nextValue){
		Node<T> nextNode = new Node<>(nextValue);
		if(head == null){
			head = nextNode;
		}else{
			Node<T> last = nextNode;
			Node<T> currentNode = head;
			while(currentNode.next != null){
				 currentNode = currentNode.next;
			}
			 currentNode.next = last;
		}
	}
	
	public Node<T> poll(){
		return head;
	}
	
	public void reverse(){
		Node<T> previous = null;
		Node<T> nextNode;
		
		while(head != null){
			nextNode = head.next;
			head.next = previous;
			previous = head;
			head = nextNode;
		}
		head = previous;
	}
	
	@Override
	public String toString(){
		if(head == null){
			return "[]";
		}
		StringBuilder linkedList = new StringBuilder();
		linkedList.append("[").append(head.value).append(",");
		Node<T> current = head;
		while(current.next != null){
			linkedList.append(current.next);
			current = current.next;
			if(current.next != null){
				linkedList.append(",");
			}
		}
		linkedList.append("]");
		return linkedList.toString();
	}
	
}
