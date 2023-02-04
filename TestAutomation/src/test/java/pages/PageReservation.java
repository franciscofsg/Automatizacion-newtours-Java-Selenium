package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageReservation {
	private WebDriver driver;
	private By contentText;

	public PageReservation(WebDriver driver) {
		this.driver = driver;
		contentText = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[1]/font/b");

	}

	public void assertPage() {

		Assert.assertTrue(driver.findElement(contentText).getText().contains("Thank you for Loggin."));
		
	}

}
