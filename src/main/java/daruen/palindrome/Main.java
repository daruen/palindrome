package daruen.palindrome;


public class Main 
{
    public static void main( String[] args )
    {

    	if(args.length!=1){
    		System.out.println("You need to pass the word as an argument.");
    		return;
    		
    	}
    	
    	String wordToCheck = args[0];
    	
    	System.out.println("Checking if "+wordToCheck +" is a palindrome\n");
    	
    	boolean isPalindrome=Palindrome.isPalindrome(wordToCheck);
    	
    	if(isPalindrome)
    		System.out.println("Yes, "+wordToCheck+ " is a palindrome.");
    	else
    		System.out.println("Sorry, "+wordToCheck+ " is not a palindrome.");
    	
    	
    
    }
}
