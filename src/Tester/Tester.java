package Tester;

import utils.PrimeFinder;
import utils.SymmetricalNumber;

public class Tester {

	private static final int INITIAL_NUMBER = 10;
	private static final int FINAL_NUMBER = 1000000;

	public static void main(String[] args) {
		int perfectPrimeCounter = 0;
		long startTime = System.currentTimeMillis();
		for (int currNumber = INITIAL_NUMBER; currNumber < FINAL_NUMBER; currNumber++) {
			if (isPrime(currNumber) && isReversePrime(currNumber)) {
				print(intToString(currNumber));
				perfectPrimeCounter++;
				if (currNumber == getSymmetrical(currNumber)) {
					perfectPrimeCounter++;
				}
			}
		}
		long endTime = System.currentTimeMillis();
		Long executionTime = endTime-startTime;
		print("Execution time: " + executionTime.toString() + " ms");
		int numberOfPerfectPrimes = perfectPrimeCounter / 2;
		print("Number of perfect primes up from " + INITIAL_NUMBER + " to " + FINAL_NUMBER + ": " + numberOfPerfectPrimes);
	}

	private static boolean isPrime(Integer number) {
		PrimeFinder primeFinder = new PrimeFinder();
		return primeFinder.isPrime(number);
	}

	private static boolean isReversePrime(Integer number) {
		return isPrime(getSymmetrical(number));
	}

	private static Integer getSymmetrical(Integer number) {
		SymmetricalNumber symmetricalNumber = new SymmetricalNumber();
		return symmetricalNumber.getSymmetrical(number);
	}

	private static void print(String text) {
		System.out.println(text);
	}

	private static String intToString(int number) {
		Integer numberInteger = number;
		return numberInteger.toString();
	}

}
