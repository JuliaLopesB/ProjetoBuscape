package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodos {
	
	WebDriver driver;

	public void abrirNavegador(String appUrl) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(appUrl);
		driver.manage().window().maximize();
	}

	public void escrever(String texto, By elemento) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void espera(By elemento) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	public void esperaThread() {
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void fecharNavegador(String descricaoPasso) {
		driver.quit();
	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + "," + n2 + ")");

	}

	public void validarTexto(String textoEsperado, By elemento) {

		String texto = driver.findElement(elemento).getText();
		assertEquals(textoEsperado, texto);
	}

	public void evidencias(String nome) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) driver);
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./src/evidencias/" + nome + ".png");
		FileUtils.copyFile(srcFile, destFile);
	}

}
