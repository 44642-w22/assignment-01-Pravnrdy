package assignment01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Question02 {

public static void main(String args[]) {
		
		Scanner scan= new Scanner(System.in);
		
		LinkedList<Integer> p = new LinkedList<>();
		System.out.println("Enter k");
		int k= scan.nextInt();
		System.out.println("Enter the no of input elements");
		int size=scan.nextInt();
		
		
		for (int i=0;i<size;i++) {
			System.out.println("Enter element");
			p.add(scan.nextInt());
		}	
		System.out.println("Output (L2) : " +Question02(p,k));
		
	} 
	
public static LinkedList<ArrayList> Question02(LinkedList<Integer> p, int k){
		
		LinkedList<ArrayList> outputList = new LinkedList<>();
		
		
		for (int i=0;i<p.size()-1;i++) {
			ArrayList<Integer> q = new ArrayList<>();
			
				
				
				int x = p.get(i);
				int y = p.get(i+1);
				if((x+y)==k)
				{
					q.add(x);
					q.add(y);
				}
				
			
			if(q.size()!=0) {
				outputList.add(q);
			}

		}
					
		return outputList;
		
	} 


}
