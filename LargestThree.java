package com.bridgelabz;

public class LargestThree {
	public static void main(String[] args) {

        double n1 = 2.9, n2 = 3.6, n3 = 4.4;

        if( n1 >= n2 && n1 >= n3)
            System.out.println(n1 + " is the largest number.");

        else if (n2 >= n1 && n2 >= n3)
            System.out.println(n2 + " is the largest number.");

        else
            System.out.println(n3 + " is the largest number.");
    }
}
