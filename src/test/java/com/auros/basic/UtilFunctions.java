package com.auros.basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.auros.core.DriverManager;

import com.auros.utils.Util;

public class UtilFunctions extends DriverManager {

	protected WebDriver driver;

	public void userLogin(WebDriver driver) {
		driver.findElement(By.xpath("(//input[@id='signInFormUsername'])[2]")).sendKeys(System.getProperty("Username"));
		driver.findElement(By.xpath("(//input[@id='signInFormPassword'])[2]")).sendKeys(System.getProperty("Password"));
        driver.findElement(By.xpath("(//input[@value='Sign in'])[2]")).click();
}

	public void caOffLogin(WebDriver driver) {

		Util.switchToFrameByUsingWebElement(driver, driver.findElement(
				By.xpath("//iframe[contains(@src,'https://auros-branch.aurosks.com/jsp/userLogin.jsp?')]")));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(props.getProperty("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(props.getProperty("caoffpassword"));
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}

	public void copSelection(WebDriver driver) {

		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='dhx_cell_cont_layout']//iframe")));
		driver.switchTo()
				.frame(driver.findElement(By.xpath("//iframe[contains(@src,'/jsp/copsTree.jsp?from=homePage')]")));

		driver.findElement(By.xpath("//input[@id='stext']")).sendKeys(props.getProperty("search_cop"));
		driver.findElement(By.xpath("//img[@alt='Find Next']")).click();
		Util.jsClickByWebElement(driver, driver.findElement(By.xpath("//span[@id='mouseOver_SEL_AUT']")));
	}

	public void switchToChildWindow(WebDriver driver) throws InterruptedException {
		Set<String> hs = driver.getWindowHandles();
		Iterator i = hs.iterator();
		String pWindow = (String) i.next();
		String cWindow = (String) i.next();

		driver.switchTo().window(cWindow);
		Thread.sleep(3000L);
	}

}
