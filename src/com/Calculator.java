package com;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int substract(int x, int y) {
		
		return x-y;
	}

}
