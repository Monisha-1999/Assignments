package weekendassignments;

public class FindOddNumbers {

	public static void main(String[] args) {
		// Declare a with integer variable as maxRange with value 10
		int maxRange=10;
		//Use for loop to iterate
		for(maxRange=1;maxRange<=10;maxRange++)
		{
			//Divide the value and check the reminder is equal to 1 using if condition
			if (maxRange%2==1)
			{
				System.out.println(maxRange);
			}
		}

	}

}
