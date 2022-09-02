package program;

public class StringManipulation {
	
	public static void removeCharacter()
	{
		
		String str ="abch234r6dhjs678738";

	
		str.length();
		
		for (int i = 0; i < str.length(); i++) {
			
			if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
	            
				
				
	         }
			
		}

		
		
	}
	
	
	public static boolean isAnagram(String word, String anagram) {
		if (word.length() != anagram.length()) {
			return false;
		}
		char[] chars = word.toCharArray();
		for (char c : chars) {
			int index = anagram.indexOf(c);
			if (index != -1) {
				anagram = anagram.substring(0, index) + anagram.substring(index + 1, anagram.length());
			} else {
				return false;
			}
		}
		return anagram.isEmpty();
	}
	
	/**
	 * * Java method to check if given String is Palindrome * @param text * @return
	 * true if text is palindrome, otherwise false
	 */
	public static boolean isPalindromString(String text) {
		String reverse = reverse(text);
		if (text.equals(reverse)) {
			return true;
		}
		return false;
	}

	/**
	 * * Java method to reverse String using recursion * @param input * @return
	 * reversed String of input
	 */
	public static String reverse(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}
		return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
	}

	/*
	 * 19) How do you check if a given string contains valid parentheses? (solution)
	 * Given a string containing just the characters '(', ')', '{', '}', '[' and
	 * ']', write a function in Java or C++ to check if the input string is valid.
	 * The brackets must close in the correct order, "()" and "()[]{}" are all valid
	 * but "(]" and "([)]" are not
	 * 
	 * Read more:
	 * https://www.java67.com/2018/04/21-string-programming-and-coding-interview-
	 * questions-answers.html#ixzz77SwAJxOa
	 */

	
	
	 public void reverseWordInMyString(String str)
	   {
		/* The split() method of String class splits
		 * a string in several strings based on the
		 * delimiter passed as an argument to it
		 */
		String[] words = str.split(" ");
		String reversedString = "";
		for (int i = 0; i < words.length; i++)
	        {
	           String word = words[i]; 
	           String reverseWord = "";
	           for (int j = word.length()-1; j >= 0; j--) 
		   {
			/* The charAt() function returns the character
			 * at the given position in a string
			 */
			reverseWord = reverseWord + word.charAt(j);
		   }
		   reversedString = reversedString + reverseWord + " ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	   }
	public static void main(String[] args) {
		
		removeCharacter();
	}

}
