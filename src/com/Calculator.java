package com;

public class Calculator implements ICalculator {

	@Override
	public int add(int a, int b) {
		
		syso("From JanasBr");
		syso("cahnged at 11:23 on 25/12/2019");
		
		return a+b;
	}

	@Override
	public int substract(int x, int y) {
	
		return x-y;
	}

}
