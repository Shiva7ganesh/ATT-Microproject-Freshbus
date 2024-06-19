//social media links and privacy policy
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
public class Socialandprivacy {
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
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/div/a[1]")).click();//clicking facebook
		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/div/a[2]")).click();//clicking twitter
		Thread.sleep(5000);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/div/a[3]")).click();//clicking instagram
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/div/a[4]")).click();//clicking youtube
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[2]/div/a[5]")).click();//clicking linkedin
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[3]/div/a[1]")).click();//clicking google play
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[1]/div[3]/div/a[2]")).click();//clicking app store
		Thread.sleep(5000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/footer/div/div[2]/div/div[1]/a[1]")).click();//clicking terms and conditions
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0)); // Switch to old tab
        Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/footer/div/div[2]/div/div[1]/a[2]")).click();//clicking privacy policy
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
        driver.switchTo().window(tabs.get(0)); // Switch to old tab
	}
}