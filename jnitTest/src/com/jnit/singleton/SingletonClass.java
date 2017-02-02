package com.jnit.singleton;


public class SingletonClass {
	
	private static SingletonClass sc = null;
	private SingletonClass(){
		
	}
	private static SingletonClass getSingletonClass(){
		if(sc == null){
			sc = new SingletonClass();
		}
		return sc;
	}
	public static void main(String[] args) {
		SingletonClass sc1 = SingletonClass.getSingletonClass();
	}
}