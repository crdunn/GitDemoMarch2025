
import java.util.Scanner;

public class GreetUser {
	public static String greet(Scanner scan){
		System.out.println("Enter your name: ");
		String user = scan.nextLine();
		return "Hello " + user; 
	}
}