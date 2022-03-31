import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	public static void textWriter(String text) {
		try {
        	String path = System.getProperty("user.dir") + "\\src\\test.txt";
            FileWriter writer = new FileWriter(path, true);
            writer.write(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void textReader() {
		try {
        	String path = System.getProperty("user.dir") + "\\src\\test.txt";
            FileReader reader = new FileReader(path);
            int character;
 
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public static void appendFile(String text) {
		String path = System.getProperty("user.dir") + "\\src\\test.txt";

        try {
            FileWriter fw = new FileWriter(path, true);
            fw.write(text);
            fw.close();
        }
        catch(IOException e) {
        }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to File Handler\nPress W to Write to the file.\nPress R to Read the file.\nPress A to append to the file.");
		String choice = sc.next().toLowerCase();
		switch(choice) {
		case "w":
			System.out.println("Enter text to write: ");
			Scanner sc1 = new Scanner(System.in);
			String txt = sc1.nextLine();
			textWriter(txt);
			sc1.close();
			break;
		
		case "r":
			System.out.println("Reading text from the file: \n");
			textReader();
			break; 
			
		case "a":
			System.out.println("Enter text to append: ");
			Scanner sc2 = new Scanner(System.in);
			String txtAppend = sc2.nextLine();
			appendFile(txtAppend);
			sc2.close();
			break;
			
		default:
			System.out.println("Please enter a valid choice!");
		}
		sc.close();
		
	}

}
