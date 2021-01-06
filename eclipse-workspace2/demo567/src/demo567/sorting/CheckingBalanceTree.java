package demo567.sorting;
import java.util.*;

public class CheckingBalanceTree {

		public static void main(String arg[]) {
			String input = "[{(}]";
			// [ { } ]
			boolean result = check(input);
			System.out.println( " result " + result);
			
		}
			
			public static boolean check(String input) {
			Deque<Character> stack = new ArrayDeque<Character>();
			for( int i =0; i< input.length() ; i++) {
				char x = input.charAt(i);
				if(x == '(' || x == '[' || x =='{') {
					stack.push(x);
					continue ;
					
				}
			
			
			if(stack.isEmpty()) 
				return false ;
			
			char check ;
			switch(x) {
			case ')':
				check = stack.pop();
				if(check == '{' || check == '[') 
					return false ;
				break;
			
				
			case '}':
				check = stack.pop();
				if(check == '[' || check == '(') 
					return false ;
				break;
				
				
			case ']':
				check = stack.pop();
				if(check == '(' || check == '{') 
					return false ;
				break;
			
			}
			
			}
			return stack.isEmpty() ;
			}
			
		
}
