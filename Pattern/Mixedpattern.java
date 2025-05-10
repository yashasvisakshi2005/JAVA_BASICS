import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	   
	    for(int i=1;i<=6;i++){
	        if(i%2==0){
	     for(int j=1;j<=i;j++){
	        System.out.print((char)(64+j));
	    }
	        }else{
	            for(int k=1;k<=i;k++){
	             System.out.print(k);   
	            }
	            
	        }
	       System.out.println();
	    }
	    
	   
		
	}
}
