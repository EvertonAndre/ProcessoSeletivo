package questao4;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Questao4 {

	public static void main(String[] args) {

		String[] dados = new String[5];
		dados[0] = "SP – R$67.836,43";
		dados[1] = "RJ – R$36.678,66";
		dados[2] = "MG – R$29.229,88";
		dados[3] = "ES – R$27.165,48";
		dados[4] = "Outros – R$19.849,53";

	
		exibirPercentualPorEstados(percentualPorEstado(dados, calcularOTotal(dados)), todosOsEstados(dados), dados);

	}

	static List<String> todosOsEstados(String[] dados) {
		List<String> listaDeEstados = new ArrayList<String>();
		for (int i = 0; i < dados.length; i++) {
			String[] auxiliar = dados[i].split("–");
			String nomeDosEstados = auxiliar[0];
			listaDeEstados.add(nomeDosEstados);

		}
		return listaDeEstados;

	}

	public static double calcularOTotal(String[] dados) {
		Double valorTotal = 0.0;
		for (int i = 0; i < dados.length; i++) {
			String[] auxiliar = dados[i].split("–");
			String valorComLetras = auxiliar[1];
			String valorSemLetras = valorComLetras.replace("R$", "");
			String valorSemLetraEPonto = valorSemLetras.replace(".", "");
			String valorSemiFinal = valorSemLetraEPonto.replace(",", ".");
			Double valorFinal = Double.parseDouble(valorSemiFinal);
			valorTotal = valorTotal + valorFinal;

		}

		return valorTotal;
	}

	public static List<String> percentualPorEstado(String[] dados, double calcularTotal) {
		Double valorFinal = 0.0;
		double percentual = 0.0;
		List<String> list = new ArrayList<String>();

		for (int i = 0; i < dados.length; i++) {
			String[] auxiliar = dados[i].split("–");
			String valorComLetras = auxiliar[1];
			String valorSemLetras = valorComLetras.replace("R$", "");
			String valorSemLetraEPonto = valorSemLetras.replace(".", "");
			String valorSemiFinal = valorSemLetraEPonto.replace(",", ".");
			valorFinal = Double.parseDouble(valorSemiFinal);
			percentual = (valorFinal * 100) / calcularOTotal(dados);
			String percentualFormatado = new DecimalFormat ("#").format(percentual).concat("%");
			

			list.add(percentualFormatado);
		}
		return list;
	}

	public static void exibirPercentualPorEstados(List<String> list, List<String> E, String[] dados) {
		System.out.println("O percentual de cada Estado é respectivamente:");
		System.out.println(" ");

		for (int i = 0; i <= todosOsEstados(dados).size();) {
			System.out.println(todosOsEstados(dados));

			for (int j = 0; j <= percentualPorEstado(dados, calcularOTotal(dados)).size();) {
				System.out.println(percentualPorEstado(dados, calcularOTotal(dados)));
				break;
			}
			break;
		}

	}
}
