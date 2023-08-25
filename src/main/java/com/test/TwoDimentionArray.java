package com.test;

import java.util.Arrays;

public class TwoDimentionArray {
	
	public static void main (String args[]) {
		int[][] intArray =null;
		
		intArray = new int[2][2];
		
		intArray[0][0]=1;
		intArray[0][1]=2;
		intArray[1][0]=3;
		intArray[1][1]=4;
		
		System.out.println(Arrays.deepToString(intArray));
		
		String strArray[][]= {{"a","b"},{"c","d"}};
		System.out.println(Arrays.deepToString(strArray));
	}

}
