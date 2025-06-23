import java.util.*;
public class Main
{
    public static boolean checkfibo(int n){
        int a =1;
        int b =1;
        
        while(b<=n){
        int c =a+b;
        if(c==n){
            return true;
        }else{
            a=b;
            b=c;
        }
        }    
        return false;
       
	    
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    
	    
		boolean isfibo = checkfibo(n);
		System.out.println(isfibo);
	}
}