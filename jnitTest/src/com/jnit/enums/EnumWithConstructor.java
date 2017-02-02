package com.jnit.enums;

enum ExampleEnum {
	INFANTS("infant"), TEENAGERS("teens"), ADULTS("adults");
	private String value;
	private ExampleEnum(String value){
		this.value = value;
	}
	public void printValue(){
		System.out.println(value);
	}
}
public class EnumWithConstructor{
	public static void main(String[] args) {
		ExampleEnum.TEENAGERS.printValue();
		ExampleEnum.ADULTS.printValue();
	}
}