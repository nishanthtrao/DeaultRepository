package cs_401_project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Reader {

	/*
	 * This is a function to read a file and return a string array of the data stored in the file
	 */	
	public String[] readArray(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		List<String> list = new ArrayList<String>();
		String content = reader.readLine();
		do {
			list.add(content);
			content = reader.readLine();
		} while (content != null);
		reader.close();
		int size = list.size();
		String [] stringArr = new String[size];
		for (int i = 0; i < size; i++) {
			stringArr[i] = list.get(i);
		}
		return stringArr;
	}

	/*
	 * This is a function to read a file and return a linked list of strings of the data stored in the file
	 */
	public LinkedList readLinkedList(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		LinkedList list = new LinkedList();
		String content = reader.readLine();
		do {
			list.add(content);
			content = reader.readLine();
		} while (content != null);
		reader.close();
		return list;
	}
}
