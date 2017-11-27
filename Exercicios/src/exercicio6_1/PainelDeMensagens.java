package exercicio6_1;

public class PainelDeMensagens {
	private final MensagemDoDia mensagem;
	
	public PainelDeMensagens(MensagemDoDia m) {
	mensagem = m;
	}
	
	public void mostrarMensagem() {
		mensagem.imprime();
	}
}
