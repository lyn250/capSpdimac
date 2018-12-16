package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CP004 {
	static String driverPath = "libs/webdriver/chromedriver.exe";
    static String TipoWebdriver = "webdriver.chrome.driver";
  @Test
  public void f() throws InterruptedException {
	  
	  System.setProperty(TipoWebdriver, driverPath);
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.get("http://testasp.vulnweb.com/");
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[4]")).click();
	     
	     driver.findElement(By.id("tfUName")).sendKeys("lortiz");
	     driver.findElement(By.id("tfUPass")).sendKeys("654321");
	     
	     driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/form/table/tbody/tr[3]/td[2]/input")).click();
	     Thread.sleep(2000);
	     
	     
	     String loginCorrecto = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/div/a[4]")).getText();
	     String loginesperado = "logout lortiz"; 
	     
	     Assert.assertEquals(loginCorrecto, loginesperado,"Prueba Fallida login Incorrecto");
	     
	     driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/table/tbody/tr[3]/td[1]/div[1]/a")).click();
	     Thread.sleep(2000);
	     
	     driver.switchTo().alert().accept();
	     driver.switchTo().alert().accept();
	     driver.switchTo().alert().accept();
	     
	     String obtenido = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td/table/tbody/tr[2]/td[1]/div/a")).getText();
	     String esperado = "1";
	     
	     Assert.assertEquals(obtenido, esperado);
	     
	     driver.close();
	     driver.quit();
	    		 
	     
	    		 
	     
	     
	     
	     
  }
}
