package com.artcoffer.utilities.list;

public class AppLauncher {

	public static void main(String... args){
	
		LinkedList<String> linked = new LinkedList<>();
		linked.offer("1");
		linked.offer("2");
		linked.offer("3");
		linked.offer("4");
		Node<String> head = linked.poll();
		
		if(head != null){
			System.out.println("Head: " + head);
			System.out.println(linked);
		}
		
		linked.reverse();
		System.out.println("Head: " + head);
		System.out.println(linked);
		
	}
}
