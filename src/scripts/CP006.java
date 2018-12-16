package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
	
public class CP006 {
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
	     	     
	     driver.findElement(By.name("PASS")).clear();
	     driver.findElement(By.name("USUARIO")).sendKeys("02000008");
	     driver.findElement(By.name("PASS")).sendKeys("12345");
	     
	     
	     driver.findElement(By.xpath("//*[@id=\"BOT\"]/a")).click();
	     Thread.sleep(4000);
	     
	     driver.findElement(By.xpath("//*[@id=\"TrColor\"]/td[1]/a")).click(); // link 0001  
	     Thread.sleep(2000);
	     
	     driver.findElement(By.xpath("//*[@id=\"MENU\"]/div[3]/a")).click(); // menu transferencia
	     Thread.sleep(3000);
	     
	     driver.findElement(By.xpath("//*[@id=\"BOT\"]/a")).click(); // boton aceptar
	     
	     driver.switchTo().alert().accept();
	     
	     driver.findElement(By.name("SELCTA")).click();
	     driver.findElement(By.xpath("//*[@id=\"BODY_INPUT\"]/table/tbody/tr[5]/td[2]/select/option[2]")).click();
	     
	     String importeObtenido = driver.findElement(By.name("IMPORTR")).getAttribute("value");
	     System.out.println(importeObtenido);
	     System.out.println("prueba");
	     
	     driver.findElement(By.xpath("//*[@id=\"BOT\"]/a")).click();
	     Thread.sleep(2000);
	     
	    String importeFinal = driver.findElement(By.xpath("//*[@id=\"BODY_DATO\"]/table/tbody/tr[7]/td[2]")).getText();
	    System.out.println(importeFinal);
	    
	    Assert.assertEquals(importeObtenido, importeFinal, "No es el valor esperado");
	    
	 
	     
	     
	     
	     
	     
	     
	   
  }
}
