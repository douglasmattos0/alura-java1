package br.com.alura.java_pilha;

public class TestaContaComExcecaoChecked {

	public static void main(String[] args) {

		Conta c = new Conta();
		try {
			c.deposita();
		} catch(MinhaExcecao ex) {
			System.out.println("tratamento ....");
		}
	
	}

}
