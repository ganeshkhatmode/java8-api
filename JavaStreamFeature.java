package com.tss.stream.api;

import java.util.Arrays;
import java.util.List;

public class JavaStreamFeature {

	public static void main(String[] args) {
		List<String> fruits = Arrays.asList("Mango", "Apple","Banana","Biberry");
		System.out.println("Output of JDK1.7:");
		/**
		 * In jdk1.7 to print fruit name
		 */
		for(String fruitName : fruits) {
			System.out.println(fruitName);
		}
		
		System.out.println("Output of JDK1.8:");
		/**
		 * In jdk1.8 to print fruits name
		 */
		fruits.stream()
		         .forEach(System.out::println);
		
		System.out.println("Example of filter :: ");
		System.out.println("Output of filter in JDK1.7:");
		/**
		 * Print fruit names except Mango (in JDK1.7)
		 */
		for(String fruitName : fruits) {
			if(!fruitName.equals("Mango")) {
				System.out.println(fruitName);
			}
		}
		System.out.println("Output of filter in JDK1.8:");
		fruits.stream()
		     .filter(fruitName->!fruitName.equals("Mango"))
		     .forEach(System.out::println);
		
		
	}

}
