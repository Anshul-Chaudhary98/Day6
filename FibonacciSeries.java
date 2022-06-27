package day6assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1 = 0, number2 = 1, number3 = 0;
		System.out.println("Fibonacci Series till 10");
		for(int i = 1; i <=10; i++) {
			System.out.println(number1);
			number3 = number1 + number2;
			number1 = number2;
			number2 = number3;
			
		}

	}

}
