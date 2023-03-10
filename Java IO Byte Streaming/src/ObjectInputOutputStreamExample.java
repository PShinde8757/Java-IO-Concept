import java.io.*;

/**
 * Working of ObjectInputStream and ObjectOutputStream
 * 1. The ObjectInputStream is mainly used to read data/object written by the ObjectOutputStream.
 * 2. Basically, the ObjectOutputStream converts/writes Java objects into corresponding streams.
 *    Those converted streams can be stored in files or transferred through networks.
 *    This is known as Serialization.
 * 3. Now, if we need to read those objects, we will use the ObjectInputStream that will
 *    convert the streams back to corresponding objects. This is known as Deserialization.
 */

class   Student implements Serializable {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class ObjectInputOutputStreamExample {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Integer id=100;
        String msg= "Hello Object Input/Output Stream";
        Student student=new Student("Pratik", 150);


        OutputStream fileoutputstream=new FileOutputStream(
                "C:\\Users\\prati\\Java-IO-Concept\\Java IO Byte Streaming\\src\\object.txt");

        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileoutputstream);

        objectOutputStream.writeObject(id);
        objectOutputStream.writeObject(msg);
        objectOutputStream.writeObject(student);

        FileInputStream fileInputStream =new FileInputStream(
                "C:\\Users\\prati\\Java-IO-Concept\\Java IO Byte Streaming\\src\\object.txt");

        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());
        System.out.println(objectInputStream.readObject());

    }
}
