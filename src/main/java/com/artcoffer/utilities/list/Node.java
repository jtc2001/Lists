package com.artcoffer.utilities.list;

public class Node<T> {
	Node<T> next;
	T value;
	
	public Node(T value){
		this.value = value;
	}
	
	public Node<T> getNext(){
		return next;
	}
	
	public T getValue(){
		return value;
	}
	
	@Override
	public String toString(){
		return this.value.toString();
	}
	
}
