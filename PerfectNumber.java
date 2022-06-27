package day6assignments;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 0, j = 0, i = 1;
		System.out.print("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		System.out.println("Factors of "+ number + " are: ");
		for( i = 1; i < number; i++) {
			if(number % i == 0) {
			    j =  j + i ;
				System.out.println(" " + i);
			}		
		}	
		if(j == number){
		   System.out.println(number + " is a perfect number ");
		}
		else{
		   System.out.println(number + " is not a perfect number ");
		}
	}

}
