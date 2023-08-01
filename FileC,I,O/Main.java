import java.io.File;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File file = new File("source.txt");
		/*
		 * if (file.exists()) { System.out.println("it does exists!!!");
		 * System.out.println("Does it exist? " + file.exists());
		 * System.out.println("The file has " + file.length() + " bytes");
		 * System.out.println("Can it be read? " + file.canRead());
		 * System.out.println("Can it be written? " + file.canWrite());
		 * System.out.println("Is it a directory? " + file.isDirectory());
		 * System.out.println("Is it a file? " + file.isFile());
		 * System.out.println("Is it absolute? " + file.isAbsolute());
		 * System.out.println("Is it hidden? " + file.isHidden());
		 * System.out.println("Name of the file? " + file.getName());
		 * System.out.println("Parent Directory? " + file.getParent());
		 * System.out.println("Absolute path is " + file.getAbsolutePath());
		 * System.out.println("Last modified on " + new
		 * java.util.Date(file.lastModified()));
		 * 
		 * }
		 */
		try (PrintWriter Print = new PrintWriter(file)) {
			Print.print("Efrem Girma");
			Print.println(26);
			Print.print("Solomon Girma");
			Print.println(30);
			Print.close();
		}
		/*
		 * if (file.exists()) { Scanner scan = new Scanner(file); while (scan.hasNext())
		 * { String Name = scan.next(); String age = scan.next(); String BroName =
		 * scan.next(); String broage = scan.next(); System.out.println("My name is" +
		 * Name + "I'm" + age + "years old My brother Name is" + BroName +
		 * "And his age is" + broage); scan.close(); } }
		 */

	}
}
