package open_wb;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import java.time.Duration;
import java.util.ArrayList;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class OpenwebinarsTests {

	@Test
	@DisplayName("Aserción TRUE")
	void pruebaBoolean() {
		boolean verdadero = true;
		assertTrue(verdadero);

	}

	@Test
	@DisplayName("Aserción EQUALS")
	void pruebaEquals() {
		String cadenaEsperada = "esperada";
		String cadenaActual = "esperada";

		assertEquals(cadenaEsperada, cadenaActual);
	}

	@Test
	@DisplayName("Aserción ARRAY EQUALS")
	void pruebaArray() {
		String[] cadenasEsperadas = { "cadena1", "cadena2", "cadena3" };
		String[] cadenasActuales = { "cadena1", "cadena2", "cadena3" };

		assertArrayEquals(cadenasEsperadas, cadenasActuales);
	}

	@Test
	@DisplayName("prueba con arraylists")
	void pruebaArrayList() {
		ArrayList<String> listaEsperada = new ArrayList<String>();
		listaEsperada.add("cadena1");
		listaEsperada.add("cadena2");
		listaEsperada.add("cadena3");

		ArrayList<String> listaPruebas = new ArrayList<String>();
		listaPruebas.add("cadena1");
		listaPruebas.add("cadena2");
		listaPruebas.add("cadena3");

		// assertEquals(listaEsperada.size(), listaPruebas.size(), "Se esperaba una
		// cadena de "+ listaEsperada.size() + " y se ha recibido una cadena de " +
		// listaPruebas.size());

		// for(int i = 0; i< listaEsperada.size(); i++) {
		// assertEquals(listaEsperada.get(i), listaPruebas.get(i), "El valor del index "
		// + i + " es diferente.");
		// }

		assertIterableEquals(listaEsperada, listaPruebas);
	}

	@Test
	@DisplayName("Asercion throws")
	void pruebaThrows() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			String[] arr = { "cadena1", "cadena2", "cadena3" };
			String cadena = arr[5];
			// Integer.parseInt("hola");
		});
	}

	@Test
	@DisplayName("Asercion time out")
	void pruebaTimeout() {

		assertTimeout(Duration.ofSeconds(3), () -> {
			Thread.sleep(2000);
		});
	}

	@Test
	@DisplayName("Aserción Assert all, agrupando aserciones")
	void pruebaAall() {
		assertAll(
				() -> {assertTrue(true);},
				() -> {assertFalse(false);},
				() -> {assertEquals("cadena1", "cadena1");},
				() -> {assertEquals(2, 2);}
				);
	
	}
	
	@Test
	@DisplayName("Asunciones")
	void pruebaAsuncion() {
		boolean verdadero = true;
		assumeTrue(!verdadero);
		System.out.println("Esta linea solo se mostrará si la asunción se cumple.");
	}
	
	@Test
	@DisplayName("Asunciones THAT")
	void pruebaAsuncionThat() {
		boolean verdadero = true;

		assumingThat(!verdadero, ()->{			
			System.out.println("Esta linea solo se mostrará si la asunción se cumple.");
		});
		
		System.out.println("Esta linea SIEMPRE");

	}
	
	@DisplayName("Test de Repeticion")
	@RepeatedTest(value=3, name=" TEST: [{displayName}] -> {currentRepetition} de {totalRepetitions}")
	void pruebaRepeated(RepetitionInfo repetitionInfo) {
		System.out.println("Estoy en la iteracion: " + repetitionInfo.getCurrentRepetition());
		System.out.println("De un total de: " + repetitionInfo.getTotalRepetitions());
		System.out.println("-----------");
	}
	
	@ParameterizedTest
	@ValueSource(ints =  {1, 2, 3, 4, 5})
	void pruebaParametrizada(int input) {
		System.out.println(input);
	}
	
}
