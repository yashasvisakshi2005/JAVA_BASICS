
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
       int x = s.nextInt();
	   int n = s.nextInt();
	   int result  =1;
	   int i = 1;
	   while(i<=n){
	       result*=x;
	       i++;
	   }
		System.out.println(result);
	}
}