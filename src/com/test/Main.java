package com.test;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type TEST to print a file.  Type READ to read into an array.  Type CREATE to create a test.");
        String command = scanner.nextLine();
    }
}

class Readfile {	//open Readfile
	public static void main(String [] args) {	//open main
		//name of file being read
		String fileName = "test.txt";

		// String for taking one line at a time
		String line = null;

		try {	//open try
			//making a reader
			FileReader fileReader =
			new FileReader(fileName);

			//making a bufferedreader
			BufferedReader bufferedReader =
			new BufferedReader(fileReader);


			while((line = bufferedReader.readLine()) != null) {//open while to read in one line at a time

				String[] words = line.split(" ");	//splits the line in to a word array by separating at every space.
        System.out.println(words)


			}	//close while
			bufferedReader.close();
    }
		catch(FileNotFoundException ex) {	//open catch
			System.out.println(
			"Cannot open file '" + fileName + "'");
		}	//close catrch
		catch(IOException ex) {	//open catch
			System.out.println(
			"Error reading file '" + fileName + "'");
		}	//close catch
	}	//close main
}	//close ReedMlab8p1
