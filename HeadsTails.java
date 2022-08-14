package com.bridgelabz;

public class HeadsTails {
	
	public static void main(String[] args) {
	 
		int loopCount = 1;
		double result;
		double heads = 0;
		while(loopCount <= 1000)
		{
			result = Math.random();
			if(result <= 0.5)heads++;
			loopCount = loopCount+1;
			
		}
		double percentHeads = heads/1000*100;
		double percentTails = (1000-heads)/1000*100;
		System.out.println("percentage of head =" + percentHeads);
		System.out.println("percentage of tails =" + percentTails);
}
}
