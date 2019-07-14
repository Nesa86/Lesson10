package exercises;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PalindromeTest {
	
	Palindrome testPalindrome = new Palindrome();

	@Test
	void testLoadWords() {
		assertTrue(testPalindrome.loadWords().contains("apple"));
	}

	@Test
	void wordExist() throws Exception {
		assertTrue(testPalindrome.wordExist("abater"));
	}

	@Test
	void wordIsAPalindrome() throws Exception {
		assertTrue(testPalindrome.wordIsAPalindrome("kayak"));
		assertFalse(testPalindrome.wordIsAPalindrome("Acdex"));
	}


}