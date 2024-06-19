//Booking
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Booking {
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement departureCityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='From']")));
         departureCityInput.click();

         // Enter "Vijayawada" to trigger the dropdown suggestions
         departureCityInput.sendKeys("Vijayawada");

         // Wait for the dropdown options to be visible
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".choices.dropdown-menu.dropdown-menu-right.show")));

         // Find the correct option in the dropdown and click it
         List<WebElement> cityOptions = driver.findElements(By.cssSelector(".choices.dropdown-menu.dropdown-menu-right.show .choice.dropdown-item.text-dark.ng-binding.ng-scope"));
         for (WebElement option : cityOptions) {
             if (option.getText().trim().equalsIgnoreCase("VIJAYAWADA")) {
                 option.click();
                 break;
             }
         }
         WebElement arrivalCityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='To']")));
         arrivalCityInput.click();

         // Enter "Vijayawada" to trigger the dropdown suggestions
         arrivalCityInput.sendKeys("Hyderabad");

         // Wait for the dropdown options to be visible
         wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".choices.dropdown-menu.dropdown-menu-right.show")));

         // Find the correct option in the dropdown and click it
         List<WebElement> CityOptions = driver.findElements(By.cssSelector(".choices.dropdown-menu.dropdown-menu-right.show .choice.dropdown-item.text-dark.ng-binding.ng-scope"));
         for (WebElement option : CityOptions) {
             if (option.getText().trim().equalsIgnoreCase("HYDERABAD")) {
                 option.click();
                 break;
             }
         }
         driver.findElement(By.xpath("/html/body/ng-view/div[1]/search/div/div[1]/div[1]/div[3]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("/html/body/ng-view/div[1]/search/div/div[1]/div[1]/div[3]/datepicker/div/div[4]/a[23]")).click();
         Thread.sleep(1000);
         driver.findElement(By.className("search")).click();
         Thread.sleep(5000);
         driver.findElement(By.className("ev-bus-timings")).click();
         Thread.sleep(5000);
         WebElement seat45 = driver.findElement(By.cssSelector(".col-2.seatWrapper.text-center.text-secondary a.seat.seat-45"));
         // Click on the seat to select it
         seat45.click();
         Thread.sleep(3500);
         //Selecting Boarding Point 
         Robot robot = new Robot();
         //Selecting PickUp
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        //Selecting Dropping Point
		robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//Entering Passenger Details
		WebElement name = driver.findElement(By.id("name_0"));
		name.sendKeys("Anvesh");
		Thread.sleep(1000);
		WebElement age = driver.findElement(By.id("age_0"));
		age.sendKeys("19");
		Thread.sleep(1000);
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("abcd@gmail.com");
		Thread.sleep(1000);
		WebElement phoneNumber = driver.findElement(By.id("mobile"));
		phoneNumber.sendKeys("6309707203");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"paymentForm\"]/div[3]/div[4]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ng-view/main/div[1]/div[3]/div[2]/button")).click();
		Thread.sleep(35000);
		driver.quit();
	}
}