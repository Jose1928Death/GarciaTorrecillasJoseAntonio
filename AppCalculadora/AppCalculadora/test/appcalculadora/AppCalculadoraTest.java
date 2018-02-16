/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appcalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Torrecillas
 */
public class AppCalculadoraTest {
    
    public AppCalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void crearCalculadora() {
        //calcu = new AppCalculadora(20,10);
    }
    
    @After
    public void borraCalculadora() {
        //calcu = null;
    }

    /**
     * Test of suma method, of class AppCalculadora.
     */
    /*
    @Test
    public void testSuma() {
        System.out.println("suma");
        AppCalculadora instance = null;
        int expResult = 0;
        int result = instance.suma();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    */
    
    /**
     * Test of resta method, of class AppCalculadora.
     */
    
    private int num1;
    private int num2;
    public AppCalculadoraTest(int a, int b) {
        num1 = a;
        num2 = b;
    }
    public int suma() {
        int result = num1 + num2;
        return result;
    }
    public int resta() {
        int result = num1 - num2;
        return result;
    }
    public int multiplica() {
        int result = num1 * num2;
        return result;
    }
    public int divide() {
        int result = num1 / num2;
        return result;
    }
    
    @Test
    public void testSuma() {
        System.out.println("suma");
        AppCalculadora calcu = new AppCalculadora(20, 10);
        int resultado = calcu.suma();
        assertEquals(30, resultado);
    }
    
    @Test
    public void testResta() {
        System.out.println("resta");
        AppCalculadora calcu = new AppCalculadora(20, 10);
        int resultado = calcu.resta();
        assertEquals(10, resultado);
    }

@Test
    public void testMultiplica() {
        System.out.println("multiplica");
        AppCalculadora calcu = new AppCalculadora(20, 10);
        int resultado = calcu.multiplica();
        assertEquals(200, resultado);
    }
    
    /*
    @Test
    public void testDivide() {
        System.out.println("divide");
        AppCalculadora calcu = new AppCalculadora(20, 0);
        int resultado = calcu.divide();
        assertEquals(2, resultado);
      */
    
@Test
    public void testDivide() {
        System.out.println("divide");
        AppCalculadora calcu = new AppCalculadora(20, 10);
        int resultado = calcu.divide();
        assertEquals(2, resultado);
        
    }
    
    @Test(expected = java.lang.ArithmeticException.class)
public void testDivide0(){
            AppCalculadora calcu = new AppCalculadora(20, 0);
            //Integer resultado = calcu.divide0();
}

}
