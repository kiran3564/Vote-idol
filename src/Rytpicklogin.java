import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rytpicklogin {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.get("https://rytpick.com/index.php/admin/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@rytpick.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vizag@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(7000);
	WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='city_id']"));
			Select dropdown = new Select(staticdropdown);
			dropdown.selectByIndex(2);

}
}