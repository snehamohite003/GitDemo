package practice;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		 
		
System.setProperty("webdriver.chrome.driver", "C:/Sneha study/chromedriver_win32/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		AmazonPractice ap=new AmazonPractice();
		ap.getData(driver);
	}
		
		public void getData(WebDriver driver)
		{
		String[] items= {"Beetroot","Cucumber"};
		 List<String> list = Arrays.asList(items); 
		 int k=0;
		
		List<WebElement> wb=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<wb.size();i++)
		{
			String[] name=wb.get(i).getText().split("-");
			String nameV=name[0].trim();
			
			if(list.contains(nameV))
				
			{
				k++;
				
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(k==2)
					break;
			}
			
		
		}
		System.out.println(driver.findElement(By.tagName("Strong")).getText());
		
		System.out.println(driver.findElement(By.xpath("//div[@class='cart-info']/table/tbody/tr[2]/td[3]/Strong")).getText());
	   
		
		}

}
