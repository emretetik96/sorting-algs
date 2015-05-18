import java.util.Arrays;
import java.util.Scanner;

//currently only works for positive integers
public class RadixSort {

    public static void radixSort(int[] arr) {
	int highestDigitPlace = highestDigitPlace(arr);
	System.out.println(Arrays.toString(arr));
	for(int i=0; i<highestDigitPlace; i++) {
	    int[] frequencies = new int[10];
	    int[] copy = new int[arr.length];
	    for (int j=0; j<arr.length; j++){
		int digitPlace = (arr[j] / (int)Math.pow(10,i)) % 10;
		frequencies[digitPlace] = frequencies[digitPlace] + 1;
	    }
	    System.out.println(Arrays.toString(frequencies));
	}
	
    }

    public static int highestDigitPlace(int[] arr) {
	int max = 0;
	for (int i=0; i<arr.length; i++) {
	    if (arr[i] > max) {
		max = arr[i];
	    }
	}
	int digitPlace = 0;
	while(max > 0) {
	    max /= 10;
	    digitPlace++;
	}
	return digitPlace;
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
	radixSort(arr);
	System.out.println("Sorted list: ");
	System.out.println(Arrays.toString(arr));
    }

}