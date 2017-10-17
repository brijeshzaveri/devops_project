package devops.numbers;

public class NumberWords {

	public String toWords( int number) {
	   /* String result="";
		if (number>=0)
		{
		result = String.valueOf(number);
		}
		else
		{
		result = "Number out of range";
		}
	
		return result;*/
		String result = "" ;
		if(number>=0 && number<=999)
		{
            if(number==0)
            {
               return "Exiting ....";
    
            } 
            else 
            {
                System.out.print("NUMBER AFTER CONVERSION:");
                result=numberToWord(((number / 100) % 10), " HUNDRED");
                result=numberToWord((number % 100), " ");
            }

        } 
		else 
		{
         System.out.println("NUMBER OUT OF RANGE");
        }
        //System.out.print("\nPlease type a number between 0 and 999 OR type -1 to exit:  ");
			
		
	    return result;  
	}
	
	public String numberToWord(int num, String val) {
	    
        String ones[] = {" ", " ONE", " TWO", " THREE", " FOUR", " FIVE", " SIX", " SEVEN", " EIGHT", " NINE", " TEN", " ELEVEN", " TWELVE", " THIRTEEN", " FOURTEEN", " FIFTEEN", " SIXTEEN", " SEVENTEEN", " EIGHTEEN", " NINETEEN"};
        
        String tens[] = {" ", " ", " TWENTY", " THIRTY", " FOURTY", " FIFTY", " SIXTY", " SEVENTY", " EIGHTY", " NINETY"};
        
        
        String word="";
        if (num > 19) {
           //System.out.println(tens[num / 10] + " " + ones[num % 10]);
           word = (tens[num / 10] + " " + ones[num % 10]);
        
        } 
        else {
           word = ones[num];
        }
        if(num > 0)
        { 
        	System.out.print(val);
        }
        return word;
    }
}
