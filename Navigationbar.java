import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
public class Navigationbar {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\anves\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("fresh bus");
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		Thread.sleep(2000);
		//Selecting About
		driver.findElement(By.xpath("/html/body/header/div/div/ul[1]/li[2]/a")).click();
		Thread.sleep(3500);
		//Selecting Fresh Pass
		driver.findElement(By.xpath("/html/body/header/div/div/ul[1]/li[3]/a")).click();
		Thread.sleep(3500);
		//Selecting Green Coins
		driver.findElement(By.xpath("/html/body/header/div/div/ul[1]/li[4]/a")).click();
		Thread.sleep(3500);
		//Selecting Refer & Earn
		driver.findElement(By.xpath("/html/body/header/div/div/ul[1]/li[5]/a")).click();
		Thread.sleep(3500);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1500);
		WebElement numberOfReferels = driver.findElement(By.id("numReferral"));
		numberOfReferels.sendKeys("2");
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(2000);
		//Selecting Logo 
		driver.findElement(By.xpath("/html/body/header/div/a/img")).click();
		Thread.sleep(5000);
		driver.quit();
	}
}