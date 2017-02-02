package com.jnit.arraylistexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.jnit.customerordering.Customer;

public class SortingExample {

	public static void main(String[] args) {
		
		List<Customer> lc = new ArrayList<>();
		Customer c = new Customer(1, "ram", "bedida", "24");
		Customer c1 = new Customer(2, "rameshwar", "rao", "25");
		Customer c2 = new Customer(3, "ramesh", "verma", "26");

		lc.add(c);
		lc.add(c1);
		lc.add(c2);
		
		System.out.println("Displaying the elements in list before sorting:" +lc);
		
		System.out.println("*** After Using Comparator***");
		Collections.sort(lc, new MyComparator());
		System.out.println(lc);


	}

}
