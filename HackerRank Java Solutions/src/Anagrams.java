import java.util.HashSet;
import java.util.Set;
import java.util.Hashtable;

public class Anagrams {

	public static void main(String[] args) {
		String aa = "anagrams".toLowerCase();
		String bb = "AnagraMs".toLowerCase();
		
		if(aa.length()!=bb.length())
		{	System.out.println("Not anagrams");
			System.exit(1);
		}
		
		int a[] = new int[26];
		int b[] = new int[26];
		
		for(int i=0;i<aa.length();i++)
		{
			a[(int)aa.charAt(i)-(int)'a']++;
			b[(int)bb.charAt(i)-(int)'a']++;
			
		}
		
		for(int i:a)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i:b)
		{
			System.out.print(i + " ");
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i] == b[i])
				continue;
			else {
				System.out.println();
				System.out.println("No, not are anagrams");
				System.exit(1);
			}
			
		}
		System.out.println();
		System.out.println("Yes, are anagrams");
		}
	}


