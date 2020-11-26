import java.util.Scanner;
public class JavaSubstring
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String myStr = sc.nextLine();
		int start = sc.nextInt();
		int end = sc.nextInt();
		String newStr = myStr.substring(start,end);
		System.out.println(newStr);
		System.out.println();
		
		
	}
}