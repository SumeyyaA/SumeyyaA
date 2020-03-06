package hackerrank;

import java.util.Scanner;

public class StringsInroduction {

	//https://www.hackerrank.com/challenges/java-strings-introduction/problem
public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        System.out.println(A.length()+B.length());
       
        int sonuc = A.compareTo(B);
       // System.out.println(sonuc);

        if (sonuc<=0) {
        	 System.out.println("No");
        	 
        }
        if (sonuc>0) {
       	 System.out.println("Yes");

       }
        
        
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1)+" "+B.substring(0, 1).toUpperCase() + B.substring(1)); 
        
        
    }
}
