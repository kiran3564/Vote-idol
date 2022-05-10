import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Inbbb {

	public static <WebElements> void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://colormoon.in/chithranjan/inb2b/home");
		driver.manage().window().maximize();
		
		/* driver.findElement(By.xpath("//*[@id=\"stickyheader\"]/div[3]/div[1]/div/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"locationModal\"]/div/div/div[2]/div[1]/select")).click();
		Thread.sleep(5000);
		WebElement staticdropdown=driver.findElement(By.xpath("/html[1]/body[1]/div[5]/div[1]/div[1]/div[2]/div[1]/select[1]"));
		Select dropdown = new Select (staticdropdown);
		 dropdown.selectByVisibleText("Visakhapatnam"); */
		
		driver.findElement(By.xpath("//h5[contains(text(),'Vendor Login')]")).click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("kiransai@colourmoon.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\screenshots\\hello.png"));
		
	}

}
