import java.util.Arrays;
import java.util.Scanner;

public class QuickSort extends Sort {

	public static void quickSort(int[] arr) {
		quickSort(arr,0,arr.length);
	}

	private static void quickSort(int[] arr, int start, int end) {
		int sublength = end-start;
		int pivot = (int)(Math.random()*sublength)+start;
		swap(arr,start,pivot);

		int partition = start;

		for (int i=start+1; i<end; i++) {
			if(arr[i] < arr[start]) {
				partition++;
				swap(arr,i,partition);
			}
		}

		if(start == partition) {
			return;
		}
		else {
			swap(arr,start,partition);
			quickSort(arr,start,partition);
			quickSort(arr,partition,end);
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
		quickSort(arr);
		System.out.println("Sorted list: ");
		System.out.println(Arrays.toString(arr));
	}

}