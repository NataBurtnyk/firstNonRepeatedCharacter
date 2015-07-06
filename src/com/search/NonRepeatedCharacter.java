package com.search;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		System.out.println("Enter youre text:");
		String sc = new Scanner(System.in).nextLine();
		NonRepeatedCharacter c = new NonRepeatedCharacter();

		System.out.println("VALUE = " + sc);
		System.out.println("RESULT = " + c.firstNonRepeatedCharacter(sc));
	}

	public Character firstNonRepeatedCharacter(String str) {
		Map<Character, Integer> collection = new LinkedHashMap<Character, Integer>();
		Character result = '0';
		for (int i = 0; i < str.length(); i++) {
			Character c = str.charAt(i);
			if (collection.containsKey(Character.toLowerCase(c))) {
				collection.put(Character.toLowerCase(c),collection.get(Character.toLowerCase(c)) + 1);
			} else if (collection.containsKey(Character.toUpperCase(c))) {
				collection.put(Character.toUpperCase(c),collection.get(Character.toUpperCase(c)) + 1);
			} else {
				collection.put(c, 1);
			}
		}

		for (Character k : collection.keySet()) {
			if (collection.get(k) == 1) {
				result = k;
				break;
			}
		}

		return result;
	}
}