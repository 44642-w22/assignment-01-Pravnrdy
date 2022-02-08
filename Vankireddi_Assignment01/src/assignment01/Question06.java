package assignment01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Question06 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<>();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the size of stack: ");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter number into stack: ");
		stack.push(scan.nextInt());

		}
		
		System.out.println(firstTopHalf(stack));

	}

	public static ArrayList<Integer> firstTopHalf(Stack<Integer> S)
	{
		ArrayList<Integer> stack2 = new ArrayList<>();
		int size = S.size() / 2;
		for(int i = 0; i < size ; i++) 
		{
			stack2.add(S.pop());
		}
		S.sort(Collections.reverseOrder());
		
		for(int i = 0; i < size ; i++) 
		{	
			stack2.add(S.pop());
		}

		return stack2;
	}
}

