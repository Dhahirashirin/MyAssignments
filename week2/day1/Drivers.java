package week2.day1;
//To get packages-> type import+ctrl+shift+O
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Drivers {

	public static void main(String[] args) {
	
		//To open ChromeBrowser
			ChromeDriver cd = new ChromeDriver();
		//To Open Edge Browser
			EdgeDriver ed = new EdgeDriver();
		//To open Firefox
			FirefoxDriver ff = new FirefoxDriver();
		//To open url in chrome
			cd.get("https://www.youtube.com/");
		//To maximize the browser window
			cd.manage().window().maximize();
			
		
	}

}
