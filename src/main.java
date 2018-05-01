import java.util.InputMismatchException;
import java.util.Scanner;


public class main {


	public static void main(String[] args) {

	try {
		Scanner scn = new Scanner( System.in );

		System.out.println("Enter operation: ");

		Math math = new Math();
		double answer = 0;
		double num1 = scn.nextDouble();
		char operator = scn.next().charAt(0);
		double num2 = scn.nextDouble();

		switch (operator){
			case '+': answer = math.add(num1, num2);
			break;

			case '-': answer = math.minus(num1, num2);
			break;

			case '*': answer = math.multiply(num1, num2);
			break;

			case '/': answer = math.divide(num1, num2);
			break;

			case '^': answer = math.power(num1, num2);
		}

		System.out.println(answer);

		} catch (InputMismatchException x) {
			System.out.println("format: int1 operator int2");
		}

	}

}
