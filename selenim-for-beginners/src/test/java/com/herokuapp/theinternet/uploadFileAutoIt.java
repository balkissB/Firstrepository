package com.herokuapp.theinternet;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFileAutoIt {

	public static void main(String[] args) throws IOException, InterruptedException{

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

		// objects and variables instantiation

		WebDriver driver = new ChromeDriver();

		String appUrl = "https://demo.guru99.com/test/upload/";

		// launch the CHROME browser and open the application url

		driver.get(appUrl);

		// maximize the browser window

		driver.manage().window().maximize();

		WebElement uploadFile = driver.findElement(By.id("uploadfile_0"));
		Thread.sleep(5000);
		uploadFile.click();
//		Actions act = new Actions(driver);
//
//		act.moveToElement(uploadFile).build().perform();

		//Runtime.getRuntime().exec("C:\\Users\\balki\\OneDrive\\Documents\\uploadFileIT.exe");
		//Thread.sleep(5000);

		// terminate the program

		//driver.quit();

	}

}
