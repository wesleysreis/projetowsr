package Abstract;

public enum xPaths {

//TELA BEM VINDO AO SITE DE AUTOMAÇÃO 

	// MENU
	menuFormulario("/html/body/div[2]/div[1]/ul/li[1]/a"),
	subMenuCriarUsuario("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[1]/a"),
	subMenuListarUsuario("/html/body/div[2]/div[1]/ul/li[1]/div/ul/li[2]/a"),
	menuBuscaElemento("/html/body/div[2]/div[1]/ul/li[2]/a"),
	subMenuRadioCheckbox("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[4]/a"),
	subMenuDropSelect("/html/body/div[2]/div[1]/ul/li[2]/div/ul/li[5]/a"),
	// CAMPOS DA TELA DE INCLUSÃO DE USUÁRIO
	campoLocalidade("//*[@id=\"Geral\"]/div/div/span[3]/label/input"), campoNome("//*[@id=\"user_name\"]"),
	campoUltimoNome("//*[@id=\"user_lastname\"]"), campoEmail("//*[@id=\"user_email\"]"),
	campoEndereco("//*[@id=\"user_address\"]"), campoUniversidade("//*[@id=\"user_university\"]"),
	campoProfissao("//*[@id=\"user_profile\"]"), campoGenero("//*[@id=\"user_gender\"]"),
	campoIdade("//*[@id=\"user_age\"]"),

	// BOTÕES DE NAVEGAÇÃO
	botaoVoltar("//*[(self::button or self::a) and contains(text(), 'Voltar')]"),
	botaoCriar("//*[@id=\"new_user\"]/div[5]/div/div"),
	botaoExcluir("/html/body/div[3]/div/table/tbody/tr[1]/td[11]/a"),
	botaoEditar("/html/body/div[3]/div/table/tbody/tr[1]/td[10]/a"),
	botaoNovoUsuario("/html/body/div[2]/div[3]/div/a[1]"),
	botaoSalvaAlteracao("//*[(self::button or self::a) and contains(text(), 'Criar')]"),

	// RADIO - CHECKBOX
	radio01("/html/body/div[2]/div[2]/div[3]/div[1]/form/p[1]/label"),
	checkbox01("/html/body/div[2]/div[2]/div[3]/div[2]/p[1]/label"),

	// TELA FORMULÁRIO
	divContainerCarregada("/html/body/div[2]/div[1]"),

	// MENSAGENS DE SISTEMA
	popUpMensagemSistema("//*[@id='messageContainer_1']/ul/ul/div"),
	popUpFechaMensagemSistema("//*[@id='messageContainer_1']/button/span/i"),

// MODAL SISTEMA
	botaoModalSim("//a[text()='Sim' and not(ancestor::div[contains(@style,'display: none') or @hidden])]"),
	botaoModalNao("//a[text()='Não' and not(ancestor::div[contains(@style,'display: none') or @hidden])]"),
	botaoModalCancelar("//a[text()='Cancelar' and not(ancestor::div[contains(@style,'display: none') or @hidden])]"),
// CAMPOS GENÉRICOS
	campoCPF("//input[@fecmaskcpf]"), campoCNPJ("//input[@fecmaskcnpj]"), campoConta("//input[@fecmaskcontansgd]"),
	campoAgencia("//input[@fecmasknumber]"), botaoLimpar("//*[@id=\"acoesConsultarProposta\"]/a[2]"),

	loadingSpinner("//div[contains(@class, 'loading')]"),
	valorMensagemPaginaNaoCarregada("//*[@id='main-message']/h1/span[text()='Não é possível acessar esse site']"),
	indefinido("indefinido");

	private String xpathValue;

	private xPaths(String xpathValue) {
		this.xpathValue = xpathValue;
	}

	public String getXpathValue() {
		return xpathValue;
	}

}