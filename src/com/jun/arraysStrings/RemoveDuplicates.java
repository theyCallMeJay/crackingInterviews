/*1.3
 * 
 * remove duplicated characters from a string*/


package com.jun.arraysStrings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void main(String[] args){
		String s = "abcdefgggggggggggh  iijjjkls";
		System.out.println(removeDuplicatedChar(s));
	}
	
	
	public static String removeDuplicatedChar(String s){
		String result = "";
	
		
		if (s == null || s.trim().length() < 1) {
			return "This string is not available";
		}
		
		Set<Character> chartSet = new HashSet<>();
		
		for (int i = 0; i < s.length(); i++) {
			chartSet.add(s.charAt(i));
		}
		
		for (Character character : chartSet) {
			result += character;
		}
		
		return result;
		
	}
}
