import java.io.*;

public class BufferedReaderWriterExample {

    public static void main(String[] args) throws IOException {

        Reader fileReader =new FileReader(
                "C:\\Java Class Study\\Java-IO-Concept\\Java IO Character Streaming\\src\\input.txt");

        BufferedReader bufferedReader=new BufferedReader(fileReader);
        char[] chars=new char[50];
        bufferedReader.read(chars);
        System.out.println(chars);

        Writer fileWriter =new FileWriter(
                "C:\\Java Class Study\\Java-IO-Concept\\Java IO Character Streaming\\src\\output.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(chars);




    }
}
