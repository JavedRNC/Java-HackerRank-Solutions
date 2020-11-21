import java.util.Scanner;

class JavaStringTokens
{
//	 private static String removeLeadingNonLetters(String str) {
//	        int i;
//	        for (i = 0; i < str.length(); i++) {
//	            if (Character.isLetter(str.charAt(i))) {
//	                break;
//	            }
//	        }
//	        return str.substring(i);
//	    }
	
	 public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        
	        s = s.trim();
	        if (s.length() == 0 || s.isEmpty()) {
	            System.out.println(0);
	            return;
	        }
	       
	        
	       
	       // s = removeLeadingNonLetters(s); 
	        String[] arr = s.split("[ !,?._'@]+");
	        System.out.println(arr.length);
	        for(String item:arr)
	        System.out.println(item);
	        
	    }
}