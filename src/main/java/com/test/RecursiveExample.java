package com.test;


public class RecursiveExample {
	
	 public static int sumNumbers(int n){
	      if(n<=0){
	         return 0;
	      }
	      
	      return n+sumNumbers(n-1);
	 }  
	 //space complexcity
	 public static int pairsumSequence(int n){
		 int total =0;
		 for(int i=0;i<=n;i++) {
			 total=total+pairsum(i,i+1);
		 }
	      
	     return total;
	 }  	

	private static int pairsum(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pairsumSequence(3));
	}

}
