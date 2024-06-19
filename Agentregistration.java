//Agent Registration
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
public class Agentregistration {
	public static void main(String args[]) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chromedriver","C:\\Users\\ABDUL MUQSIT\\Downloads\\chromedriver-win64\\chromedriver-win64\\\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://agent.freshbus.com/agentregistration.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement agency = driver.findElement(By.xpath("//*[@id=\"agencyname\"]"));
		agency.sendKeys("Arriva");
		Thread.sleep(2000);
		WebElement owner = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));
		owner.sendKeys("Abdul");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"cemail\"]"));
		email.sendKeys("22r01a0514@cmrithyderabad.edu.in");
		Thread.sleep(2000);
		WebElement phone = driver.findElement(By.xpath("//*[@id=\"phone\"]"));
		phone.sendKeys("8519801753");
		Thread.sleep(2000);
		Select location = new Select(driver.findElement(By.id("location")));
		location.selectByIndex(4);
		Thread.sleep(2000);
		WebElement adhar = driver.findElement(By.xpath("//*[@id=\"aadhar\"]"));
		adhar.sendKeys("8519 8017 5342");
		Thread.sleep(2000);
		WebElement pan = driver.findElement(By.xpath("//*[@id=\"pan\"]"));
		pan.sendKeys("8519 8017 5342");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/section/div[2]/div/form/div[1]/div[7]")).click();
		Thread.sleep(4000);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection("\"C:\\Users\\shiva\\Downloads\\week12.pdf\"");
		clipboard.setContents(str, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/main/section/div[2]/div/form/div[1]/div[9]")).click();
		Thread.sleep(4000);
		Clipboard clipboard2 = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str2 = new StringSelection("\"C:\\Users\\shiva\\Downloads\\week12.pdf\"");
		clipboard2.setContents(str2, null);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement referal = driver.findElement(By.xpath("//*[@id=\"referedby\"]"));
		referal.sendKeys("6654321");
		Thread.sleep(2000);
		WebElement adress = driver.findElement(By.xpath("//*[@id=\"contact\"]/div[2]/div/form/div[1]/div[12]/textarea"));
		adress.sendKeys("FLAT NO-202 ,B-BLOCK,  HYD, TELANAGANA");
		Thread.sleep(2000);
		driver.findElement(By.className("sendmsg")).click();
		Thread.sleep(2000);
		}
}