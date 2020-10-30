import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
	
	
	/*
	 * 
	 ***** Test Steps*****
	 -Go to google.com
     -Enter CodingBook as a search term.
     -Click search button
     -See the results visually
	
	
	
	
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchbox=driver.findElement(By.xpath("//input[@name='q']"));
		
		// to type CodingBook in searchbox 
		searchbox.sendKeys("CodingBook");
		//for  to click enter
		searchbox.sendKeys(Keys.RETURN);

	}

}
