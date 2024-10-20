package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLogin {

	public static void main(String[] args)
	
	{
				ChromeDriver FB = new ChromeDriver();
				
		//To Open FB Browser
				FB.get("https://www.facebook.com/");
		//To enter email id
				WebElement userName = FB.findElement(By.id("email"));
				userName.sendKeys("testleaf.2023@gmail.com");
		//To enter Password
				WebElement password = FB.findElement(By.id("pass"));
				password.sendKeys("Tuna@321");
		//To click login Button
				FB.findElement(By.name("login")).click();
		//To verify Title
				String title = FB.getTitle();
				System.out.println(title);

	}

		}
