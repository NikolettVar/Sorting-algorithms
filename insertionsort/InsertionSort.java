package insertionsort;

public class InsertionSort {
	
	public static void insertionSort(int k[]) {
		int j = 1;
		while(j<k.length){
			int i = j;
			while(i>0 && k[i] < k[i-1]) {
				int temp = k[i];
				k[i] = k[i-1];
				k[i-1] = temp;
				i = i-1;
			}
			j = j+1;
		}
	}

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 4, 8, 9, 6};
		System.out.print("Array before sorting: ");

	      for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
	      }  
	      System.out.println(); 
	      
	      insertionSort(arr);
	      
	      System.out.print("Array after sorting:");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
		
	}

}
