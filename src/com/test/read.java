class Readfile {
public static void main(String [] args) {
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
  int count = 0;
  String []lines = new String[100];
  lines[count]=line;
  System.out.println(lines[count]);

  count++;
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
}	//close Readfile
