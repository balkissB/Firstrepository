package com.herokuapp.theinternet;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PositiveTests{
	
public static void main(String[] args) throws InterruptedException {
                  System.out.println("Starting loginTest");
                  System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                  WebDriver driver = new ChromeDriver();
                  String url = "http://the-internet.herokuapp.com/login";
                  driver.get(url);
                  System.out.println("Page is opened.");
                  Thread.sleep(3000);
                  driver.manage().window().maximize();
                  Thread.sleep(3000);
                  driver.quit();
}

}
