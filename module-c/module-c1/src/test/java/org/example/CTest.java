package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CTest {

    String input1 = "noon";
	C app = new C();
	boolean expected = true;

	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}

	
	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}

    @Test
    public void a() throws Exception {
        new C().foo();
    }

}
