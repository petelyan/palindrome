package com.probone.palindrome;

/**
 * Class that tests a string to determine if it is a palindrome
 * @author petel
 *
 */
public class Palindromer {
	
	
	/**
	 * Method to test if string is a palindrome
	 * @param text - input text to be tested
	 * @return returns true if string is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String text) {		
		
		return isPalindrome(text,0,text.length()-1);
	}
	
	/**
	 * Helper method that determines a string start at start and ending at end is a palindrome
	 * @param text - input text to be tested
	 * @param start - index of first character to be tested.
	 * @param end - index of last character to be tested.
	 * @return
	 */
	
	private static boolean isPalindrome(String text, int start, int end) {
		
		//Strings with length 0 and 1
		if(start >= end) {
			return true;
		}else {
			//Extract first and last characters in lowercase
			char first = Character.toLowerCase(text.charAt(start));
			char last = Character.toLowerCase(text.charAt(end));
			
			if(Character.isLetter(first) && Character.isLetter(last)) {
				if(first == last) {
					//Recursively test substring without the first and last matching letters
					return isPalindrome(text,start + 1, end - 1);
				}else {
					return false;
				}
			}else if(!Character.isLetter(last)) {
				//Remove last character and test remaining substring recursively
				return isPalindrome(text,start,end-1);
			}else {
				//Remove first character and text remaining substring recursively
				return isPalindrome(text,start + 1,end);
			}
		}
	}

}
