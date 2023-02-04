package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogon {

	private WebDriver driver;
	private By contentText;

	public PageLogon(WebDriver driver) {
		this.driver = driver;
		contentText = By.xpath(
				"/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[4]/td/table/tbody/tr[1]/td/font/b");

	}

	public void assertLogonPage() {

		Assert.assertTrue(driver.findElement(contentText).getText().contains("sign-in here"));
	
	}
}
