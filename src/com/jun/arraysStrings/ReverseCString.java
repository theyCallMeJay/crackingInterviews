/*1.2 4th edition
reverse a C-style string
*/

package com.jun.arraysStrings;

public class ReverseCString {
	public static void main(String[] args){
		String s = "abcd";
		
		System.out.println(reverseCStyle(s));
	}
	
	public static String reverseCStyle(String s){
		if (s == null) {
			return "This string is not eligible";
		}
		
		int length = s.length() + 2;
		char[] reversed = new char[length];
		reversed[0] = '0'; 
		reversed[1] = '\\'; 
		
		int stringLength = s.length();
		
		for (int i = 2; i < reversed.length; i++) {
			reversed[i] = s.charAt(stringLength-1);
			stringLength --;
		}
		
		String result = new String(reversed);
		
		return result;
	}
}
