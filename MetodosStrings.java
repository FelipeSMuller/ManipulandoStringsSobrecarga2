package treinandoMetodos;

import javax.swing.JOptionPane;

public class MetodosStrings {

	// Tratamento de Strings
	public static String tratamentoStrings(String primeiraFrase) {

		// Verifica se o campo está vazio
		if (primeiraFrase.isEmpty()) {

			JOptionPane.showMessageDialog(null,
					"O campo não pode estar vazio, certifique-se de preenchar corretamente!!!");
		}

		else {

			// Caso contrário , converte a frase recebida como parametro em minusculas
			primeiraFrase = primeiraFrase.toLowerCase();

			// Remove seus espaços
			primeiraFrase = primeiraFrase.replace(" ", "");

			// E atribui em uma nova variavel
			String fraseFormatada = primeiraFrase;

			return fraseFormatada;

		}

		return null;

	}

	// Método sobrecarregado com dois parametros
	public static String tratamentoStrings(String primeiraFrase, String segundaFrase) {

		// Verifica se os dois campos estão vazios;
		if (primeiraFrase.isEmpty() || segundaFrase.isEmpty()) {

			JOptionPane.showMessageDialog(null,
					"O campo não pode estar vazio, certifique-se de preenchar corretamente!!!");
		}

		else {

			// Converte as duas frases em letras minusculas e remove seus espaços
			primeiraFrase = primeiraFrase.toLowerCase();

			primeiraFrase = primeiraFrase.replace(" ", "");

			segundaFrase = segundaFrase.toLowerCase();

			segundaFrase = segundaFrase.replace(" ", "");

			// Atribui em uma nova variavel concatenando
			String concatenado = primeiraFrase + segundaFrase;

			return concatenado;

		}

		return null;

	}

	// Retorna o valor atribuido
	public static void entradaString(String primeiraFrase) {

		String frase = tratamentoStrings(primeiraFrase);

		// Armazena em uma variavel a quantidade de caracteres da frase (os espaços ja
		// foram excluidos ,pois passaram pelo método de tratamento
		int quantidadeCaracteres = frase.length();

		// imprime a quantidade de caracteres
		JOptionPane.showMessageDialog(null, "A frase fornecida contém:  " + quantidadeCaracteres + " caracteres");

	}

	// Método que remove os espaços de uma frase fornecida
	public static void fraseSemEspaco(String frase) {

		String convertido = tratamentoStrings(frase);

		JOptionPane.showMessageDialog(null, "Frase fornecida =  " + frase + "\nFrase modificada =  " + convertido);

	}

	// Método que concatena duas frases e imprime as frases.
	public static void entradaString(String primeiraFrase, String segundaFrase) {

		String frases = tratamentoStrings(primeiraFrase, segundaFrase);

		JOptionPane.showMessageDialog(null, "Frases concatenadas = " + frases);

	}

	// Método que inverte uma String e imprime a frase fornecida e a frase
	// modificada.
	public static String inverterString(String frase) {

		frase = tratamentoStrings(frase);

		String fraseInvertida = "";

		char caractere;

		for (int i = frase.length() - 1; i >= 0; i--) {

			caractere = frase.charAt(i);

			fraseInvertida += caractere;

		}

		JOptionPane.showMessageDialog(null, "Frase fornecida = " + frase + "\nFrase invertida = " + fraseInvertida);

		return fraseInvertida;

	}

	// Método palindromo
	public static void verificarPalindromo(String primeiraFrase, String segundaFrase) {

		// Utiliza os métodos ja existentes, oque é uma boa prática
		String frase = tratamentoStrings(primeiraFrase);

		// Utiliza o método que foi feito para inverter a string
		String frase2 = inverterString(segundaFrase);

		// Verifica se as duas palavras são iguais, um benefício de se utilizar o equals
		// no lugar do operador de comparação é que , o operador não verifica se as duas
		// palavra são iguais, mas sim se compartilham o mesmo espaço na memoria

		if (frase.equals(frase2)) {

			JOptionPane.showMessageDialog(null,

					"Primeira frase: " + frase + "\nFrase invertida:  " + frase2 + "\nportanto é um palíndromo");
		}

		// Caso a palavra não seja um palíndromo, imprime na tela o resultado final
		else {

			JOptionPane.showMessageDialog(null, "A frase não é um palíndromo");
		}

	}

	// Método que recebe como parametro uma string
	public static String tratamentoContagem(String contagem) {

		// avalia se o campo está vazio
		if (contagem.isEmpty()) {

			JOptionPane.showMessageDialog(null, "Você não pode deixar o campo vazio, preencha corretamente!!!");
		}

		// Caso contrário manipula o array e atribui em uma nova variavel
		else {

			contagem = contagem.toLowerCase();

			contagem = contagem.trim();

			// Essa variavel recebeu o valor do parametro como letras minusculas e com
			// espaços removidos com o método trim
			String novaString = contagem;

			return novaString;

		}

		return null;

	}

	public static void contarPalavras(String primeiraFrase) {

		String[] palavras = new String[20];

		String quantidade = tratamentoContagem(primeiraFrase);

		palavras = quantidade.split(" ");

		JOptionPane.showMessageDialog(null, "A frase fornecida contém " + palavras.length + " palavras");

	}

}