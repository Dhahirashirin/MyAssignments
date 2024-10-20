package week2.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Dropdown {

	public static void main(String[] args) {
	//To Open ChromeBrowser
		ChromeDriver chrome=new ChromeDriver();
	//To load URL
		chrome.get("http://leaftaps.com/opentaps/");
	//To maximize the window
		chrome.manage().window().maximize();
	//To enter username and password
		chrome.findElement(By.id("username")).sendKeys("DemoCSR");
		chrome.findElement(By.id("password")).sendKeys("crmsfa");
	//To click Login button
		chrome.findElement(By.className("decorativeSubmit")).click();
	//To click CRM/SFA link
		chrome.findElement(By.linkText("CRM/SFA")).click();
	//To click leads tab
		chrome.findElement(By.linkText("Leads")).click();
	//To click create lead from shortcuts	
		chrome.findElement(By.linkText("Create Lead")).click();
	//To enter mandatory fields
		chrome.findElement(By.id("createLeadForm_companyName")).sendKeys("COMCAST");
		chrome.findElement(By.id("createLeadForm_firstName")).sendKeys("DHAHIRA SHIRIN");
		chrome.findElement(By.id("createLeadForm_lastName")).sendKeys("S");	
	//To select employee from source dropdown
		WebElement sourceWE = chrome.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDD = new Select (sourceWE);
		sourceDD.selectByIndex(4);
	//To select automobile from Marketing Campaign dropdown
		WebElement marketingCampaignWE = chrome.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingCampaignDD = new Select (marketingCampaignWE);
		marketingCampaignDD.selectByVisibleText("Automobile");
	//To select Corporation from Ownership dropdown
		WebElement ownershipWE = chrome.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipDD = new Select (ownershipWE);
		ownershipDD.selectByValue("OWN_CCORP");
	//To click Create lead button
		chrome.findElement(By.name("submitButton")).click();
		String Title = chrome.getTitle();
		System.out.println(Title);
	//To close browser
		chrome.close();
	
	}

}
