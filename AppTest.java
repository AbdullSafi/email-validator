
//import junit.framework.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	App test = new App();

	
	@Test
	public void testEmail()
	{	
		int expected = 2;
		
		assertEquals(expected,test.passedRules("info@example.com"));
	}