import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TestBrowsers {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "/Users/qed42/eclipse/jee-oxygen/Eclipse.app/Contents/MacOS/documents/eclipse-workspace/SeleniumTest/lib/geckodriver/geckodriver");	
WebDriver driver=new FirefoxDriver();

//Thread.sleep(3000);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//WebElement element = driver.findElement(By.id("searchLanguage"));
Select dropdown = new Select(driver.findElement(By.id("searchLanguage")));
dropdown.selectByValue("az");
Thread.sleep(3000);
driver.close();
	}

}