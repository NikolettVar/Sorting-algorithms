package selectionsort;

public class SelectionSort {
	
	public static void selectionSort(int f[]) {
		for(int i = 0; i<f.length; i++) {
			int k = i; //smallest item in array
			for(int j = i+1; j<f.length; j++) {
				if(f[j] < f[k]) {
					k = j;
				}
			}
			int temp = f[i];
			f[i] = f[k];
			f[k] = temp;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 4, 8, 9, 6};
		System.out.print("Array before sorting: ");

	      for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
	      }  
	      System.out.println(); 
	      
	      selectionSort(arr);
	      
	      System.out.print("Array after sorting:");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
		

	}

}
