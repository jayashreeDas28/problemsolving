package demo567;

public class DemoOverloading {
	
	
	public void sum(int a , int b) {
		System.out.println(" inside first sum " + (a+b));
	}
	
   public void sum(int a , double b) {
	   System.out.println(" inside 2nd sum " + (a+b));
	}

   
   
   public static void main(String arg[]) {
	   
	   DemoOverloading demo = new DemoOverloading();
	   demo.sum(12,56d);
   }
   
   
}
