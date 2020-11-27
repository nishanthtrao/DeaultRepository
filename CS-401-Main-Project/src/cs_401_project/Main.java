package cs_401_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {

		try {
			// Parameter for taking user input
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

			/*
			 * Input the file name
			 */ 
			String fileName;
			System.out.println("Enter the name of the file");
			fileName = bufferedReader.readLine();

			/*
			 * Store the output of the next set of statements
			 */ 
			String[] strArr = null;		// Initialize string array
			LinkedList llist = null;	// Initialize linked list

			/*
			 * read a file of strings
			 */	
			File file = new File(fileName);			// initialize the file with the filename
			Reader reader = new Reader();			// create a file reader object

			strArr = reader.readArray(file);		// store the output of the read in the string array strArr
			llist = reader.readLinkedList(file);	// store the output of the read in the linked list llist.

			/*
			 * Print out the elements of the file (Unsorted)
			 */
			printArray(strArr);			// print the array result
			printLinkedList(llist);		// print the linked list result

			/*
			 * Search algorithm execution for all the unsorted elements algorithms
			 */
			Search search = new Search();		// create a search object

			System.out.print("\nInput an element to search: ");		// read a string for searching
			String element = bufferedReader.readLine();

			int arrayIndexUnsorted = search.arraySequentialSearch(strArr, element);			// search for the element in array
			int lListIndexUnsorted = search.linkedListSequentialSearch(llist, element);		// search for the element in linked list

			/*
			 * Sorting the lists
			 */
			Sort sort = new Sort();		// create a Sort object

			sort.arrayMergeSort(strArr, 0, strArr.length-1);	// sort the string array
			sort.linkedListSort(llist);							// sort the linked list

			printArray(strArr);			// print the array after sorting
			printLinkedList(llist);		// print the linked list after sorting

			/*
			 * display the results
			 */
			if (arrayIndexUnsorted != -1) {		// Results for array
				System.out.println(element + " was found in index " + arrayIndexUnsorted + " in the array");
			} else {
				System.out.println(element + " was not found in the array");
			}

			if (lListIndexUnsorted != -1) {		// Results for linked list
				System.out.println(element + " was found in index " + lListIndexUnsorted + " in the linked list");
			} else {
				System.out.println(element + " was not found in the linked list");
			}

			bufferedReader.close();		// close the buffered reader utilized for user input

		} catch (IOException e) {
			System.out.println("Input error occured!");
			System.out.println("Provide the correct file name and path");
		} catch (Exception e) {
			System.out.println("Something went wrong!!!");
		} finally {
			System.out.println("\n***GOODBYE***");
		}
	}

	public static void printArray(String [] arr) {
		System.out.println("Array: "); // Array print - header
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
	}

	public static void printLinkedList(LinkedList list) {
		System.out.println("Linked list: "); // Linked list print - header
		LinkNode node = list.getHead();
		while (node != null) {
			System.out.print(node.getInfo());
			if (node.getLink() != null) {
				System.out.print(", ");
			}
			node = node.getLink();
		}
		System.out.println();
	}
}
