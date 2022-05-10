import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Checkboxes")).click();
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();;
		
	}

}
