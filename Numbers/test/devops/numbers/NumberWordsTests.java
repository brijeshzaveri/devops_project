package devops.numbers;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import org.junit.*;

import devops.numbers.NumberWords;

public class NumberWordsTests {
	private NumberWords numberWords ;
	int number = 0;
	
	@Before
	public void setup() {
		try{
		
		numberWords = new NumberWords();
		BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) ) ;
	    //new NumberwordsApplication().execute();
		System.out.print( "Enter number between 1 to 999 (0 to exit): " ) ;
		String value = reader.readLine() ;
	    number = Integer.parseInt( value ) ;
	
		 String str = numberWords.toWords(number);
		 System.out.println(str);
		 //numberOneReturnsOne();
	}
		
		catch(Exception e){
			numberOutOfRangeReturnsError();
		}
	}

	
	
	@Test
	public void numberOneReturnsOne() {
		//Assert.assertEquals("One", "1", numberWords.toWords(1));
	}
	
	@Test
	public void numberOutOfRangeReturnsError() {
		
		
 //Assert.assertEquals( "Error", "Number out of range", numberWords.toWords(-1)) ;
	//Assert.assertEquals( "Error", "Number out of range", numberWords.toWords(-1)) ;
   //Assert.assertEquals( "One" ,"After Conversion", numberWords.toWords(1)) ;
	
	}

}
