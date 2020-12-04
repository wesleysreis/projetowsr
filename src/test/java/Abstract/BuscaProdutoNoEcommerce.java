package Abstract;

import org.junit.Test;
import org.junit.runners.MethodSorters;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BuscaProdutoNoEcommerce extends AbstractPages {
	private static final String URL = "http://automacaocombatista.herokuapp.com/treinamento/home";
	private static final Boolean MAXIMIZE = Boolean.TRUE;
	public static String localidade;

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

		buscarElementoPorXPath(xPaths.divContainerCarregada);
		buscarElementoPorXPath(xPaths.menuFormulario).click();
		buscarElementoPorXPath(xPaths.subMenuCriarUsuario).click();
		validaElementoPorXPath(xPaths.botaoVoltar);
		buscarElementoPorXPath(xPaths.campoNome).sendKeys("desafio01");
		buscarElementoPorXPath(xPaths.campoUltimoNome).sendKeys("desafio01_UltimoNome");
		buscarElementoPorXPath(xPaths.campoEmail).sendKeys("desafio01@gmail.com");
		buscarElementoPorXPath(xPaths.campoEndereco).sendKeys("Brasilia - DF");
		buscarElementoPorXPath(xPaths.campoUniversidade).sendKeys("UPIS");
		buscarElementoPorXPath(xPaths.campoProfissao).sendKeys("Analista de Teste");
		buscarElementoPorXPath(xPaths.campoGenero).sendKeys("Masculino");
		buscarElementoPorXPath(xPaths.campoIdade).sendKeys("30");
		validaElementoPorXPath(xPaths.botaoCriar);
		buscarElementoPorXPath(xPaths.botaoCriar).click();
	}

}
