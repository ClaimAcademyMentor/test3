package com.test;

public class Main {

	public static void main(String[] args) {
		// Declare futureValue
		double futureValue;

		// Define the value of futureValue as the value of the getFutureValue function
		futureValue = getFutureValue();

		// Print the future value on the console
		System.out.println("The Future Value is " + futureValue);
		System.out.println("The future is now");
	}

	// Define the futureValue function
	public static double getFutureValue() {
		// Declare and initialize the variable
		double presentValue = 20000;
		double rate = .045;
		double time = 15;
		double futureValue = 0;

		// Perform the calculation using the given formula and return its value
		futureValue = presentValue * (1 + rate * time);
		return futureValue;

		// Close the main method
	}
}
