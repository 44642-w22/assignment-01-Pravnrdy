package assignment01;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Question03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		ArrayList<Integer> array=new ArrayList<>();
		
		System.out.println("Enter the size of arraylist :");
		int count=scan.nextInt();
		for(int i=0;i<count;i++) {
			System.out.println("Enter number at position "+i+": ");
			array.add(scan.nextInt());

		}
		
		int max=array.get(0);
		
		for(int i=1;i<count;i++) {
			if(array.get(i)>max) {
				max=array.get(i);
			}
			
		}
		
		System.out.println("Output :"+max);
		
		
	}
}




