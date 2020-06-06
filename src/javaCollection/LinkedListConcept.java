package javaCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		
		//add
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("RFT");
		
		//print:
		System.out.println("content of linkedlist:"+ ll);
		//addfirst
		ll.addFirst("Mahbubur");
		//addLast
		ll.addLast("Automation");
		System.out.println("content of linkedlist:"+ ll);

		//get:
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove forst and last element:
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist:"+ ll);
		
		ll.remove(2);

		System.out.println("content of linkedlist:"+ ll);

		//how to print all the values of linkedList:
		//for loop
		for(int i=0; i<ll.size(); i++) {
			System.out.println(ll.get(i));
		}
		//advance for loop
		System.out.println("Using advance for loop");
		for(String str : ll) {
			System.out.println(str);
		}
		//iterator
		System.out.println("Using Iterator");
		
		Iterator<String> it =ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		//whileloop
		
		System.out.println("Using while loop");

		int num =0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		

		
	}

}
