package day6assignments;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int number = 987654321, reverse = 0, remainder = 0;  
	    
        while(number != 0)   {  
            remainder = number % 10;  
            reverse = reverse * 10 + remainder;  
            number = number/10; 
        }  
        System.out.println("The reverse of the given number is: " + reverse);  
    }  
}  