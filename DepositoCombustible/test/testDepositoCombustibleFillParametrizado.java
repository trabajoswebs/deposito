import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testDepositoCombustibleFillParametrizado{	
	 private final double depMax = 40.0; 
	 private double depNivel;
	 private double amount;
	 private double res;
	 
	 public testDepositoCombustibleFillParametrizado(double depNivel, double amount, double res) {	
		 this.depNivel = depNivel;
		 this.amount   = amount;
		 this.res      = res;
	 }	 
	 
	 @Parameters
	    public static Collection<Object[]> data() {
	        return Arrays.asList(new Object[][] {	                
	                 {20.0,10.0,30.0 }, {40.0, 10.0, 40.0 }, {20.0, -20.0, 0.0 }, {50.0, 20.0, 20.0 }, {20.0, -30.0, 0.0}
	           });
	    }
	    
	 @Test
	 public void testFill() {
		 DepositoCombustible tank = new DepositoCombustible(depMax, depNivel);
		 tank.fill(amount);
		 double resultado = tank.getDepositoNivel();
		 assertEquals(res,resultado,0.1);
	 }	 
	 
	
}
