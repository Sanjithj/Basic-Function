package com.bridgelabz;

public class PowerTwo {
	public static void main(String[] args) {
		
		int n = Integer.parseInt(args[0]);
		
		//count from 0 to n
		int i= 0; 
		int powerofTwo = 1; //i th power of two
		
		// repeat i equal to n
		while(i <=n) {
			System.out.println(i + " " + powerofTwo);
			powerofTwo = 2 * powerofTwo;		//double to get next one
			i = i + 1;
		}
		
	}
}
