package week1.day2;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String orgstr="dad";
		 String revstr= "";
		 char[] chararray=orgstr.toCharArray();
		 for(int i=chararray.length-1;i>=0;i--)
		 {
		 revstr=revstr+chararray[i];
		  System.out.println(revstr);
		 
	}
	  if (orgstr.equals(revstr))  
	         System.out.println("Palindrome.");  
	      else  
	         System.out.println("Not Palindrome.");   
	   }  
}

