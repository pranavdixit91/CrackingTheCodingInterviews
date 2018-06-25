package chapter1;

public class Chapter1_1_1 {

	public static void main(String[] args) {
		String key = "abbbbb";
		Boolean isUnique = Boolean.TRUE;
		if (key.length() > 0) {
			Character charToMatch = key.charAt(0);
			for (int i = 1; i < key.length(); i++) {
				if (!(charToMatch.equals(key.charAt(i)))) {
					isUnique = Boolean.FALSE;
				}
			}
		}
		System.out.println("Are all characters unique ?  =>  " + isUnique);
	}
}
