package daruen.palindrome;

public class Palindrome {
	//Having the definition of palindrome of the exercise we could conclude that the String should be already cleaned from whitespaces
	public static boolean isPalindrome(String word){
		
		boolean res=true;
		
		int middle=word.length()/2;
		int lastPosition=word.length()-1;
		
		for(int i=0; i<middle;i++){
			if(word.charAt(i)!=word.charAt(lastPosition-i)){
				res=false;
				break;
			}
		}
		
		
		return res;
	}

}
