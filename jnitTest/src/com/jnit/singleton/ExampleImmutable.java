package com.jnit.singleton;

public final class ExampleImmutable {
	
	private final int value1;
	private final int value2;
	
	public int getValue1() {
		return value1;
	}
	public int getValue2() {
		return value2;
	}
	public ExampleImmutable(int value1, int value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}
}
