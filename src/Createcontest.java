import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Createcontest {
	public void login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://colormoon.in/vote_idol/admin/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@voteidol.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("vizag@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//li//span[@class='nav-label']")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[7]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div[2]/div/div/div/div[1]/div/a")).click();
		driver.findElement(By.xpath("//input[@name='contest_name']")).sendKeys("hello");
		//driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div/div/button/div/div/div")).click();

	WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='country']"));
	Select dropdown = new Select(staticdropdown);
			dropdown.selectByIndex(1);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Createcontest cr = new Createcontest();
		cr.login();
		
	

	}

}
