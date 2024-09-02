# JAVA_BASICS
This repository contains basic programming questions


A) PRINT HELLO WORLD:-
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

B) PRINT TWO FLOATING NUMBERS

public class Main
{
	public static void main(String[] args) {
	    float a = 5.0f;
	    float b = 6.2f;
	    float mul = a*b;
		System.out.println(mul);
	}
}

C) SWAP TWO NUMBERS
public class Main
{
	public static void main(String[] args) {
	   int a = 5;
	   int b = 6;
	   int c = a;
	   a= b;
	   b=c;
		System.out.println(a);
		System.out.println(b);
	
	}
}

D) Check if a Given Integer is Odd or Even
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    if(a%2==0){
	   System.out.println("IT IS A EVEN NUMBER");     
	    }
	    else{
	    System.out.println("IT IS A ODD NUMBER");
	    }
	   
		
	
	}
}
E)Find the Largest of three Numbers
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n1 = sc.nextInt();
	    int n2 = sc.nextInt();
	    int n3 = sc.nextInt();
	    if(n1>n2 && n1>n3){
	        System.out.println("N1 IS GREATEST");
	    }
	    else if(n2>n1 && n2>n3){
	      System.out.println("N2 IS GREATEST"); 
	   }
	   if(n3>n1 && n3>n2){
	   System.out.println("N3 IS GREATEST");
	   }
	
	}
}

F)Find if a Given Year is a Leap Year

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int yr = sc.nextInt();
	     if(yr%4==0){
	   System.out.println("IT IS A LEAP YEAR");
	   }
	    
	        
	    
	  
	
	}
}

G)Calculate Simple Interest
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int p = sc.nextInt();
	    int r = sc.nextInt();
	    int t = sc.nextInt();
	    
	    int SI = (p*r*t)/100;
	    
	     
	   System.out.println("SI IS"+" "+ SI);
	   
	    
	        
	    
	  
	
	}
}
H)Find the Perimeter of a Rectangle
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int l = sc.nextInt();
	    int b = sc.nextInt();
	    
	    
	    int PERIMETER = 2*(l+b);
	    
	     
	   System.out.println("PERIMETER IS"+" "+ PERIMETER);
	   
	    
	        
	    
	  
	
	}
}
I) All Operations
public class Main
{
	public static void main(String[] args) {
	   
	    int a = 5;
	    int b = 8;
	    int sum = a+b;
	    int sub = a-b;
	    int mul = a*b;
	    int div = b/a;
	    int mod = b%a;
	  System.out.println(sum);
	   System.out.println(sub);
	   System.out.println(mul);
	   System.out.println(div);
	   System.out.println(mod);

	    
	        
	    
	  
	
	}
}
J)USE OF BITWISE OPERATORS:-
1) BITWISE AND ->
   import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("ENTER YOUR NUM1");
	    int n1 = sc.nextInt();
	    System.out.println("ENTER YOUR NUM2");
	    int n2 = sc.nextInt();
	    
	    int AND = n1 & n2;
	    System.out.println(AND);
	    
	   
	    
	//	System.out.println("Hello World");
	}
}
2)BITWISE OR ->
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("ENTER YOUR NUM1");
	    int n1 = sc.nextInt();
	    System.out.println("ENTER YOUR NUM2");
	    int n2 = sc.nextInt();
	    
	    int AND = n1 ^ n2;
	    System.out.println(AND);
	    
	   
	    
	
	}
}







