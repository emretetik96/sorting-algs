import java.util.*;

public class SelectionSort extends Sort {
	
	public static void selectionSort(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			int minIndex=i;
			for (int j=i; j<arr.length; j++) {
				if (arr[j]<arr[minIndex]) {
					minIndex = j;
				}
			}
			swap(arr,minIndex,i);
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
		selectionSort(arr);
		System.out.println("Sorted list: ");
		System.out.println(Arrays.toString(arr));
	}

}