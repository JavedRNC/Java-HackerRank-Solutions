import java.util.Scanner;

class JavaStringTokens
{

	
	 public static void main(String[] args) {
	       
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();
	        
	        s = s.trim();
	        if (s.length() == 0 || s.isEmpty()) {
	            System.out.println(0);
	            return;
	        }
	      
	        String[] arr = s.split("[ !,?._'@]+");
	        System.out.println(arr.length);
	        for(String item:arr)
	        System.out.println(item);
	        
	    }
}