/*1.4 4th edition
decide if two strings are anagram*/


package com.jun.arraysStrings;


public class DecideAnagram {
	
	public static void main(String[] args){
		String a = "abcde";
		String b = "ecdab";
		
		System.err.println(determineAnagram(a, b));
	}
	
	
	
	public static boolean determineAnagram(String a, String b){
		
		boolean result =  false;
		
		String a1 = a.trim();
		String b1 = b.trim();
		
		int[] letters = new int[256];
		
		char[] a1Array = a1.toCharArray();
		char[] b1Array = b1.toCharArray();
		
		for (char c : a1Array) {
			for (int i = 0; i < a1Array.length; i++) {
				if (c == a1Array[0]) {
					letters[c] ++;
				}
			}
		}
		
		for (char c : b1Array) {
			int count = 0;
			for (int i = 0; i < b1Array.length; i++) {
				if (c == b1Array[i]) {
					count ++;
				}
			}
			
			if (count == letters[c]) {
				result = true;
			}else {
				result = false;
			}
			
		}
		

		return result;
	}
}
