package demo567.sorting;

import java.util.Arrays;

public class InsertionSort {
	
	
	public static void main(String arg[]) {
		
		int[] input = {1,2,6,1,10,11,51,26,10,34,100,29};
		insertionSort(input);
		System.out.println(Arrays.toString(input));
	}
	
	public static void insertionSort(int[] a) {
		int key ;
		for( int j = 1 ; j < a.length ; j++ ) {
			key = a[j];
			int i = j-1;
			while(i >= 0 && a[i] > key) {
				a[i+1] = a[i];
				a[i] = key ;
				i = i-1;	
			}
			
			
		}
		
	}
	
	

}
