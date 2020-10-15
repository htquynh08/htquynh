package PracticeMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethod extends Setup {

	public static void selectElement(String xpathElement) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		Select select = new Select(element);
		select.selectByVisibleText(xpathElement);

	}

	public static void typeText(String xpathElement, String value) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.clear();
		element.sendKeys(value);
	}

	public static void clickElement(String xpathElement) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.click();
	}
	
	public static void visibilityElement(String xpath) {
		myWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(xpath)));
	}

	public static void sleep(long number) {
		try {
			Thread.sleep(number);
		} catch (Exception e) {
		}

	}

}
