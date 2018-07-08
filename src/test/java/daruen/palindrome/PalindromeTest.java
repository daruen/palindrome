package daruen.palindrome;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for Palindrome.
 */
public class PalindromeTest {

@Test
public void shouldBeAPalindrome() {
		Assert.assertTrue(Palindrome.isPalindrome("sarabaras"));
	}
@Test
	public void shouldNotBeAPalindrome() {
		Assert.assertFalse(Palindrome.isPalindrome("isnotapalindrome"));
	}
@Test
	public void shouldBeAPalindromeBorderCase() {
		Assert.assertTrue(Palindrome.isPalindrome("okko"));
	}
}
