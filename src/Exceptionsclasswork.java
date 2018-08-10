import java.util.Scanner;

public class Exceptionsclasswork {
	
	static char selection;
	public static void main(String args[]) {
		
		int num1, num2;
		String result = "Your result is: ";
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What do you want to do? Choose one: A. Add S. Subtract D. Divide M. Multiply");
		selection = keyboard.next().charAt(0);
			
			System.out.println("Enter First number: ");
				num1 = keyboard.nextInt();
			System.out.println("Enter Second number: ");
				num2 = keyboard.nextInt();
		
				calculate(num1,num2);
	}
		static void calculate(int num1, int num2){

				switch(selection) {
					
				case 'A': {
			
						System.out.println(num1 + num2);
						break;
						}
				
				case 'S': {
						System.out.println(num1 - num2);
						break;
					}
				case 'D': {
					try{
						System.out.println(num1 / num2);						
					}catch(ArithmeticException e) {
						System.out.println("Cant divide a number by 0");
						break;
					}
					}
				case 'M': {
						System.out.println(num1 * num2);
						break;
					}
		
				
				}
		}
}	