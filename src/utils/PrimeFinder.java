package utils;

public class PrimeFinder {

	public boolean isPrime(Integer number) {
		Integer sqrt = (int) Math.sqrt(number);
		for (int i = 2; i < sqrt; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}

}
