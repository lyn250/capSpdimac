package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CP005 {
	static String driverPath = "libs/webdriver/chromedriver.exe";
    static String TipoWebdriver = "webdriver.chrome.driver";
    
  @Test
  public void f() throws InterruptedException {
	  System.setProperty(TipoWebdriver, driverPath);
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("https://www.ruralvia.com/demos/demo_V2_0/default.html");
	     Thread.sleep(2000);
	     
	     driver.switchTo().frame("demopral");
	     driver.findElement(By.name("USUARIO")).clear();
	     //driver.findElement(By.name("USUARIO")).sendKeys("02000008");
	    // driver.findElement(By.xpath("//*[@id=\"CAJA\"]/center/table[2]/tbody/tr[2]/td[2]/input")).sendKeys("02000008");
	     
	     driver.findElement(By.name("PASS")).clear();
	    // driver.findElement(By.name("PASS")).sendKeys("12345");
	     
	     driver.findElement(By.xpath("//*[@id=\"BOT\"]/a")).click();
	     
	     
	     
  }
}
