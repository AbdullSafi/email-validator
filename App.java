
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class App
{
  
    String email = "^[A-Z._]+@gmail\\.com$$";

    Pattern validEmail = Pattern.compile( email ,Pattern.CASE_INSENSITIVE);  
    Matcher match;
	
 
 //tests if string accepted or rejeted, without det. number of rules passed
  public boolean validate(String someString)
  {
	
	
	  match = validEmail.matcher(someString);
	  
	  return match.find();
	 
  }

//tests passed rules
public int passedRules(String someString)
{
	int passedRules = 0;
    Pattern p = Pattern.compile("@", Pattern.CASE_INSENSITIVE);
	Matcher matchAt = p.matcher(someString);
	
	//rule @
	 int count = 0;
     while(matchAt.find())
     {
         count++;
     }
         if (count == 1)
        	 passedRules++;
         
     
     //rule2 "\\."
     p = Pattern.compile("\\.", Pattern.CASE_INSENSITIVE);
     matchAt = p.matcher(someString);
     count = 0;
     while(matchAt.find()) 
     {
         count++;
     }  
     
     if (count == 1)
    	 passedRules++;
     
   
     
     //rule3 domain name is restricted to gmail.com
     p = Pattern.compile("@gmail\\.com", Pattern.CASE_INSENSITIVE);
     matchAt = p.matcher(someString);
     if(matchAt.find())
    	  passedRules++;
     
     //rule 4 no digits in name 
     p = Pattern.compile("\\D@", Pattern.CASE_INSENSITIVE);
     matchAt = p.matcher(someString);
      if(matchAt.find())
         passedRules++;
     
     return passedRules;
  
}

/*public static void main(String[] args)
{
	App test = new App();
	System.out.println("rules"+" "+test.passedRules("asa@example.com")+" "+test.validate("asa@example.com"));

}*/

}