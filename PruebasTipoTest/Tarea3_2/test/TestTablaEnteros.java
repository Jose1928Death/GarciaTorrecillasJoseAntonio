/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tarea3_2.TablaEnteros;

/**
 *
 * @author Torrecillas
 */
public class TestTablaEnteros {
    
    public TestTablaEnteros() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    //Devuelve la suma de los elementos de la tabla
    
    @Test
    public void testSumaTabla() {
        Integer[] a1 = {3,4,5,6,7};
        TablaEnteros t1 = new TablaEnteros (a1);
        assertTrue (t1.sumaTabla() == 25);
    }
    
    //Devuelve el mayor elemento de la tabla
    @Test
    public void  testMayorTabla() {
        Integer[] a1 = {3,4,5,6,7};
        TablaEnteros t1 = new TablaEnteros (a1);
        assertTrue (t1.mayorTabla() > 7);
    }
    
    @Test
    //Devuelve la posición de un elemento cuyo valor se pasa
    public void testPosicionTablaAcierto() {
        Integer[] a1 = {3,4,5,6,7};
        TablaEnteros t1 = new TablaEnteros (a1);
        assertTrue (t1.posicionTabla(3) == 0);
        
    }  
    
    @Test(expected = java.util.NoSuchElementException.class)
    //Devuelve la posición de un elemento cuyo valor se pasa
    public void testPosicionTablaFallo() {
        Integer[] a1 = {3,4,5,6,7};
        TablaEnteros t1 = new TablaEnteros (a1);
        t1.posicionTabla(8);
    }  
}
