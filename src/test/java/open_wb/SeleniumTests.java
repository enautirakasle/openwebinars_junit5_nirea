package open_wb;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SeleniumTests {

	@BeforeAll
	static void before_all() {
		System.out.println("Se ejecuta ANTES de todo");
	}
	
	@Test
	@DisplayName("Soy el test 1")
	void test1() {
		System.out.println("Soy el test 1");
	}
	
	@Test
	@DisplayName("Soy el test 2")
	void test2() {
		System.out.println("Soy el test 2");
	}
	
	@AfterAll
	static void after_all() {
		System.out.println("Se ejecuta DESPUES de todo");
	}
	
	
	
}
