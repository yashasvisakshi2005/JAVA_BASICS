import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int p =1;
	    for(int i=n;i>=1;i--){
	       p*=i;
	       
	    }
	    System.out.println(p);
	   
		
	}
}
