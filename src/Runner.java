import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		/*** Testing integer division -- truncates! doesnt round off ***/
		/*** % modulus returns the remainder of the division ***/
		/*
		 * int numberBits = 10; int bite = 8; int nibble = 4; //test out 10/8 want 1
		 * remainder 2 byteAnswer = numberBits / 8; byteRemainder = numberBits %bite;
		 * 
		 * System.out.println("Bits = " + numberbits +"bytes = "+ byteAnswer
		 * +"remainder =" byteRemainder);
		 */
		/*** How to handle mixed case y, Y, yes, Yes, Yes... ***/

		Scanner kbd = new Scanner(System.in);
		System.out.println("Hello, enter your answer Y/N");
		String answer = kbd.nextLine().toUpperCase();
		System.out.println("You have entered: " + answer);

		// decision time!
		if (answer.equals("Y") || answer.equals("YES")) {
			System.out.println("You have selected YES!");
		}else {
			System.out.println("Please try again");
		}
		if (answer.equals("N") || answer.equals("NO")) {
			System.out.println("You have selected NO!");
		}
	}
}