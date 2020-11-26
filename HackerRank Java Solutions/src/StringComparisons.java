import java.util.Scanner;

public class StringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        String strArr[] = new String[s.length()-(k-1)];
        for(int i=0;i<=s.length()-k;i++)
        {
        	strArr[i] = s.substring(i,i+k);
        }
        largest = strArr[0];
        smallest = strArr[0];
        
       for(String str: strArr)
       {
    	   if(smallest.compareTo(str)>0)
    	   {
    		   smallest=str;
    	   }
    	   else if(largest.compareTo(str)<0)
    	   {
    		   largest = str;
    	   }
       }
        
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}