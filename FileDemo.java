import java.io.*;
public class FileDemo {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write("Hello, this is a file handling example.");
            fw.close();
            FileReader fr = new FileReader("sample.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
