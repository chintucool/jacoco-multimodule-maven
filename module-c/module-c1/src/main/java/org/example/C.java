package org.example;

class C {

    void foo() {
        System.out.println("C1.foo");
    }

    void bar() {
        System.out.println("C1.bar");
    }
    
    public boolean isPalindrome(String input) {

		if (input == null) {
			throw new IllegalArgumentException("input shouldn't be null");
		}

		if (input.equals(reverse(input))) {
			return true;
		} else {
			return false;
		}
	}

	private String reverse(String input) {
		String rev = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		return rev;
	}
}
