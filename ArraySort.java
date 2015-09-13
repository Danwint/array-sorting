import java.util.Random;
/*
 *	ARRAY SORTING
 *	
 *	Write code in the indicated area below to sort the elements of "numbers"
 *  array in ascending order.
 *  
 *	Example:
 *  The following is example output after a successful implementation:
 *	
 *		Before sorting: {70, 67, 86, 49, 99, 70, 4, 15, 88, 78}
 *		After sorting: {4, 15, 49, 67, 70, 70, 78, 86, 88, 99}	
*/
public class ArraySort {
	public static void main(String[] args) {
		int[] numbers = new int[10];  // This is the array to sort
		Random rand = new Random();
		System.out.print("Before sorting: {");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100)+1;
			System.out.print(numbers[i]);
			if(i < numbers.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
		// ∧ ∧ ∧ ∧ ∧ ∧ ∧ LEAVE THE CODE ABOVE THIS LINE ALONE!!! ∧ ∧ ∧ ∧ ∧ ∧ ∧ 
		
		// YOUR CODE TO SORT THE numbers ARRAY GOES HERE
		
		// ∨ ∨ ∨ ∨ ∨ ∨ ∨ LEAVE THE CODE BELOW THIS LINE ALONE!!! ∨ ∨ ∨ ∨ ∨ ∨ ∨  
		boolean isWrong = false;
		System.out.print("After sorting: {");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			if(i < numbers.length - 1) {
				System.out.print(", ");
			}
			if(i > 0 && numbers[i] < numbers[i-1]) {
				isWrong = true;
			}
		}
		System.out.println("}");
		if(isWrong) {
			System.out.println("Sorry, that's wrong.  Try again.");
		}
	}
}