package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl = "https://demo.nopcommerce.com/login?returnUrl=%2";

        //1. Setup chrome browser
        WebDriver driver = new ChromeDriver();

        //2. Open Url
        driver.get(baseUrl);

        //Maximize Screen
        driver.manage().window().maximize();

        // Implicit wait time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3.Print title of the page
        System.out.println("Page title is : " + driver.getTitle());

        //4.Print the cuurent Url
        System.out.println("Current Url is : " + driver.getCurrentUrl());

        //5.Print the page source
        System.out.println("Page source is :"  + driver.getPageSource());


        //6. Enter the Email to Email field
        //find the email element
        WebElement emailField = driver.findElement(By.name("Email"));

        //Action to type Email
        emailField.sendKeys("tv@gmail.com");

        //7. Enter the password to password field
        WebElement passworld = driver.findElement(By.id("Password"));

        // Action is to type Password
        passworld.sendKeys("tv123");

        //hold Screen
        Thread.sleep(2000);

        //8. Close the Browser
        driver.close();

    }
}
