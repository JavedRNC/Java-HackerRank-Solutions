import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternStringChecker {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int testCases = 4;
		while(testCases-->0)
		{
			String pattern = sc.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			}

			catch (Exception e) {
				System.out.println("Invalid");
			}
		}
	}
	
}

