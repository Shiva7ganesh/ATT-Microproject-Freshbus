//left side links in footer 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
public class Leftfooter {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chromedriver", "C:\\Users\\anves\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		Thread.sleep(4000);
		WebElement searchbar=driver.findElement(By.name("q"));
		searchbar.sendKeys("fresh bus");
		searchbar.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3500);
		//Selecting About
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/div/a[1]")).click();
		Thread.sleep(3500);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		//Selecting Offers
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/div/a[2]")).click();
		Thread.sleep(2000);
		//Selecting Careers
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/div/a[3]")).click();
		Thread.sleep(2000);
		//Selecting FAQ
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[1]/div/a[4]")).click();
		Thread.sleep(2000);
		//Viewing Answer
		driver.findElement(By.xpath("/html/body/ng-view/div/div[2]/div/ul/li[2]/div/img")).click();
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}
}