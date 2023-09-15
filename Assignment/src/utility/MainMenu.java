package phase.project.utility;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

import phase.project.exception.ProperOptionValue;

public class MainMenu {
	
	static File rootPath = new File("/home/fabianhoffmanvo/Desktop/phase1EndProject/Phase1EndProject/FilesFolder");
	
	public static void menuOptions() {
		Scanner sc =new Scanner(System.in);
		String con;
		do {
			System.out.println("1:Display all files in ascending order");	//Display the menu options on start-up
			System.out.println("2:Sub Option");
			System.out.println("3:Exit");
			System.out.println("Plz enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:String listOfFiles[] = rootPath.list();			//Display the files in ascending order
				Arrays.sort(listOfFiles);
				for(String name:listOfFiles) {
					System.out.println(name);
				}
				//System.out.println("all files");			
				break;
			case 2:SubMenu.subMenuOptions();				//Redirect to Sub Menu options for create, delete and search file
					break;
			case 3:System.out.println("Thank you, Good Bye...");	//Exit the program
				System.out.println("Program terminated ");
				System.exit(0);
			}
			
			System.out.println("do you want to continue?(y/n)");	//Loop to check if you want to terminate after menu item completion
			con = sc.next();
			
			try {
			if(!con.equalsIgnoreCase("y") || con.equalsIgnoreCase("n")) {		//Check if user entered correct key
				throw new ProperOptionValue("Plz enter Y or N");
			}
			}catch(Exception e) {											//Exception handling
		      System.out.print(e);
			}
			
		} while (con.equalsIgnoreCase("y"));							//Remove case sensitivity on user selection for terminate or not
		sc.close();
		
	}
}