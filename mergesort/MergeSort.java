package mergesort;

public class MergeSort {
	public static void mergeSort(int f[], int lowerB, int upperB) {
		if (lowerB + 1 < upperB) {
			int mid = (lowerB + upperB) / 2;
			mergeSort(f, lowerB, mid);
			mergeSort(f, mid, upperB);
			merge(f, lowerB, mid, upperB);
		}
	}

	static void merge(int f[], int lowerB, int mid, int upperB) {
		int i = lowerB;
		int j = mid;
		// use temp array to store merged sub-sequence
		int temp[] = new int[upperB - lowerB];
		int t = 0;
		while (i < mid && j < upperB) {
			if (f[i] <= f[j]) {
				temp[t] = f[i];
				i++;
				t++;
			} else {
				temp[t] = f[j];
				j++;
				t++;
			}
		}

		// tag on remaining sequence
		while (i < mid) {
			temp[t] = f[i];
			i++;
			t++;
		}
		while (j < upperB) {
			temp[t] = f[j];
			j++;
			t++;
		}
		// copy temp back to f
		i = lowerB;
		t = 0;
		while (t < temp.length) {
			f[i] = temp[t];
			i++;
			t++;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 4, 8, 9, 6 };
		System.out.print("Array before sorting: ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		mergeSort(arr, 0, arr.length);

		System.out.print("Array after sorting: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
