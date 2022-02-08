package assignment01;

import java.util.Scanner;
import java.util.Stack;

public class Question05 {

	public static void main(String args[]) 
	{
	    String str1 = new String();
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your expression:");
		str1= console.nextLine();
		
		System.out.println(expression(str1));
		
	}
	
	public static boolean expression (String st) {
		
		 if ((st.length() % 2) == 1) return false;
		  else {
		    Stack<Character> c = new Stack<>();
		    for (char z : st.toCharArray())
		      switch (z) {
		        case '{': c.push('}');
		        break;
		        case '(': c.push(')'); 
		        break;
		        case '[': c.push(']'); 
		        break;
		        default :
		          if (c.isEmpty() || z != c.peek()) { return false;}
		          c.pop();
		      }
		    return c.isEmpty();
		  }
		}


}