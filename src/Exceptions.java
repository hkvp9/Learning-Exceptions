/*
 * Hannah Kelly
 * Stack Trace
 */
//Scanner reader = new Scanner(System.in);


import java.util.Scanner;
public class Exceptions {
	

	public static void main(String args[]) {
			String userInput;
			String input1 = "a";
			String input2 = "s";
			String input3 = "d";
			String input4 = "m";
			double num1, num2, answer;
			String result = "Your result is: ";
			Scanner keyboard = new Scanner(System.in);

			
				System.out.println("Hi! What do you want to do? A=Add S=Subtract D=Divide M=Multiply");
				userInput = keyboard.next();
				
//				if ("a") {
//					System.out.println("Enter First number: ");
//					num1 = keyboard.nextDouble();
			//	else if(userInput = "s"){
//				System.out.println("Enter Second number: ");
//				num2 = keyboard.nextDouble();
//				}
					switch( ) {

					case "a": {
						answer = (num1 + num2);
						System.out.println(result + answer);
						break;
					}
					case "s": {
						answer = num1 - num2;
						System.out.println(result + answer);
						break;
					}
					case "d": {
						answer = num1/num2;
						System.out.println(result + answer);
						
						try{
							System.out.println("The division of these 2 numbers is " + num1/num2);
							
						}
						catch(IndexOutOfBoundsException e){
							System.out.println("Index out of bound");
						}
							
			
					case "m": {
						answer = num1*num2;
						System.out.println(result + answer);
						break;

					}
				
					
					
					}
					}
	}
}
