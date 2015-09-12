public class ArraySort {
	public static void main(String[] args) {
		int[] numbers = new int[] {3, 7, 2, 4, 1, 8, 9, 5, 6, 10};
		// ∧ ∧ ∧ ∧ ∧ ∧ ∧ LEAVE THE CODE ABOVE THIS LINE ALONE!!! ∧ ∧ ∧ ∧ ∧ ∧ ∧ 
		
		// YOUR CODE GOES HERE
		
		// ∨ ∨ ∨ ∨ ∨ ∨ ∨ LEAVE THE CODE BELOW THIS LINE ALONE!!! ∨ ∨ ∨ ∨ ∨ ∨ ∨  
		boolean isWrong = false;
		System.out.print("{");
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