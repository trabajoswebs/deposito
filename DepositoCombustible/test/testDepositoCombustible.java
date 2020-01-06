import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class testDepositoCombustible {	
	
	DepositoCombustible dc;	
	
	@Before
	public void inicio (){
		dc = new DepositoCombustible(40.0,0.0);
	}
	
	@After
	public void fin() {
		dc = null;
	}

	@Test
	public void testDepositoCombustible() {
		assertNotNull(dc);
	}

	@Test
	public void testGetDepositoNivel() {
		double depositoNivel = dc.getDepositoNivel();
		assertEquals(0.0 , depositoNivel, 0.1);
	}

	@Test
	public void testGetDepositoMax() {
		double depositoMax = dc.getDepositoMax();
		assertEquals(40.0 , depositoMax, 0.1);
	}

	@Test
	public void testEstaVacio() {
		boolean depositoMin = dc.estaVacio();
		assertTrue(depositoMin);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible dc = new DepositoCombustible(40.0,40.0);
		boolean depositoLleno = dc.estaLleno();
		assertTrue(depositoLleno);
	}
	
	@Test
	public void testEstaMedioLleno() {
		DepositoCombustible dc = new DepositoCombustible(40.0,20.0);
		double mitadDeposito = dc.getDepositoMax() / 2;
		assertEquals(mitadDeposito, dc.getDepositoNivel(), 0.1);
	}
	
}


