package TestJenkins;
import org.testng.annotations.Test;

public class MyTestMaven {
	
	@Test
	public void myTest()
	
	{
		
		for(int i=1;i<=10;i++)
		{
			
			System.out.println("Hello World "+i);
		}
		
		System.out.println("Exxecuting through GIT changes");
	}

}
