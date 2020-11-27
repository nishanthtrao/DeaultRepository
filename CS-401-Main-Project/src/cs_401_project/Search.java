package cs_401_project;

public class Search {

	public int arraySequentialSearch(String arr[], String element) {
		int index = -1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i].equals(element)) {
				index = i;
				break;
			}
		}

		System.out.println("The search is performed for " + count + " iterations.");
		System.out.println("The worst-case time complexity of sequential search of an array is of the order O(n)");

		return index;		
	}

	public int arraySortedSequentialSearch(String arr[], String element) {
		int index = -1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			count++;
			if (arr[i].equals(element)) {
				index = i;
				break;
			} else if (arr[i].compareTo(element) < 0) {
				break;
			}
		}

		System.out.println("The search is performed for " + count + " iterations.");
		System.out.println("The worst-case time complexity of sequential search of a sorted array is of the order between O(1) and O(n)");

		return index;
	}

	public int arrayBinarySearch(String arr[], String element) {
		int high = arr.length-1, low = 0;
		int index = -1;
		int count = 0;
		while (low <= high) {
			count ++;
			int mid = (high + low) / 2;
			System.out.println(arr[mid]);
			if (arr[mid].equals(element)) {
				index = mid;
				break;
			} else if (arr[mid].compareTo(element) < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (index == -1) {
			System.out.println(count);
			System.out.println("The worst-case time complexity of binary search of an array is of the order O(log n)");
		}
		return index;
	}

	public int linkedListSequentialSearch(LinkedList list, String element) {
		int index = -1, count = 0;
		LinkNode node = list.getHead();
		while(node != null) {
			count++;
			if(node.getInfo().equals(element)) {
				index = (count-1);
				break;
			}
			node = node.getLink();
		}

		System.out.println("The search is performed for " + count + " iterations.");
		System.out.println("The worst-case time complexity of sequential search for a linked list is of the order O(n)");

		return index;
	}

	public int linkedListSortedSequentialSearch(LinkedList list, String element) {
		int index = -1, count = 0;
		LinkNode node = list.getHead();
		while(node != null) {
			count++;
			if(node.getInfo().equals(element)) {
				index = count;
				break;
			} else if (node.getInfo().compareTo(element) < 0) {
				break;
			}
			node = node.getLink();
		}

		System.out.println("The search is performed for " + count + " iterations.");
		System.out.println("The worst-case time complexity of sequential search for a sorted linked list is of the order between O(1) and O(n)");

		return index;
	}

}
