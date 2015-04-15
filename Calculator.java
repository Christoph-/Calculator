import java.util.*;
public class Calculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Gib eine Rechnung der Form 'zahl1 +,-,*,/ zahl2' ein:");
		
		int number1 = scanner.nextInt();
		String operator = scanner.next();
		int number2 = scanner.nextInt();
		int result = 0;

		if(operator.equals("-")){
			result = number1 - number2;
		}

		System.out.println(number1 + " " + operator + " " + number2 + " = " + result);
	}
}