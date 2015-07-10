package com.search;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		System.out.println("Enter youre text:");
		String sc = new Scanner(System.in).nextLine();
		Character c = new NonRepeatedCharacter().firstNonRepeatedCharacter(sc);
		System.out.println("VALUE = " + sc);

		if (c == null) {
			System.out.println("RESULT = all letters are repeated");
		} else {
			System.out.println("RESULT = " + c);
		}
	}

	public Character firstNonRepeatedCharacter(String str) {
		Map<Character, Integer> collection = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character c = str.toLowerCase().charAt(i);
			if (collection.containsKey(c)) {
				collection.put(c, collection.get(c) + 1);
			} else {
				collection.put(c, 1);
			}
		}

		for (Character k : collection.keySet()) {
			if (collection.get(k) == 1) {
				Character result = k;
				return result;
			}
		}

		return null;
	}
}