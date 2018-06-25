package chapter1;

public class Chapter1_1_2 {

	public static void main(String[] args) {
		// # -> Just to give it a C-Style String flavor
		String keyToReverse = "abcd#";
		StringBuffer reversedString = new StringBuffer();
		for(int i = (keyToReverse.length() - 2) ; i >= 0 ; --i)
		{
			reversedString.append(keyToReverse.charAt(i));
		}
		System.out.println("Reversed String of " + keyToReverse + " is => "+reversedString);
	}

}
