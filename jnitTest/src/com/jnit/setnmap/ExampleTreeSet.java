package com.jnit.setnmap;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import com.jnit.arraylistexamples.MyComparator;
import com.jnit.customerordering.Customer;

public class ExampleTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Customer> tc = new TreeSet<>(new MyComparator());
		Customer c = new Customer(1, "ram", "bedida", "24");
		Customer c1 = new Customer(2, "rameshwar", "rao", "25");
		Customer c2 = new Customer(3, "ramesh", "verma", "26");

		tc.add(c);
		tc.add(c1);
		tc.add(c2);

		System.out.println("Displaying the elements in set: " +tc);
		

	}

}
