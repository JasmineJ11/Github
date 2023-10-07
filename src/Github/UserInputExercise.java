package Github;

import java.util.Scanner;

public class UserInputExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int sum;
		
		System.out.println("Please, give the value of 1st number");
		
		int answer1 = Integer.parseInt(in.nextLine());
		
		System.out.println(answer1);
		
		
		System.out.println("Please, give the value of 2nd number");
		
		int answer2 = Integer.parseInt(in.nextLine());
		
		System.out.println(answer2);
		
		sum = answer1 + answer2;
	
//	
//		System.out.println("The sum is " + sum);
//		//3
//		
//		if (sum > 10)
//		
//			System.out.println("The value is greater than 10, it is " + sum );
//		//4

		System.out.println("Would you like to calculate the sum or substraction. Please type plus or minus.");
		
		String answer =  in.nextLine();
		
		if ( answer.equals( "plus"))
		{
			System.out.println(answer1 + answer2);
		}
		
		if ( answer.equals( "minus"))	
		{
			System.out.println(answer1 - answer2);
		}

		

	}

}
