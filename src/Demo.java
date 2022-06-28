
import java.time.Duration;
import org.apache.logging.log4j.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	private static Logger log=LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Sneha study/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://sso.teachable.com/secure/9521/identity/login/password?wizard_id=4xbHKy8-gA7J5aqmu4jU89jM2xw9lR6CdJNKUDLhrAFaWc_eZdLFGAVTvLvbjEdCUiIRSjSNMin80T1DR7LacA");
		WebElement email=driver.findElement(By.cssSelector("input#email"));
		
		email.click();
		email.sendKeys("snehamohite003@gmail.com");
		log.error("This is error");
		
		
	driver.findElement(By.xpath("//form/div[2]/div/input")).sendKeys("Password");
		
	
WebElement Submit=driver.findElement(By.xpath("//input[contains(@name,'comm')]"));
		
		Submit.click();
		log.debug("this is debug");
		
		
		String text=driver.findElement(By.cssSelector("div.bodySmall")).getText();
		
		System.out.println("validation is"+text);
		
	
		
		
		
		
		driver.findElement(By.partialLinkText("Forg")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//form/div/input")).sendKeys("sneha.mohite@gmail.com");
		
		
		driver.findElement(By.xpath("//input[@name='commit']")).click();
		log.fatal("this is fatal");
		Thread.sleep(2000);
		
		String text1=driver.findElement(By.xpath("//main[@class='col-12-xs p-v-7-m']/div/p[3]")).getText();
		System.out.println("validation is"+text1);
	    String[] pass=text1.split(",");
	    String[] pass1=pass[1].split(",");
	    
		System.out.println("validation is"+pass1[0]);
		

		
		
	}

}
