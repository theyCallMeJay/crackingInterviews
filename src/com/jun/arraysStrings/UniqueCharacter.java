/*determine if a string has all unique characters*/

package com.jun.arraysStrings;

public class UniqueCharacter {
	
	
	public static void main(String[] args){
		String s = "adcde";
		
		System.out.println("The characters in the string is unique: " + isUnique(s));
	}
	
	
	public static boolean isUnique(String s){
		
		boolean[] char_set = new boolean[256];
		
		for (int i = 0; i < s.length(); i++) {
			
			int val = s.charAt(i);
			
			System.out.println(val);
			if (char_set[val]) {
				return false;
			}else {
				char_set[val] = true;
			}
		}
		return true;
	}
	
}
