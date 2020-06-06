package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static  void main(String[] args) {
		
		//dynamic Array:
		//it can contain duplicate value
		//its maintains insertion order
		//Its not Synchronized
		//its allow you random access to fetch element because it stores the calues on the basis of indexes
		
		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());//size of array
		
		ar.add(400);
		ar.add(500);
		System.out.println(ar.size());
		
		ar.add("Tom");
		ar.add("Hello");
		ar.add(12.33);
		ar.add('M');
		ar.add(600);
		System.out.println(ar.size());
		
		ar.remove(9);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(4));//to get the value from index
		System.out.println(ar.get(8));
		
		//To print all the values of ArrayList
		// for loop
		//Iterator
		
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		//no generic vs generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(100);
		//ar1.add("Tom"); not allow
		//ar1.add('T'); not allow
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("Tom");
		//ar2.add((100); not allow

		//ArrayList<E> ar3 = new ArrayList<E>(); when not sure what type of data type wants to store
		
		Employee e1 = new Employee("Mahbub",27,"QA");
		Employee e2 = new Employee("Tom",28,"Dev");
		Employee e3 = new Employee("Peter",29,"Admin");
		
		//create ArrayList
		ArrayList<Employee> ar4 =new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to travers tha value
		Iterator<Employee> it =ar4.iterator();
		while(it.hasNext()) {
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		//****************************
		//addall();= add 2 different array together
		//removeall();= remove all array
		//retainAll();= Print only the same value from 2 arraylist.

	}

}
