package com.jnit.arraylistexamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.jnit.customerordering.Customer;

public class Values {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(7);
		list.add(3);
		list.add(6);
		list.add(7);
		list.add(12);
		System.out.println("Displaying the elements in list before removing:" +list);
		list.remove(2);
		System.out.println("Displaying the elements in list after removing:" +list);
		// using foreach
		System.out.println("***using foreach***");
		for(int li: list){
			System.out.println(li);
		}
		list.add(100);
		list.add(56);
		Collections.sort(list);
		System.out.println("list after sorting " +list);
		// usng Iterator
		Iterator itr = list.iterator();
		System.out.println("***using iterator***");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
