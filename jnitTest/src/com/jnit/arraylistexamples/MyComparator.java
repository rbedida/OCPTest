package com.jnit.arraylistexamples;

import java.util.Comparator;

import com.jnit.customerordering.Customer;

public class MyComparator implements Comparator<Customer>{

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		String s1 = c1.getfName().toString();
		String s2 = c2.getfName().toString();
		return s1.compareTo(s2);
	}
	
}
