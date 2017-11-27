package Exercicio1_1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class EscritorArquivo implements Escritor {

	@Override
	public void escrever(String texto) {
		try {
			PrintWriter writer = new PrintWriter("arquivo.txt");
			writer.write(texto);
			writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
