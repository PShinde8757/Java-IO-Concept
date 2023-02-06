import java.io.*;

public class FileReaderWriterExample {
    public static void main(String[] args) throws IOException {

        Reader fileReader=new FileReader(
                "C:\\Users\\Pratik\\IdeaProjects\\Java-IO-Concept\\Java IO Character Streaming\\src\\input.txt");

        System.out.println(fileReader.ready());

        char[] chars=new char[50];
        fileReader.read(chars);

        System.out.println(chars);

        FileWriter filewriter =new FileWriter(
                "C:\\Users\\Pratik\\IdeaProjects\\Java-IO-Concept\\Java IO Character Streaming\\src\\output.txt");


        filewriter.write(chars);


    }
}