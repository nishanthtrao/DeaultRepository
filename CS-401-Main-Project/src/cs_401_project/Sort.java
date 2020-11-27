package cs_401_project;

public class Sort {

	private void arrayMerge(String [] arr, int low, int mid, int high) {
		// Find sizes of two subarrays to be merged
		int n1 = mid - low + 1;
		int n2 = high - mid;

		/* Create temp arrays */
		String [] left = new String[n1];
		String [] right = new String[n2];

		/*Copy data to temp arrays*/
		for (int i = 0; i < n1; ++i)
			left[i] = arr[low + i];
		for (int j = 0; j < n2; ++j)
			right[j] = arr[mid + 1 + j];

		/* Merge the temp arrays */
		int i = 0, j = 0;

		// Initial index of merged sub-array array
		int k = low;
		while (i < n1 && j < n2) {
			if (left[i].compareTo(right[j]) < 0 || left[i].equals(right[j])) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			} k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			arr[k] = left[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
	
	// Main function that sorts arr[l..r] using
    public void arrayMergeSort(String arr[], int low, int high) {
        if (low < high) {
            // Find the midpoint
            int mid = (low + high) / 2;
 
            // Sort first and second halves
            arrayMergeSort(arr, low, mid);
            arrayMergeSort(arr, mid + 1, high);
 
            // Merge the sorted halves
            arrayMerge(arr, low, mid, high);
        }
    }
    
    public void linkedListSort(LinkedList list) {
    	//Node current will point to head  
        LinkNode current = list.getHead();
        LinkNode index = null;  
        String temp;  
          
        if(list.getHead() == null) {  
            return;  
        }  
        else {  
            while(current != null) {  
                //Node index will point to node next to current  
                index = current.getLink();  
                  
                while(index != null) {  
                    //If current node's data is greater than index's node data, swap the data between them  
                    if(current.getInfo().compareTo(index.getInfo()) > 0) {  
                        temp = current.getInfo();  
                        current.setInfo(index.getInfo());  
                        index.setInfo(temp);  
                    }  
                    index = index.getLink();  
                }  
                current = current.getLink();  
            }      
        }
    }
}
