package StepDef;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageStepDef {
	@Given("utilisateur est sur home page")
	public void utilisateur_est_sur_home_page() throws Exception {
		Config.driver= new ChromeDriver();
		Config.maximizeWindow();
		Config.driver.get(Utils.getProperty("Decathlon_link"));
	    
	}
	@When("utilisateur clique sur {string} & le sous menu {string}")
	public void utilisateur_clique_sur_le_sous_menu(String menuName, String submenuName) {
	   HomePage page = new HomePage();
	   
	   page.clickOnMenu(menuName, submenuName);
	}
	@Then("utilisateur est sur la page de {string}")
	public void utilisateur_est_sur_la_page_de(String submenuName) {
		 HomePage page = new HomePage();
		 page.verifProd(submenuName);
	}


}
