package configurationChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigurationSeleniumManager {

	WebDriver Driver;
	
	// @BeforeMethod : s'execute avant chaque methode de test
	@BeforeMethod
	public void setup() {
		
	}
	
	// @Test = c'est une methode de test => s'execute avec priorité 2
	@Test(priority=2)
	public void openGoogle() {
		//on va creer un pilote de type chromeDrive pour lancer le navigateur chrome
		Driver = new ChromeDriver();
		//get va saisir dans la barre d'adresse le lien de site qu'on va utiliser
		Driver.get("https://www.google.com/");
		//maximize : pour agrandir la fenetre du navigateur au maximum
		//fullscreen : pour mettre le navigateur en plein ecran
		Driver.manage().window().maximize();
	}
	
	// @AfterMethod : s'execute apres chaque methode de test
	@AfterMethod
	public void closeBrowser() {
		//close : fermer uniquement l'onglet actif
		//quit : fermer completement le navigateur
		Driver.quit();
	}
	
	// @Test = c'est une methode de test => s'execute avec priorité 1
	@Test(priority=1)
	public void openYoutube() {
		//on va creer un pilote de type chromeDrive pour lancer le navigateur chrome
		Driver = new ChromeDriver();
		//get va saisir dans la barre d'adresse le lien de site qu'on va utiliser
		Driver.get("https://www.youtube.com/");
		//maximize : pour agrandir la fenetre du navigateur au maximum
		//fullscreen : pour mettre le navigateur en plein ecran
		Driver.manage().window().maximize();
	}
}
