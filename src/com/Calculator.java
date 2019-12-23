package com;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int substract(int x, int y) {
		System.out.println("Subtract method called");
		System.out.println("Subtract method called");
				System.out.println("add method called");

		
		return x-y;
	}

}
