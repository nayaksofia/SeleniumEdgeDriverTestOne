package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FirstTestCase {
	//FirstTest: Is For Google Home Page Test.
	
	public static void main(String[] args) {
		 
		//1. Formulate A Base Test URL
         final  String siteURL = "https://www.google.com/";
         
		//2. Locate A Web Driver BY Locating the path
         final String driverPath = "C:\\Users\\nayak\\Desktop\\simplilearn\\Phase_5_FSD\\FSD-5 WorkSpace-Practice-Projects\\DemoSeleniumTestOne\\driver\\msedgedriver.exe";
		
         //3. Set Selenium System Properties.
          System.setProperty("webdriver.edge.driver",driverPath);
		
          //4. Instantiate Selenium Web Driver . That means Create an object of the web driver.
         
          WebDriver driver = new EdgeDriver();
          
          
		//5. Launch Browser
          
          driver.get(siteURL);

		//6. Perform Test Evaluation 
          
         String expectedTitle = "Google";
         
         if (expectedTitle.equals(driver.getTitle())) {
        	 System.out.println("Test is Passed !");
         }else {
        	 System.out.println("Test is Failed !");
         }
         
		//7. Close Driver 
          driver.close();

	}

}
