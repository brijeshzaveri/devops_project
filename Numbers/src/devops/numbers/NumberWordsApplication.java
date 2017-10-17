package devops.numbers;

import java.io.BufferedReader;
//import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public final class NumberWordsApplication {
	private final NumberWords numberWords ;
	private final BufferedReader reader ;
	//private final Scanner scanner;
	
	public NumberWordsApplication() {
		numberWords = new NumberWords() ;
		reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
		//scanner=new Scanner(System.in);
	}
	
	public void execute() {
		while( true ) {
			try {
				//int number = 0;
				System.out.print( "Enter number between 1 to 999 (0 to exit): " ) ;
				String value = reader.readLine() ;
				int number = Integer.parseInt( value ) ;
				//number = scanner.nextInt();
				//while(number!=0) 	
					//}
				//}
		        String str = numberWords.toWords(number);
		        System.out.println(str);
				
			} catch ( NumberFormatException | IOException e) {
				System.out.println( "Invalid number" ) ;
			}
		}
	}

	public static void main(String[] args) {
		new NumberWordsApplication().execute() ;
		
	}

}
