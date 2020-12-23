package problems.src.solve;

import java.util.Arrays;

/**
 * 
 * 
 * 
 * @author jayashreedas
 *How do you find the missing number in a given integer array of 1 to 100?
 */
public class MissingInteger {
	
	public static void main(String arg[]) {

		int[] arrayOfNumber = new int[100];
		for( int i = 0 ; i < 100 ; i++) {
		arrayOfNumber[i] = i+1;	
		}
		
		arrayOfNumber[10] = 0;
		System.out.println(" missing number is " + missingNumber(arrayOfNumber));
	}
	
	static int missingNumber(int[] array) {
		// total of number from 1 to 100 is n*(n-1)/2
		// according mathematical formula sum will be 
		int sum  = 100*(100+1)/2;
		
		int actualSum = 0 ;
		for( int i = 0 ; i < 100 ; i++) {
			actualSum = actualSum +array[i];
		}
		int result = sum -actualSum ;
		return result;
	}

}
