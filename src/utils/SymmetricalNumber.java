package utils;

public class SymmetricalNumber {

	private static final String EMPTY_STRING = "";
	
	public Integer getSymmetrical(Integer number) {
		String numberString = number.toString();
		char[] normalOrder = numberString.toCharArray();
		int numberOfDigits = normalOrder.length;
		char[] reverseOrder = new char[numberOfDigits];
		for (int currIndex = 0; currIndex < numberOfDigits; currIndex++) {
			reverseOrder[currIndex] = normalOrder[numberOfDigits - (currIndex + 1)];
		}
		String numberStringReversed = EMPTY_STRING;
		for (int currIndexReversed = 0; currIndexReversed < numberOfDigits; currIndexReversed++) {
			numberStringReversed = numberStringReversed.concat(Character.toString(reverseOrder[currIndexReversed]));
		}
		return Integer.parseInt(numberStringReversed);
	}
}
