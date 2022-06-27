package day6assignments;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.print("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
        boolean flag = false;
        if(num ==0||num == 1){
        	 System.out.println(num +" is not a prime number.");
        }
        else{
             for (int i = 2; i <= num / 2; ++i) {
            	 if (num % i == 0) {
            	        flag = true;
            	        System.out.println(num + " is not a prime number.");
            	        break;
            	 }
            }
             if (!flag) {
                 System.out.println(num + " is a prime number.");
        }
       }
   }
}