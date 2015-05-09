import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort extends Sort {

	public static void insertionSort(int[] arr) {
		for (int i=1; i<arr.length; i++) {
			for (int j=i; j>0 && arr[j] < arr[j-1]; j--) {
				swap(arr,j,j-1);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of the list you would like to sort: ");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*(length*2));
		}
		System.out.println("Unsorted list: ");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("Sorted list: ");
		System.out.println(Arrays.toString(arr));
	}

}