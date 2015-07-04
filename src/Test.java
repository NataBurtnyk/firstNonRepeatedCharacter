
import java.util.HashMap;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("Enter youre text:");
		String sc = new Scanner(System.in).nextLine();
		char c = firstNonRepeatedCharacter(sc);
		System.out.println("The first non repeated character is: " + c);
	}

	private static char firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
		Character c;
		char result = 0;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (characterhashtable.containsKey(c)) {
				characterhashtable.put(c, characterhashtable.get(c) + 1);
			} else {
				characterhashtable.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (characterhashtable.get(c) == 1) {
				result = c;
			}
		}
		return result;
	}

}
