import java.util.ArrayList;


public class Controller {
	
	/**
	 * Find the sum of all the multiples of 3 or 5 below 1000
	 * @return
	 */
	public int problem1() {
		int sum = 0;
		for(int i = 1; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
			}
		}
		return sum;
	}

	/**
	 * Find the sum of the even-valued fibonacci numbers under 4 million
	 * @return
	 */
	public int problem2() {
		int sum = 0;
		int i = 1;
		int j = 2;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(i);
		numbers.add(j);
		while( i + j <  4000000) {
			sum = i + j;
			numbers.add(sum);
			i = j;
			j = sum;
		}
		
		int evenSum = 0;
		for(int index = 0; index < numbers.size(); index++) {
			if (numbers.get(index) % 2 == 0) {
				evenSum += numbers.get(index);
			}
		}
		
		return evenSum;
	}
	
	/**
	 * Find the largest prime factor of the number 600851475143
	 * @param num
	 * @return
	 */
	public ArrayList<Long> problem3(Long num) {

		ArrayList<Long> primeFactors = new ArrayList<Long>();
		for (Long i = (long) 3; i * i <= num; i += 2) {
			if(isPrime(i)){
				if (num % i == 0) {
					primeFactors.add(i);
				}
			}
			
		}
		return primeFactors;
	}
	
	public boolean isPrime(Long number) {
		for(Long i = (long) 2; i * i <= number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public int problem4() {
		int product = 0;
		int a;
		int b;
		return product;
	}
	
	public boolean isPalindromic(int num) {
		Integer number = num;
		Integer number2 = number.reverse(num);
		System.out.println(number2);
		return true;
	}
	
}
