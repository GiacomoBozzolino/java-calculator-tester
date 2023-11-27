package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	private Calculator c = new Calculator();
	private float num1= 5;
    private float num2= 5;
	   
    @BeforeAll
    public static void setup() {
        // Eseguito una volta prima di tutti i metodi di test
        System.out.println("Setup before all tests");
    }

    @BeforeEach
    public void init() {
        // Eseguito prima di ogni metodo di test
        System.out.println("Initialize before each test");
    }
	
	  @Test
	    public void testAddition() {
	        float result = c.add(num1, num2);
	        assertEquals(10, result, 0, "errore di calcolo nell'addizione");
	    }
	  
	  @Test
	    public void testSubtraction() {
	        float result = c.subtract(num1, num2);
	        assertEquals(0, result, 0, "errore di calcolo nella sottrazione");
	    }
	  
	  @Test
	    public void testDivision() throws Exception {
	       
	        float result = c.divide(num1, num2);
	        assertEquals(1, result, 0, "errore di calcolo nella divisione");

	        // Test division by zero
	        assertThrows(Exception.class, () -> c.divide(num1, 0), "non è pissibile dividere per zero");
	    }
	 
	  
	  @Test
	    public void testMultiplication() {
	       
	        float result = c.multiply(num1, num2);
	        assertEquals(25, result, 0,"errore di calcolo nella moltiplicazione" );
	    }
	  
	  @AfterEach
	    public void clear() {
	        // Eseguito dopo ogni metodo di test
	        System.out.println("Clear after each test");
	    }

	    @AfterAll
	    public static void cleanup() {
	        // Eseguito una volta dopo tutti i metodi di test
	        System.out.println("Cleanup after all tests");
	    }

	  
	  
}