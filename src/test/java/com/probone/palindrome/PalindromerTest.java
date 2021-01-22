package com.probone.palindrome;

import org.junit.Test;

import com.probone.palindrome.Palindromer;

import static org.junit.Assert.*;

public class PalindromerTest {

	
	@Test
	public void stringIsEmpty() {
		//empty strings are considered palindromes
		String input = "";
		assertTrue(input,Palindromer.isPalindrome(input));		
	}
	
	@Test
	public void stringIsSpace() {
		//space strings are considered palindromes
		String input = " ";
		assertTrue(input,Palindromer.isPalindrome(input));		
	}
	
	
	@Test
	public void stringIsLengthOne() {
		//strings of length 1 are considered palindromes
		String input = "a";
		assertTrue(input,Palindromer.isPalindrome(input));
	}
	
	@Test
	public void stringIsLengthTwoIdentical() {
		String input = "aa";
		assertTrue(input,Palindromer.isPalindrome(input));
	}
	
	@Test
	public void stringIsLengthTwoNotIdentical() {
		String input = "ab";
		assertFalse(input,Palindromer.isPalindrome(input));
		
	}
	
	@Test
	public void stringIsLengthThreeSymmetrical() {
		String input = "bab";
		assertTrue(input,Palindromer.isPalindrome(input));
	}
	
	@Test
	public void stringIsLengthThreeNot() {
		String input = "cab";
		assertFalse(input,Palindromer.isPalindrome(input));
	}
	
	@Test
	public void stringIsLongPalindrome() {
		String input = "Step on no pets";
		assertTrue(input,Palindromer.isPalindrome(input));
	}
	
	@Test
	public void longStringIsNotPalindrome() {
		String input = "Whatever you do it will not help";
		assertFalse(input,Palindromer.isPalindrome(input));
	}
	
	
	@Test
	public void stringIsLongPalindromeOther() {
		String input = "A man, a plan, a canal, Panama!";
		assertTrue(input,Palindromer.isPalindrome(input));
	}

}
