
import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		System.out.println("Enter youre text:");
		String sc = new Scanner(System.in).nextLine();
		NonRepeatedCharacter c = new NonRepeatedCharacter();
	
		System.out.println("VALUE = "+ sc);
		System.out.println("RESULT = " + c.firstNonRepeatedCharacter(sc));
	}

	public char firstNonRepeatedCharacter(String str) {
		HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
		char result = 0;
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (characterhashtable.containsKey(c)) {
				characterhashtable.put(c, characterhashtable.get(c) + 1);
			} else {
				characterhashtable.put(c, 1);
			}
		}

		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (characterhashtable.get(c) == 1) {
				result = c;
			}else if(characterhashtable.get(c) == 0){
				result = 0;
			}
		}
		return result;
	}

}
 
