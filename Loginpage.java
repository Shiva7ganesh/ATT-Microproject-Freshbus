//login page
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
public class Loginpage {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chromedriver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("fresh bus");
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		//Clicking login button
		driver.findElement(By.className("login-button-main")).click();
		Thread.sleep(7000);
		//Filling phone number
		WebElement num = driver.findElement(By.id("username"));
		num.sendKeys("7896541256");
		Thread.sleep(3000);
		//Click on send otp
		driver.findElement(By.xpath("//*[@id=\"loginfrm\"]/button")).click();
		Thread.sleep(5000);
		//Send otp keys
		WebElement otp1 = driver.findElement(By.id("digit-1"));
		otp1.sendKeys("8");
		Thread.sleep(2000);
		WebElement otp2 = driver.findElement(By.id("digit-2"));
		otp2.sendKeys("6");
		Thread.sleep(2000);
		WebElement otp3 = driver.findElement(By.id("digit-3"));
		otp3.sendKeys("5");
		Thread.sleep(2000);
		WebElement otp4 = driver.findElement(By.id("digit-4"));
		otp4.sendKeys("7");
		Thread.sleep(2000);
		WebElement otp5 = driver.findElement(By.id("digit-5"));
		otp5.sendKeys("9");
		Thread.sleep(2000);
		WebElement otp6 = driver.findElement(By.id("digit-6"));
		otp6.sendKeys("0");
		Thread.sleep(2000);
		//Verify and proceed button
		driver.findElement(By.className("verify-and-proceed-otp")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}