import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Texting {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://the-internet.herokuapp.com/");
		Thread.sleep(5000);
		driver.findElement(By.linkText("A/B Testing")).click();
		driver.manage().window().maximize();
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("F:\\screenshots\\image.png"));
		
		/*String str = driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		System.out.println(str);
		*/
	}

}
