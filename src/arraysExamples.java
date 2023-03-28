import java.util.Arrays;
import java.util.Scanner;

public class arraysExamples {
	public static void main(String[] args) {
		// Declaring and initializing array
		{
			String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		}
		// Accessing element from array
		{
			int[] myArray = new int[6];
			myArray[1] = 1;
			myArray[5] = 5;
			for (int i = 0; i < myArray.length; i++) {
				System.out.printf("%d ", myArray[i]);
			}
			System.out.println();
		}
		// Exceeding array bounds
//		int[] arrayErr = {1,2,3,4,5,6};
//		System.out.println(arrayErr[6]);

		// Reversing array
		{
			int[] originalArray = new int[] { 1, 2, 3, 4, 5 };
			int length = originalArray.length;
			int[] reversedArray = new int[length];
			for (int index = 0; index < length; index++) {
				reversedArray[length - index - 1] = originalArray[index];
			}
			System.out.println(Arrays.toString(reversedArray));
		}
		// Reading arrays from the console
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter the array's length: ");
			int n = input.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter element: ");
				array[i] = input.nextInt();
			}
			System.out.println("Array -> " + Arrays.toString(array));
		}
		// Symmetric arrays
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter array length: ");
			int n = input.nextInt();
			int[] array = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter element: ");
				array[i] = input.nextInt();
			}
			boolean symmetric = true;
			for (int i = 0; i < array.length / 2; i++) {
				if (array[i] != array[n - i - 1]) {
					symmetric = false;
				}
			}
			System.out.println("Symmetrix? " + symmetric);
		}
		// Printing arrays on the console
		{
			String[] array = { "one", "two", "three", "four" };
			System.out.println(array);
			for (int index = 0; index < array.length; index++) {
				System.out.printf("Element[%d] = %s%n", index, array[index]);
			}
			System.out.println(java.util.Arrays.toString(array));

		}
		// Iteration with for loop
		{
			int[] array = new int[] { 1, 2, 3, 4, 5 };
			for (int index = 0; index < array.length; index++) {
				array[index] = 2 * array[index];
			}
			System.out.println(Arrays.toString(array));
			int[] arraySecond = { 1, 2, 3, 4, 5 };
			for (int index = 0; index < arraySecond.length; index += 2) {
				arraySecond[index] = arraySecond[index] * arraySecond[index];
			}
			System.out.println(Arrays.toString(arraySecond));
			// Reading array reversed
			int[] arrayThird = new int[] { 1, 2, 3, 4, 5 };
			System.out.print("Reversed: ");
			for (int i = arrayThird.length - 1; i >= 0; i--) {
				System.out.print(arrayThird[i] + " ");
			}
			System.out.println();
		}
		// Iteration with for-each loop
		{
			String[] capitals = { "Sofia", "Washington", "London", "Paris" };
			for (String capital : capitals) {
				System.out.print(capital + " ");
			}
			System.out.println();
			int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
			for (int number : numbers) {
				System.out.print(number + " ");
			}
			System.out.println();
		}
		// Matrix initialization
		{
			int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
			System.out.println(Arrays.deepToString(matrix));
			// Accessing 2-D array element by index
			matrix[0][0] = 7;
			matrix[1][3] = 12;
			matrix[1][1] = 0;
			matrix[0][3] = 0;
			System.out.println(Arrays.deepToString(matrix));
			// Length
			int matrixLength = matrix.length;
			int matrixElementLength = matrix[1].length;
			System.out.println("Matrix Length = " + matrixLength);
			System.out.println("Matrix Element Length = " + matrixElementLength);
		}
		// Printing 2-D arrays
		{
			int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8, 7, 6 } };
			for (int row = 0; row < matrix.length; row++) {
				for (int col = 0; col < matrix[row].length; col++) {
					System.out.printf("%d ", matrix[row][col]);
				}
			}
			System.out.println();
		}
		// Reading 2-D arrays
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter number of elements for prime array: ");
			int prime = input.nextInt();
			System.out.print("Enter number of elements for secondary array: ");
			int secondary = input.nextInt();
			int [][] matrix = new int[prime][secondary];
			for (int p = 0; p < prime; p++) {
				for (int s = 0; s < secondary; s++) {
					System.out.printf("matrix[%d,%d] = " ,p, s);
					matrix[p][s] = input.nextInt();
				}
			}
			System.out.println(Arrays.deepToString(matrix));
		}

	}

}
