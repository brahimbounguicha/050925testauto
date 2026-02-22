package Helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Config {

	public static WebDriver driver; 
	
	public static WebDriver driver2; 
	
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void attente(int s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	public static void attentefix() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
}
