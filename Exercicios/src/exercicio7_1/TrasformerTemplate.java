package exercicio7_1;

public abstract class TrasformerTemplate {
	protected String texto;

	public void trasformar() {
		lerTexto();
		trasformarTexto();
		imprimirTexto();
	}

	protected abstract void lerTexto();

	protected abstract void trasformarTexto();

	protected abstract void imprimirTexto();

}
