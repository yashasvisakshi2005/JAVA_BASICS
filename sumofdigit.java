
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int rev = 0;
       while(n>0){
         int  p = n%10;
           rev += p;
           n = n/10;
          
       }
        System.out.println(rev);

	}
}