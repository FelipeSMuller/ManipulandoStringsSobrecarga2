package treinandoMetodos;

import javax.swing.JOptionPane;

public class ChamaMetodo {

	public static void main(String[] args) {

		String primeiraFrase = "";

		String segundaFrase = "";

		int opcao = 0;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "MÉTODOS PARA STRING \n1-Concatenar strings"
						+ " \n2-Contagem de caracteres \n3-Inverter uma frase "
						+ "\n4-Remoção de espaços em branco \n5- Verificar Palíndromo \n6-Contagem de palavras \n7-Finalizar aplicação"));

			} catch (NumberFormatException | NullPointerException erro) {

				JOptionPane.showMessageDialog(null,
						"Você inseriu um dado inválido ou fechou o programa incorretamente!!!");

			}

			switch (opcao) {

			case 1:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira a primeira frase");

				segundaFrase = JOptionPane.showInputDialog(null, "Insira a segunda frase");

				MetodosStrings.entradaString(primeiraFrase, segundaFrase);

				break;

			case 2:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira uma frase qualquer");

				MetodosStrings.entradaString(primeiraFrase);

				break;

			case 3:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira uma frase que será invertida");

				MetodosStrings.inverterString(primeiraFrase);

				break;

			case 4:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira uma frase que irá retornar sem espaços");

				MetodosStrings.fraseSemEspaco(primeiraFrase);

				break;

			case 5:

				primeiraFrase = JOptionPane.showInputDialog(null, "Insira a primeira frase");

				segundaFrase = JOptionPane.showInputDialog(null, "Insira a segunda frase");

				MetodosStrings.verificarPalindromo(primeiraFrase, segundaFrase);

				break;

			case 6:

				primeiraFrase = JOptionPane.showInputDialog(null,
						"Insira uma frase , o programa irá contar a quantidade de palavras");

				MetodosStrings.contarPalavras(primeiraFrase);

				break;

			case 7:

				JOptionPane.showMessageDialog(null, "Fim da aplicação!!");

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Você não selecionou nenhuma opção, portanto a aplicação foi finalizada!!!");

				break;

			}

		} while (opcao > 0);

	}
}
