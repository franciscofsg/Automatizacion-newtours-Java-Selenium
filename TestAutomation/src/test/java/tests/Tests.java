package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helpers.Helpers;
import pages.PageLogin;
import pages.PageLogon;

public class Tests {

	// Creamos un objeto de tipo WebDriver
	private WebDriver driver;

	@Before
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		// Declaramos el objeto driver de tipo Chromedriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours");

		Helpers helper = new Helpers();
		helper.pausa(5);
	}

	@Test
	public void pruebaUno() {

		PageLogin obj = new PageLogin(driver);

		obj.login("user", "user");

		Helpers helper = new Helpers();
		helper.pausa(5);

	}

	@Test
	public void pruebaDos() {

		PageLogin objlogin = new PageLogin(driver);

		PageLogon objlogon = new PageLogon(driver);

		objlogin.loginIncorrecto("momil", "momil");

		objlogon.assertLogonPage();

		Helpers helper = new Helpers();
		helper.pausa(5);

	}

	@After
	public void tearDown() {

		driver.quit();

	}
}
