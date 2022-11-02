package open_wb;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
		String[] cadenasEsperadas = {"cadena1", "cadena2", "cadena3"};
		String[] cadenasActuales = {"cadena1",  "cadena3"};
		
		assertArrayEquals(cadenasEsperadas, cadenasActuales);
	}
}
