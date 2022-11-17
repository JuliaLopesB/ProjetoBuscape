package runner;

import java.io.IOException;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {

	Metodos met = new Metodos();
	Elementos el = new Elementos();

	@Given("que esteja no {string}")
	public void que_esteja_no(String site) {
		met.abrirNavegador(site);
	}

	@When("pesquisar o primeiro produto")
	public void pesquisar_o_primeiro_produto() {
		met.escrever("tel", el.getCampoBusca());
		met.esperaThread();
	}

	@Then("valido se ha sugestoes")
	public void valido_se_ha_sugestoes() throws IOException {
		met.evidencias("sugestões-produto-um");
		met.fecharNavegador(".");
	}

	@When("pesquisar com numeros")
	public void pesquisar_com_numeros() {
		met.escrever("11111111111", el.getCampoBusca());
		met.clicar(el.getCampoLupaSubmit());
		met.esperaThread();
	}

	@Then("Validar se ha sugestao no campo de busca")
	public void validar_se_ha_sugestao_no_campo_de_busca() throws IOException {
		met.evidencias("sugestões-números");
		met.fecharNavegador(".");
	}

	@When("pesquisar o terceiro produto")
	public void pesquisar_o_terceiro_produto() {
		met.escrever("Fone", el.getCampoBusca());
		met.esperaThread();
	}

	@When("Selecionar categoria")
	public void selecionar_categoria() throws IOException {
		met.clicar(el.getCampoCategoria());
		met.clicar(el.getCategoriaCelular());
		met.evidencias("categoria-selecionada");
		met.clicar(el.getCampoLupaSubmit());
		met.esperaThread();
	}

	@Then("Valida se resultado condiz com categoria")
	public void valida_se_resultado_condiz_com_categoria() throws IOException {
		met.esperaThread();
		met.evidencias("evidencia-tres");
		met.fecharNavegador(".");
	}

	@When("pesquisar o quarto produto")
	public void pesquisar_o_quarto_produto() {
		met.escrever("tel", el.getCampoBusca());
		met.clicar(el.getCampoLupaSubmit());
		met.esperaThread();
		met.clicar(el.getCampoCategoria());
		met.esperaThread();
	}

	@Then("Validar se categorias condizem com produto")
	public void validar_se_categorias_condizem_com_produto() throws IOException {
		met.esperaThread();
		met.evidencias("evidencia-quatro");
		met.fecharNavegador(".");
	}

}
