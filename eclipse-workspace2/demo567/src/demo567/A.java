package demo567;

public class A {

	
	public static void main(String arg[]) {
	int[] a = {12,45,43,67,7,78,23};
	//7,45,43,67,12,78,23
	//7,12,43,67,45,78,23
	//7,12,23,67,45,78,43
	//
	
	
	for(int i = 0 ; i < a.length ; i++) {
		
		for(int j = i+1 ; j < a.length ; j++) {
			if(a[i] > a[j]) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp ;
				
				}
			}
		}
	
	for(int p : a) {
		System.out.print(" "+p);
	}
	}
}
