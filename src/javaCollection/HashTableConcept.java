package javaCollection;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		//it is similar to HashMap, but its synchronized
		//stores the value on the basis of key_value
		//key--> Object-->HashCode-->value
		//No null key and null value
		//contains unique value

		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		
		System.out.println(h.get(2));
		System.out.println(h.get("C"));
		
		h.put(3, "Tom");
		
		for(int i=0; i<h.size();i++) {
			System.out.println(h.get(i));
		}
		
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();
		h1.put(1, 100);

		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(1, "Tom");
		
		Hashtable h3 = new Hashtable();
		h3 = (Hashtable)h.clone();

		
		System.out.println(h);
		System.out.println(h3);
		
		//get the hashcode of the object:
		System.out.println("the hash code value of h3: " + h3.hashCode());

	}

}
