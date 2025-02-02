# FreshBus Automated Testing Framework

This project contains an automated testing framework for the **[FreshBus](https://www.freshbus.com)** website, a bus booking and travel platform, developed using **Selenium** and **Java**. The goal of this project is to ensure the functionality, reliability, and performance of key features on the FreshBus platform, such as booking workflows, user registration, login processes, and real-time bus tracking.         
## Project Overview

FreshBus is a cutting-edge startup in the electric bus transportation sector, providing eco-friendly intercity travel solutions across India. This automated testing framework was developed to ensure that the website is robust and user-friendly by automating repetitive testing tasks, increasing efficiency, and improving the accuracy and consistency of testing results.

## Objectives

The objectives of this project include:

1. **Automate Repetitive Testing Tasks**: Replacing manual testing processes with automated tests to save time and reduce human error.
2. **Increase Testing Efficiency**: Execute large volumes of test cases quickly and consistently to ensure comprehensive test coverage.
3. **Ensure Comprehensive Test Coverage**: Test all essential features such as booking, user/agent registration, login, social media integrations, and navigation.
4. **Early Bug Detection**: Identify bugs early in the development cycle, before they reach production.
5. **Improve Software Quality**: Enhance the website's reliability and performance for a smoother user experience.
6. **Maintainable and Scalable Solutions**: Build a testing framework that is easily adaptable as the website evolves.

## Tools and Technologies

- **Selenium WebDriver**: For automating browser interactions.
- **Java**: For scripting the test cases.
- **TestNG**: For managing test execution and reporting.
- **ChromeDriver**: WebDriver for automating Google Chrome.
- **Eclipse IDE**: For writing and managing Java code.
- **JDK (Java Development Kit)**: Required for compiling and running Java programs.

## Requirements

### Operating Systems

- **Windows**: Windows 11 or higher
- **MAC**: OS X v10.7 or higher
- **Linux**: Ubuntu or similar

### Hardware

- Processor: Minimum 1 GHz; Recommended 2 GHz or more
- RAM: Minimum 1 GB; Recommended 4 GB or more
- Hard Drive: Minimum 32 GB; Recommended 64 GB or more

### Software

- **Java JDK** (Recommended: Version 8 or higher)
- **Eclipse IDE**
- **Selenium WebDriver**
- **Google Chrome** or **Mozilla Firefox**

## Getting Started

To get started with the FreshBus automated testing framework, follow the steps below:

### 1. Clone the Repository

Clone the repository to your local machine using the following command:

```bash
git clone https://github.com/Shiva7ganesh/FreshBus-Automated-Testing-Framework.git
```

### 2. Set Up the Environment

- Install **Java JDK** and configure the environment variables.
- Install **Eclipse IDE** for Java development.
- Download the **ChromeDriver** for Selenium WebDriver (compatible with your version of Google Chrome).

### 3. Install Selenium WebDriver

Add the Selenium WebDriver dependency to your project using Maven or download the WebDriver jar file.

If using **Maven**, add this dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>3.141.59</version>
</dependency>
```

### 4. Execute Tests

1. Open the project in Eclipse.
2. Set the path to your **ChromeDriver** in the Java code (`System.setProperty("webdriver.chrome.driver", "path/to/chromedriver")`).
3. Run the test classes (e.g., `AgentLogin.java`) using the `Run As > Java Application` option in Eclipse.

### 5. View Test Results

Test results can be viewed in the Eclipse console or through the **TestNG** report (if integrated).

## Example Test Case: Agent Login

This test case automates the agent login process for the FreshBus website.

```java
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AgentLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("FreshBus");
        searchBar.submit();
        
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
        driver.findElement(By.className("header-agent")).click();
        
        driver.get("https://agent.freshbus.com/");
        
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("AgentUser");
        
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("password123");
        
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/form/div[3]/div/button")).click();
        
        driver.quit();
    }
}
```

## WebDriver Commands

Some common WebDriver commands used in the project:

- **Opening a website**: `driver.get("http://example.com");`
- **Locating an element by ID**: `driver.findElement(By.id("elementId"));`
- **Clicking a button**: `element.click();`
- **Sending text to a field**: `element.sendKeys("some text");`

Refer to the [Selenium Documentation](https://www.selenium.dev/documentation/en/webdriver/) for more details on WebDriver commands.

## Screenshots

Here are some screenshots of the testing process:

1. **FreshBus Homepage**:
   ![FreshBus Homepage](https://github.com/user-attachments/assets/f63f4ed9-3ff0-46f2-84d5-783c76bad220)

2. **User Login Page**:
  ![User Login Page](https://github.com/user-attachments/assets/c791c94f-5fa1-41a8-b1b2-68993f6f4330)

3. **Agent Login Page**:
   ![Agent Login Page](https://github.com/user-attachments/assets/8e318039-1412-4f59-a3d7-1c8f3c8731cb)

## Conclusion

This automated testing framework has significantly improved FreshBus's quality assurance process by automating repetitive tasks, ensuring thorough test coverage, and improving the efficiency of the testing cycle. By integrating Selenium and Java, we have built a scalable and maintainable solution for the ongoing development and testing of the FreshBus website.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
