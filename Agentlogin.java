//agent login
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Agentlogin {
	public static void main(String[] args) throws InterruptedException{
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
		//Agent login button
		driver.findElement(By.className("header-agent")).click();
		Thread.sleep(2000);
		
		((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank');");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1)); // Switch to new tab
        
		//Opening the agent login 
		driver.get("https://agent.freshbus.com/");
		Thread.sleep(3000);
		//Fill the details
		WebElement usernameField = driver.findElement(By.name("username"));
		usernameField.sendKeys("Selena");
		Thread.sleep(3000);
        WebElement passwordField = driver.findElement(By.name("password")); 
        passwordField.sendKeys("Abcd@123");
        Thread.sleep(3000);
        //Login page
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[3]/div/button")).click();
        Thread.sleep(2000);
        driver.quit();
	}
}