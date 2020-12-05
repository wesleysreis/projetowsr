package Abstract;

import org.junit.Test;
import org.junit.runners.MethodSorters;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.swing.JScrollBar;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.ClickAction;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BuscaProdutoNoEcommerce extends AbstractPages {
	private static final String URL = "https://www.americanas.com.br/";
	private static final Boolean MAXIMIZE = Boolean.TRUE;
	public static String localidade;
	public static String lolja;

	@BeforeClass
	public static void setUpClass() throws Exception {

		// CHROME
		System.setProperty("webdriver.chrome.driver", "c:\\Desenvolvimento\\Drives\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);

		if (MAXIMIZE) {
			driver.manage().window().maximize();
		}
		driver.get(URL);
		buscarElementoPorXPath(xPaths.divContainerCarregada);
	}



	@Before
	public void NavegarMenu() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

	}

	@Test
	public void inclusaoDeUsuario() throws Exception {

	//	buscarElementoPorXPath(xPaths.divContainerCarregada);
		buscarElementoPorXPath(xPaths.botaoFechar).click();
		buscarElementoPorXPath(xPaths.clicaNotebook).click();
		buscarElementoPorXPath(xPaths.clicaSelecaoNotebook).click();
		buscarElementoPorXPath(xPaths.escreverCEP).sendKeys("72215230");
		buscarElementoPorXPath(xPaths.botaoCalcularFrete).click();
		buscarElementoPorXPath(xPaths.botaoComprar).click();
		buscarElementoPorXPath(xPaths.botaoModalConfirmarComprar).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("btn-continue")).click();
	}
}
