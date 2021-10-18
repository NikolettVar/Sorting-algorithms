package quicksort;

public class QuickSort {

	static void quickSort(int[] f, int start, int end) {
		if (start < end) {
			int partitionIndex = partition(f, start, end);
			quickSort(f, start, partitionIndex - 1);
			quickSort(f, partitionIndex + 1, end);
		}
	}

	static int partition(int[] f, int start, int end) {
		int pivot = f[end];
		int i = start - 1;
		for (int j = start; j < end; j++) { // loop through all the values
			if (f[j] <= pivot) {
				i++;

				int swapTemp = f[i];
				f[i] = f[j];
				f[j] = swapTemp;
			}
		}

		int swapTemp = f[i + 1];
		f[i + 1] = f[end];
		f[end] = swapTemp;

		return i + 1;
	}

	public static void main(String[] args) {

		int[] arr = { 5, 2, 4, 8, 9, 6 };
		System.out.print("Array before sorting: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		quickSort(arr, 0, arr.length-1);

		System.out.print("Array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}
