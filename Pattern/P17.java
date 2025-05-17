/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	   //int nsp = 0;
    //   int nst = n;

for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
    }
    for (int k = 1; k <= i; k++) {
        System.out.print(k);
    }
       for(int j=i-1;j>=1;j--){
	            
	            System.out.print(j);
	           
	        }
    //  nsp--;
    // nst++;
    System.out.println();
    // nsp--;
    // nst++;
}

	}
}