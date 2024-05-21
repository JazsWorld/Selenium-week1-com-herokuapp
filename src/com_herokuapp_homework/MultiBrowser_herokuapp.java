package com_herokuapp_homework;
/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser_herokuapp {
    // 1. Setup  Browser.
    static String browser = "Edge";
    static String BaseUrl =  "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    //IF-Else loop for selecting different browser
    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser has been selected");
        }
        //Maximise the Browser window
        driver.manage().window().maximize();

         //2. Open URL.
            driver.get(BaseUrl);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

            // 3. Print the title of the page.
            System.out.println("The title of the url is:"+driver.getTitle());

            //4. Print the current url.
            System.out.println("The current url is:"+driver.getCurrentUrl());

            //5. Print the page source.
            System.out.println("The Page source is:"+driver.getPageSource());

            //6. Enter the email to email field.
            driver.findElement(By.id("username")).sendKeys("tomsmith");

            //7. Enter the password to password field.
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");

            //8. Click on Login Button.
            driver.findElement(By.tagName("button")).click();

            //9. Print the current url.
            System.out.println("The current url is:"+driver.getCurrentUrl());

            //10. Refresh the page.
            driver.navigate().refresh();

            // 11. Close the browser.
            //driver.quit();

        }
}
