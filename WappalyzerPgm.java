package testngprograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WappalyzerPgm {
	WebDriver driver;
	@BeforeTest
	public void set() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloadind(){
		driver.get("https://www.wappalyzer.com/");
	}
	@Test
	public void test1()
	{ 
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
	}
	@Test
	public void test2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]/span")).click();
		WebElement mouse=driver.findElement(By.xpath("//*[@id=\"list-item-50\"]/div/div[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(mouse).perform();
		//driver.findElement(By.xpath("//*[@id=\\\"list-item-50\\\"]/div/div[1]")).click();
}


@Test
public void test3() {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/main/div/div[1]/header/div/div/div/div[2]/div/div[2]/div/div/div/div[1]/div[1]")).sendKeys("tech");
}
@Test
public void test4() {

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/div[3]/div/div[2]/button/span")).click();
	}
}
