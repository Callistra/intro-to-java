import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {
	public static void main(String[] args) {
		// Exercise 1
//		{
//			int[] array = new int[20];
//			int arrayLenght = array.length;
//			for (int i = 0; i <= arrayLenght - 1; i++) {
//				array[i] = i * 5;
//			}
//			System.out.println(Arrays.toString(array));
//		}

		// Exercise 2
//		{
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter the lenght of the first array: ");
//			int firstLength = input.nextInt();
//			int[] firstArray = new int[firstLength];
//			for (int i = 0; i <= firstLength - 1; i++) {
//				System.out.print("Enter element value: ");
//				firstArray[i] = input.nextInt();
//			}
//			System.out.print("Enter the lenght of the second array: ");
//			int secondLength = input.nextInt();
//			int[] secondArray = new int[secondLength];
//			for (int j = 0; j <= secondLength - 1; j++) {
//				System.out.print("Enter element value: ");
//				secondArray[j] = input.nextInt();
//			}
//			boolean same = true;
//			if (firstLength == secondLength) {
//				for (int k = 0; k <= firstLength - 1; k++) {
//					if (firstArray[k] != secondArray[k]) {
//						same = false;
//						break;
//					}
//				}
//				System.out.println("The arrays are same : " + same);
//
//			} else {
//				System.out.println("The arrays are not with the same length therefore they are different!");
//			}
//
//		}

		// Exercise 3
//		{
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter your array length: ");
//			int firstArrayLength = input.nextInt();
//			char[] firstArray = new char[firstArrayLength];
//			for (int i = 0; i <= firstArrayLength - 1; i++) {
//				System.out.print("Enter char: ");
//				firstArray[i] = input.next().charAt(0);
//			}
//			System.out.print("Enter your second array length: ");
//			int secondArrayLength = input.nextInt();
//			char[] secondArray = new char[secondArrayLength];
//			for (int i = 0; i < secondArrayLength; i++) {
//				System.out.print("Enter char: ");
//				secondArray[i] = input.next().charAt(0);
//			}
//			int length = firstArrayLength > secondArrayLength ? secondArrayLength : firstArrayLength;
//			System.out.println(length);
//			boolean isFirstArrayEarlier = true;
//			for (int i = 0; i < length; i++) {
//				if ((int) firstArray[i] > (int) secondArray[i]) {
//					isFirstArrayEarlier = false;
//					break;
//				}
//			}
//			System.out.println(isFirstArrayEarlier);
//			if (isFirstArrayEarlier) {
//				System.out.println(Arrays.toString(firstArray));
//			} else {
//				System.out.println(Arrays.toString(secondArray));
//			}
//
//		}

		// Exercise 4
//		{
//			Scanner input = new Scanner(System.in);
//			System.out.print("Enter array length: ");
//			int arrayLength = input.nextInt();
//			int[] array = new int[arrayLength];
//			for (int i = 0; i < arrayLength; i++) {
//				System.out.print("Enter array element: ");
//				array[i] = input.nextInt();
//
//			}
//			int longestSequenceNumber = 0;
//			int longestSequenceTimes = 1;
//			int currentSequenceNumber = 0;
//			int currentSequenceTimes = 1;
//			for (int i = 0; i < arrayLength; i++) {
//				if (currentSequenceNumber != array[i]) {
//					currentSequenceNumber = array[i];
//					currentSequenceTimes = 1;
//				} else {
//					currentSequenceTimes += 1;
//				}
//				if (currentSequenceTimes > longestSequenceTimes) {
//					longestSequenceTimes = currentSequenceTimes;
//					longestSequenceNumber = currentSequenceNumber;
//				}
//
//			}
//			int[] longestSequence = new int[longestSequenceTimes];
//			for (int i = 0; i < longestSequenceTimes; i++) {
//				longestSequence[i] = longestSequenceNumber; 
//			}
//
//			System.out.println(longestSequenceNumber);
//			System.out.println(longestSequenceTimes);
//			System.out.println(Arrays.toString(longestSequence));
//
//		}

		// Exercise 5
		{
			Scanner input = new Scanner(System.in);
			System.out.print("Enter array length: ");
			int length = input.nextInt();
			int[] array = new int[length];
			for (int i = 0; i < length; i++) {
				System.out.print("Enter array element: ");
				array[i] = input.nextInt();
			}
			int currentIncreasingNumbersTimes = 0;
			int currentNumber = 0;
			int currentSequenceIndex = 0;
			int longestIncreasingNumbersTimes = 0;
			int longestSequenceIndex = 0;
			for (int i = 0; i < length; i++) {
				if (array[i] > currentNumber) {
					currentIncreasingNumbersTimes++;
				} else {
					currentIncreasingNumbersTimes = 1;
					currentSequenceIndex = i;
				}
				currentNumber = array[i];
				if (currentIncreasingNumbersTimes > longestIncreasingNumbersTimes) {
					longestIncreasingNumbersTimes = currentIncreasingNumbersTimes;
					longestSequenceIndex = currentSequenceIndex;
				}

			}
			System.out.println(longestIncreasingNumbersTimes);
//			for (int i = longestSequenceIndex; i < longestSequenceIndex + longestIncreasingNumbersTimes; i++) {
//				System.out.print(array[i] + " ");
//			}
			int[] increasingArray = new int[longestIncreasingNumbersTimes];
			System.out.println(Arrays.toString(increasingArray));

			for (int i = longestSequenceIndex, j = 0; i < length && j < longestIncreasingNumbersTimes; i++, j++) {
				increasingArray[j] = array[i];

			}
			System.out.println(Arrays.toString(increasingArray));
		}

		// Exercise 6

		// Exercise 7

		// Exercise 8

		// Exercise 9

		// Exercise 10

		// Exercise 11

		// Exercise 12

		// Exercise 13

		// Exercise 14

		// Exercise 15

		// Exercise 16

		// Exercise 17

	}

}
