import java.util.Arrays;
import java.util.Scanner;

//currently only works for positive integers
public class RadixSort {

    public static int[] radixSort(int[] arr) {
	int highestDigitPlace = highestDigitPlace(arr);
	int[] copy;
	for(int i=0; i<highestDigitPlace; i++) {
	    int[] frequencies = new int[10];
	    copy = new int[arr.length];
	    for (int j=0; j<arr.length; j++){
		int digitPlace = (arr[j] / (int)Math.pow(10,i)) % 10;
		frequencies[digitPlace] = frequencies[digitPlace] + 1;
	    }
	    for (int j=1; j<frequencies.length; j++) {
		frequencies[j] = frequencies[j] + frequencies[j-1];
	    }
	    for (int j=arr.length-1; j>=0; j--) {
		int digitPlace = (arr[j] / (int)Math.pow(10,i)) % 10;
		copy[frequencies[digitPlace]-1] = arr[j];
		frequencies[digitPlace] = frequencies[digitPlace]-1;
	    }
	    arr = copy;
	}
	return arr;
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
	    arr[i] = (int)(Math.random()*(Math.pow(length,2)));
	}
	System.out.println("Unsorted list: ");
	System.out.println(Arrays.toString(arr));
	arr = radixSort(arr);
	System.out.println("Sorted list: ");
	System.out.println(Arrays.toString(arr));
    }

}