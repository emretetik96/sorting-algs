public class SelectionSort extends Sort {
	
	public static void selectionSort(int[] arr) {
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the length of the list you would like to sort: ");
		int length = Integer.parseInt(args[0]);
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