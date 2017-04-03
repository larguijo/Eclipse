import java.math.BigDecimal;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.print.attribute.standard.DateTimeAtCompleted;

public class JavaClass {

	public static void main(String[] args) {
		System.out.println("hola Victoria, como estas.");
		System.out.println("Firma: Luis "+ Calendar.getInstance().getTime());

		int[] numeris = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
		int sumador = 0;
		for (int number : numeris) {
			sumador += number;
		}

		String resultado = "suma total:" + sumador;
		System.out.println(resultado);

	}

}
