import java.math.BigDecimal;
import java.util.AbstractList;
import java.util.ArrayList;

public class JavaClass {

	public static void main(String[] args) {
		System.out.print("hola bb");

		int[] numbers = { 1, 2, 3, 4, 6, 9,10 };
		int sumador = 0;
		for (int number : numbers) {
			sumador += number;
		}

		String resultado = "suma total:" + sumador;
		System.out.println(resultado);

	}

}
