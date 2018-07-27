package codeChallenge2maps;

import java.util.HashMap;
import java.util.Map;

public class MapAdd2Keys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> count = new HashMap<>();
		int value, newValue;
		
		count.put("A", 0);
		count.put("B", 0);
		count.put("C", 0);
		
		// String input = null;
		// System.out.println("Enter A, B or C:");
		// input = scnr.next();
		// if (input.equals("A") )
		
		String inputValues [] = { "A", "B", "A", "C", "B", "B" };
	
			for (int i = 0; i < inputValues.length; i++) {
				value = count.get(inputValues[i]);
				newValue = value + 1;
				count.put(inputValues[i], newValue);
			}
		// manually enter first A
		// value = count.get("A");
		// newValue = value + 1;
		// count.put("A", newValue);
		
		// manually enter first B
		// value = count.get("B");
		// newValue = value + 1;
		// count.put("B", newValue);
		
		System.out.println(count);
	}

}
