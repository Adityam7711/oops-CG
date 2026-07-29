package sample_1;
import java.util.Scanner;

public class Calculator {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		double num1 =0 ,num2=0 ,result;
		
		
		do {
			System.out.println("=================== Java Calculator ======================");
			System.out.println("1.Addition(+)");
			System.out.println("2.substraction(-)");
			System.out.println("3.Multiplaction(*)");
			System.out.println("4.division(/)");
			System.out.println("5.modulo(%)");
			System.out.println("6.exit");
			System.out.println("enter your choice:");
			choice = sc.nextInt();
			
			try {
				if(choice > 1 && choice <7 ) {
					System.out.println("Enter the first number");
					 num1 = sc.nextDouble();
					System.out.println("Enter the second number");
					num2 = sc.nextDouble();
				
				}	
			
		    switch(choice) {
		    case 1 : 
		    	result =num1 + num2 ;
		    	System.out.println("Result is :" +result);
		    	break;
		    case 2 : 
		    	result =num1 - num2 ;
		    	System.out.println("Result is :"+result);
		    	break;
		    case 3 : 
		    	result =num1 * num2 ;
		    	System.out.println("Result is :"+result);
		    	break;
		    case 4 : 
		    	 if(num2 ==0) {
		    		 System.out.println("Enter invalid number num cannot divisible by zero");
		    	 }else { 
		    		 result = num1 / num2;
		    		 System.out.println("Result is :"+result);
		    	 }
		    	break;
		    case 5 : 
		    	result =num1 % num2 ;
		    	System.out.println("Result is :"+result);
		    	break;
		    case 6:
		    	System.out.println("exiting ");
		    default :
		    	System.out.println("enter a valid number between 1 - 6");
		    	
		    }
		} 
			catch(Exception e) {
				System.out.println("Error;" +e.getMessage());
					
				}
			
		}
		while(choice != 6 );
		sc.close();
		}
			
		
	}


