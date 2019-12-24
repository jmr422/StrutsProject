package com;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		
syso("changed from local");
syso("changed today 24122019");
syso("changed today 24122019 second time");

syso("changed today 25122019 at 00:10 AM");
syso("changed today 25122019 at 00:28 AM");

		return a+b;
	}

	@Override
	public int substract(int x, int y) {
	
		return x-y;
	}

}
