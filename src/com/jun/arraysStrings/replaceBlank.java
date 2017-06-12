/*1.5
write a method to replace all the blank with 20%*/

package com.jun.arraysStrings;

public class replaceBlank {
	
	public static void main(String[] args){
		String a = "     aaaaa";
		System.out.println(replaceBlanck(a));
	}
	
	public static String replaceBlanck(String input){
		
		
		char[] inputToArray = input.toCharArray();
		for (char c : inputToArray) {
			if (c == ' ') {
				c = '%' + '2' + '0';
				System.out.println(c);
			}
		}
		
		String result = new String(inputToArray);
		return result;
	}

	
	
}
