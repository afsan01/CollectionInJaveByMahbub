package javaCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Bang Theory");
		tvSeries.add("The Walking Dead");
		tvSeries.add("Prison Break");
		
		//1.Using java 8 with to each loop and lambda expression:
		
		tvSeries.forEach(shows ->{
			System.out.println(shows);
			
		});
		System.out.println("************Print Using Iterator******************");
		//2. using Iterator
		Iterator<String> it = tvSeries.iterator();
		
		while(it.hasNext()) {
			
			String shows =it.next();
			System.out.println(shows);

		}
		//3. using iterator and java 8 forEachRemaining() method
		System.out.println("****using iterator and java 8 forEachRemaining**********");
		
		it = tvSeries.iterator();
		it.forEachRemaining(show ->{
			System.out.println(show);
		});
		
		//4. Using forEach loop
		System.out.println("****Using forEach loop**********");
		for (String show : tvSeries) {
			System.out.println(show);
		}
		
		//5. using for loop with order/index:
		System.out.println("****using for loop with order/index:**********");
		for (int i =0; i<tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		

	}

}
