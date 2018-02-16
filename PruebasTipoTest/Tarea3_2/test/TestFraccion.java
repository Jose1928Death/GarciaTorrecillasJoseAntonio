/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
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
public class TestFraccion {
    
    public TestFraccion() {
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
    
    //Asignar por defecto una fraccción
    @Test
    public void constructorPorDefecto() {
        Fraccion f = new Fraccion ();
        assertEquals(f.aString(), "0");
    }
    
    //Crear el constructor Numerador y le damos el valor 4 por defecto
    @Test
    public void constructorSoloNumerador() {
        Fraccion f = new Fraccion (4);
        assertEquals(f.aString(), "4");
    }
    
   //Sirve para crear el objeto fraccion y se ejecutara los siguientes códigos
    @Test
    public void constructorParametrizado() {
        Fraccion f = new Fraccion (2, 3);
        assertEquals(f.aString(), "2/3");
    }
    
    //Crear test Suma para que aplique la suma de la fraccion
    @Test
    public void testSumar() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion ();
        Fraccion f3 = Fraccion.sumar(f1, f2);
        assertEquals(f3.aString(), "2/3");
    }
    
    //Otra forma es la suma de dos fracciones y aplicar la suma entre ambas
    @Test
    public void testSumar2() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion (1, 3);
        Fraccion f3 = Fraccion.sumar(f1, f2);
        assertEquals(f3.aString(), "9/9");
    }
    
    //Crear test Resta para que aplique la resta de la fraccion
    @Test
    public void testRestar() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion ();
        Fraccion f3 = Fraccion.restar(f1, f2);
        assertEquals(f3.aString(), "2/3");
    }
    
    //Otra forma es la resta de dos fracciones y aplicar la suma entre ambas
    @Test
    public void testRestar2() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion (1, 3);
        Fraccion f3 = Fraccion.restar(f1, f2);
        assertEquals(f3.aString(), "3/9");
    }
    
    //Crear test Multiplicar para que aplique la multiplicacion de la fraccion
    @Test
    public void testMultiplicar() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion ();
        Fraccion f3 = Fraccion.multiplicar(f1, f2);
        assertEquals(f3.aString(), "0/3");
    }
    
    //Otra forma es la multipliación de dos fracciones y aplicar la multiplicación entre ambas
    @Test
    public void testMultiplicar2() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion (1, 3);
        Fraccion f3 = Fraccion.multiplicar(f1, f2);
        assertEquals(f3.aString(), "2/9");
    }
    
    //Crear test inversa para que el numerador pase a denominador y que el denominador pase a numerador
    @Test
    public void testInversa() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = Fraccion.inversa(f1);
        assertEquals(f2.aString(), "3/2");
    }
    
    //Crear test Dividir para que aplique la division de la fraccion
    @Test
    public void testDividir() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion ();
        Fraccion f3 = Fraccion.dividir(f1, f2);
        assertEquals(f3.aString(), "2/0");
    }
    
    //Otra forma es la division de dos fracciones y aplicar la division entre ambas
    @Test
    public void testDividir2() {
        Fraccion f1 = new Fraccion (2, 3);
        Fraccion f2 = new Fraccion (1, 3);
        Fraccion f3 = Fraccion.multiplicar(f1, f2);
        assertEquals(f3.aString(), "2/9");
    }
   
    //Crear test simplificar para que el numerador y el denominador se simplifiquen entre sí 
    @Test
    public void testSimplificar() {
        Fraccion f1 = new Fraccion (2, 12);
        Fraccion f2 = f1.simplificar();
        assertEquals(f2.aString(), "1/6");
    }
}
