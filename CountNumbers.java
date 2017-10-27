import java.util.*;
import java.io.*;
import java.math.*;
 
class CountNumbers{
	static BigInteger fib_count(BigInteger n){
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger i = BigInteger.valueOf(0);
		BigInteger c = BigInteger.valueOf(0);
 
		if(n.equals(BigInteger.valueOf(0)))
		  return BigInteger.valueOf(0);
 
		for(i.equals(2); (i.compareTo(n)==0)||(i.compareTo(n)==-1); i=i.add(BigInteger.valueOf(1))){
			c=a.add(b); a=b; b=c;
		}
		
		return c.mod(BigInteger.valueOf(1000000007)); 
	}
	public static void main (String[] args) {
	   Scanner sc = new Scanner(System.in); 
	   int num_test_cases;
	   num_test_cases = sc.nextInt();
 
	   long[] cases = new long[num_test_cases];
	   for(int i=0; i<num_test_cases; i++)
	     cases[i] = sc.nextLong();
 
	    for(int i=0; i<num_test_cases; i++)
		    System.out.println(fib_count(BigInteger.valueOf(cases[i])));      
	 }
}
