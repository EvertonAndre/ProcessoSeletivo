package questao3;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Questao3 {

	public static void main(String[] args) {
		
		ObjectMapper objectMapper = new ObjectMapper();
		Faturamento faturamento1 = new Faturamento();
		Faturamento[] faturamento;
		
		 try {
			faturamento = objectMapper.readValue(new File("dados.json"), Faturamento[].class);
			System.out.println("O maior faturamento do mês foi: ");
			System.out.println(faturamento1.maiorFaturamentoDoMes(faturamento));
			
			System.out.println("O menor faturamento do mês foi: ");
			System.out.println(faturamento1.menorFaturamentoNoMes(faturamento, faturamento1.maiorFaturamentoDoMes(faturamento)));
			
			System.out.println("O número de dias em que o faturamento diario foi maior que a media do mês: ");
			System.out.println(faturamento1.diasEmQueOFaturamentoUltrapassouAMediaDoMes(faturamento, faturamento1.mediaTotalDoMes(faturamento)));
			
			
			
			
		} catch (StreamReadException e) {
			
			e.printStackTrace();
		} catch (DatabindException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
}
	

	
}
	