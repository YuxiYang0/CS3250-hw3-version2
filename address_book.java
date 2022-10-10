import java.io.InputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.io.PrintStream;
import java.util.Scanner;

public class address_book {
	HashMap <String,String> addressBook = new HashMap<String,String>();


	String string;
	public address_book(String string) {
		// TODO Auto-generated constructor stub
		this.string = string;
	}	
	/*String name;
	public address_book(String name) {
		// TODO Auto-generated constructor stub
		this.string = name;
	}
	*/
	//Create a console: https://computinglearner.com/how-to-create-a-java-console-menu-application/
	public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }
	
	

	public static void main(String[] args) {
		
		String[] options = {"1- Enter two address books (.csv) to be merged",
                "2- Add another address book to be merged",
                "3- Look up someone's address",
                "4- Exit",
			};
        
        Scanner scanner = new Scanner(System.in);
        int option;
        while (true ){
            printMenu(options);
            option = scanner.nextInt();
            if(option == 1) {
            	System.out.println("Please enter two csv files to merge together.");
            	try {
            		BufferedReader file1 = new BufferedReader(new FileReader (args[0]));
                	BufferedReader file2 = new BufferedReader(new FileReader (args[1]));
                	HashMap <String,String> One = new HashMap<String,String>();
                	HashMap <String,String> Two = new HashMap<String,String>();
                	file1.readLine();
                	while(true) {
                		String pair = file1.readLine();
                		System.out.println(pair);
                		if(pair == null)break;
         
                	}
                	}finally {
                		break;
                	}
            }
            if(option == 4)break;
        }
    }

	public String getName() {
		// TODO Auto-generated method stub

		return string;
	}

}
