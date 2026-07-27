package Practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice {
	
	public class testingtestng {

		@BeforeClass
		public void login() {
			
			
			System.out.println("User logged in");
		}
		
		
		@Test(priority=2)
		public void search() {
			
			System.out.println("User searched");
		}
		
		@Test(priority = 3)
		public void testinglogin() {
			
			
			System.out.println("User done adv search");
		}
		
		
		@Test(priority=1)
		public void Advsearch() {
			
			System.out.println("User done adv search");
		}
		
		@AfterClass
		public void logout() {
			
			System.out.println("User logged out");
			
		}

	}
}
