package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By campoBusca = By.xpath("//*[@id=\"new-header\"]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/input");
	private By campoLogin= By.xpath("//*[@id=\"new-header\"]/div[1]/div/div/div[4]/div/div/a/div[2]");
	private By campoEmail  = By.xpath("//*[@id=\"email\"]");
	private By campoNextEmail = By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div[3]/button");
	private By campoNome = By.xpath("//*[@id=\"nickname\"]");
	private By campoNextNome = By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div/div[2]/div/button");
	private By campoCpf= By.xpath("//*[@id=\"cpf\"]");
	private By campoNextCpf= By.xpath("//*[@id=\"__next\"]/div/main/div/div[2]/form/div/div[2]/div/button[1]");
	private By campoNextContinuar = By.xpath("//*[@id=\"__next\"]/div/main/div/form/div/div[4]/button");
	private By campoCategoria = By.xpath("//*[@id=\"new-header\"]/div[1]/div/div/div[3]/div/div/div[1]/div[1]");
	private By categoriaCelular= By.xpath("//*[@id=\"new-header\"]/div[1]/div/div/div[3]/div/div/div[1]/div[2]/ul/li[2]/p");
	private By campoLupaSubmit = By.xpath("//*[@id=\"new-header\"]/div[1]/div/div/div[3]/div/div/div[2]/div/div[1]/button");
	
	
	//private By  = By.xpath("");

	public By getCampoLogin() {
		return campoLogin;
	}

	public By getCampoEmail() {
		return campoEmail;
	}

	public By getCampoNextEmail() {
		return campoNextEmail;
	}

	public By getCampoNome() {
		return campoNome;
	}

	public By getCampoNextNome() {
		return campoNextNome;
	}

	public By getCampoCpf() {
		return campoCpf;
	}

	public By getCampoNextCpf() {
		return campoNextCpf;
	}

	public By getCampoNextContinuar() {
		return campoNextContinuar;
	}

	public By getCampoBusca() {
		return campoBusca;
	}

	public By getCampoCategoria() {
		return campoCategoria;
	}

	public By getCategoriaCelular() {
		return categoriaCelular;
	}

	public By getCampoLupaSubmit() {
		return campoLupaSubmit;
	}

}
