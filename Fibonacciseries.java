package weekendassignments;

import java.util.Scanner;

public class Fibonacciseries {

	public static void main(String[] args) {
		//User input for the desired range of the Fibonacci series.
		  int num1=0,num2=1,num3,i,count=8;
		  System.out.print(num1 + ", " + num2 + ", ");
		  for(i=2;i<count;i++)
		  {
			  num3=num1+num2;
			  System.out.print(num3);
			  if (i<count-1) {
				  System.out.print(", ");
			  }
			  num1=num2;
			  num2=num3;
		  }

		}

}
