import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

	public static void mergeSort(int[] arr) {
		mergeSort(arr,0,arr.length);
	}

	private static void mergeSort(int[] arr, int start, int end) {

		if (end-start == 1) {
			return;
		}

		int halfway = (end-start)/2 + start;
		mergeSort(arr,start,halfway);
		mergeSort(arr,halfway,end);

		int[] temp = Arrays.copyOfRange(arr,start,halfway);
		//System.out.println(Arrays.toString(temp));
		int i = start;
		int k = 0;
		int m = halfway;

		while(k<temp.length && m<end) {
			if (arr[m]<=temp[k]) {
				arr[i] = arr[m];
				i++;
				m++;
			}
			else {
				arr[i] = temp[k];
				i++;
				k++;
			}
		}

		while(k<temp.length) {
			arr[i] = temp[k];
			i++;
			k++;
		}

	}

	private static void print(int[] arr, int start, int end) {
		System.out.println("==============");
		for (int i=start; i<end; i++) {
			System.out.println(arr[i]);
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
		mergeSort(arr);
		System.out.println("Sorted list: ");
		System.out.println(Arrays.toString(arr));
	}

}