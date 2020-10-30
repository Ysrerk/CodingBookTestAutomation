import java.io.FileReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class BasicTestAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Test Amazon login page with below steps:
	
		Invalid input

			-Go to amazon.com
			-Enter your login name
			-Click continue button
			-Enter invalid password name
			-Click sign in button
			-See the results visually
	
	
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("nav-link-accountList")).click();
		
		WebElement email=driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("invalidemail@gmail.com");
		
		driver.findElement(By.id("continue")).click();
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("fakepassword");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		
		
		
		
		
		
		
		
		
		
}
