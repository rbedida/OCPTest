package com.jnit.setnmap;

import java.util.HashSet;

public class ExampleHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(6);
		set.add(4);
		set.add(6); // duplicate
		set.add(9);
		System.out.println(set);
		

	}

}
