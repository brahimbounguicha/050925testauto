package Pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	@FindBy(id="didomi-notice-agree-button")
	WebElement accept;
	
	@FindBy(xpath="/html/body/os-header/header/section/nav/ul/li/button")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/os-header/header/section/nav/ul/li[4]/div/div[2]/nav/ul/li[1]/nav/ul/li/a")
	List<WebElement> submenus;
	
	@FindBy(xpath="/html/body/div[3]/div/h1/span")
	WebElement verif;
	
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnMenu(String menuTitle, String submenuTitle) {
		Config.attente(10);
		accept.click();
		try {
			for(WebElement menu:menus) {
				if(menu.getText().contains(menuTitle)) {
					menu.click();
					for(WebElement submenu:submenus) {
						if(submenu.getText().contains(submenuTitle)) {
							submenu.click();
						}
					}
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void verifProd(String submenuTitle) {
		String actualText = verif.getText();
		
		Assert.assertEquals(submenuTitle, actualText);
	}
}
