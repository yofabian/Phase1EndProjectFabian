package phase.project.utility;

import java.io.File;
import java.util.Scanner;

public class SubMenu {
	public static void subMenuOptions() {
		Scanner ss =new Scanner(System.in);
		String path = ("/home/fabianhoffmanvo/Desktop/phase1EndProject/Phase1EndProject/FilesFolder");	
		File ff = new File("/home/fabianhoffmanvo/Desktop/phase1EndProject/Phase1EndProject/FilesFolder");
		File fd = new File("/home/fabianhoffmanvo/Desktop/phase1EndProject/Phase1EndProject/FilesFolder");
		File fs = new File("/home/fabianhoffmanvo/Desktop/phase1EndProject/Phase1EndProject/FilesFolder");
		
			System.out.println("Sub Menu Options: Created By Fabian Hoffman");	//Sub Menu display
			System.out.println("1:Create a new file ");
			System.out.println("2:Delete existing file ");
			System.out.println("3:Search a file name");
			System.out.println("4:Exit");			
			System.out.println("Plz enter your choice");
			int select = ss.nextInt();
			try {
			switch (select) {
			case 1:	//create new file method
					System.out.println("Plz enter the file name");
					String fileName = ss.next();
					String newPath = path+"/"+fileName;
					ff = new File(newPath);
					if(ff.exists()) {
						System.out.println("file already present");
					}else {
						ff.createNewFile();
						System.out.println("new file created with name as "+fileName);
					}
					break;
			case 2://delete a file method
			System.out.println("Plz enter the file to delete");
			String fileDelete = ss.next();
			String deletePath = path+"/"+fileDelete;
			fd = new File(deletePath);
			if(fd.exists()) {
				fd.delete();
				System.out.println("The file "+fileDelete+" was deleted");
			}else {
				System.out.println("The file "+fileDelete+" does not exist");
			}
					break;
			case 3://search a file method
				System.out.println("Plz enter the file to search");
				String fileSearch = ss.next();
				String searchPath = path+"/"+fileSearch;
				fs = new File(searchPath);
				if(fs.exists()) {
					System.out.println("The file "+fileSearch+" does exist");
				}else {
					System.out.println("The file "+fileSearch+" does not exist");
				}
			break;
			case 4://Return to Main Menu
				System.out.println("Back to main menu");
			break;
			}
			

			}catch(Exception e) {			//Exception handling
		      System.out.print(e);
		      ss.close();					//Closing Scanner
			}
		}
	}

