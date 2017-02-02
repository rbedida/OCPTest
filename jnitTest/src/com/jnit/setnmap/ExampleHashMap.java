package com.jnit.setnmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ExampleHashMap {

	public static void main(String[] args) {
		
		HashMap<String, Integer> m = new HashMap<>();
		m.put("red", 500);
		m.put("black", 200);
		m.put("orange", 800);
		m.put("black", 600);
		System.out.println("values in the map" +m);

		Set<Entry<String, Integer>> s1 = m.entrySet();
		System.out.println(s1);
		Iterator<Entry<String, Integer>> itr = s1.iterator();
		while(itr.hasNext()){
			Map.Entry m1 = (Map.Entry)itr.next();
			System.out.println(m1.getKey() + "---" + m1.getValue());
		}

	}

}
