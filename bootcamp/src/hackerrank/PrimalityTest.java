package hackerrank;

import java.util.*;

import java.math.BigInteger;

public class PrimalityTest {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        // Boolean variable to store the result 
        boolean result; 
  
        // Creates one BigInteger object 
        BigInteger a = new BigInteger(n); 
  
        // When certainty is one, 
        // it will check number for prime or composite 
        result = a.isProbablePrime(1); 
       // System.out.println(a.toString()+ " with certainty 1 " + result); 
  
        // When certainty is zero, 
        // it is always true 
       // result = a.isProbablePrime(0); 
      //  System.out.println(a.toString() 
       //                    + " with certainty 0 "
       //                    + result); 
  
        // When certainty is negative, 
        // it is always true 
      //  result = a.isProbablePrime(-1); 
      //  System.out.println(a.toString() 
       //                    + " with certainty -1 "
      //                     + result); 
if (result) {
	System.out.println("prime");
	
}
else {
	System.out.println("not prime");
	
}
    } 
} 
        

