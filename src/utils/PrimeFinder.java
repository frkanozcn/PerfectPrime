package utils;

public class PrimeFinder {

	public PrimeFinder() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPrime(int number) {
		int sqrt = (int) Math.sqrt(number);
		for (int i = 0; i < sqrt; i++) {
			if (number%sqrt == 0) return true;
		}
		return false;
	}

}
