package bubblesort;

public class BubbleSort {
	
	public static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;
		
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j < (n-i-1); j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		  
	}
	

	public static void main(String[] args) {
	
		int[] arr = {5, 2, 4, 8, 9, 6};
		System.out.print("Array before sorting: ");

	      for(int i=0; i < arr.length; i++){  
              System.out.print(arr[i] + " ");  
	      }  
	      System.out.println(); 
	      
	      bubbleSort(arr);
	      
	      System.out.print("Array after sorting:");  
          for(int i=0; i < arr.length; i++){  
                  System.out.print(arr[i] + " ");  
          }  
		

	}

}
