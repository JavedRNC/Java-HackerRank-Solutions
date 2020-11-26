import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse {

	
	public static void main(String[] args) {
		
		String A = "java World";
		String revStr = "";
		for(int i=A.length()-1;i>=0;i--)
		{
			revStr = revStr + A.charAt(i);
		}
		
		System.out.println(revStr);
		
		
	}
}
