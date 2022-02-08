package assignment01;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Question10 {

	static String val = ""; 
	
	 public static void main(String[] args) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the size of the deque :");
		int size=keyboard.nextInt();
		
		Deque<String> d1 = new ArrayDeque<String>();

		for (int i=0;i<size;i++)
		{
			System.out.println("Enter char/string at position"+i+" to Deque");
			d1.add(keyboard.next());
		}
		
		System.out.println("Enter the size of the Array");
		int size2=keyboard.nextInt();
		
		int[] ia = new int[size2];
		
		//Providing input for Array
		for (int i=0;i<size2;i++)
		{
			ia[i]=keyboard.nextInt();
		}
		
		for (Integer p : ia) {
			deq(p,d1);
		}

		String res = "";
		
		for (String string : d1) {
			res+=string;
		}
		
		System.out.println("\""+res+"\"");	
		
	}
	
	public static void deq(int p, Deque<String> d1) {
		
		
		if(p == 1) {
			val = d1.poll();
		}else {
			
			if(val!="") {
				d1.addFirst(val);
				val="";
			}
		}	
	
	}
	}
	
