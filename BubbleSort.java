import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort extends Sort {
	
	public static void bubbleSort(int[] arr) {
		for (int i=arr.length; i>0; i--) {
			for (int j=0; j<i-1; j++) {
				if (arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of the list you would like to sort: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(length*3));
		}
		System.out.println("Unsorted list: ");
		System.out.println(Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("Sorted list: ");
		System.out.println(Arrays.toString(arr));
	}

}