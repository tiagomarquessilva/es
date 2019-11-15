package es.mini.projeto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmsilva
 */
public class WhiteBoxTests {

    /**
     * Testes para a ativação de todos os caminhos do método isDivisibleBy357 da classe PimPamPum
     * 
     *                  1   2   3   4
     * num % 3 == 0     F   V   F   F
     * num % 5 == 0     F   F   V   F
     * num % 7 == 0     F   F   F   V   
     * 
     */
    @Test
    public void testIsDivisibleBy357() {
        
        StringBuilder output = new StringBuilder();
        
        //Caso de teste para o caminho 1
        assertFalse(PimPamPum.isDivisibleBy357(1, output));
        
        //Caso de teste para o caminho 2
        assertTrue(PimPamPum.isDivisibleBy357(3, output));
        
        //Caso de teste para o caminho 3
        assertTrue(PimPamPum.isDivisibleBy357(5, output));
        
        //Caso de teste para o caminho 2
        assertTrue(PimPamPum.isDivisibleBy357(7, output));
        
    }

    /**
     * Testes para a ativação de todos os caminhos do método containsDigit357 da classe PimPamPum
     * 
     *                                  1   2   3   4   5   
     * index < numStr.length()          F   V   V   V   V
     * numStr.charAt( index ) == '3'    F   F   V   F   F
     * numStr.charAt( index ) == '5'    F   F   F   V   F    
     * numStr.charAt( index ) == '7'    F   F   F   F   V
     * 
     */
    @Test
    public void testContainsDigit357() {
        
        StringBuilder output = new StringBuilder();
        
        //Caso de teste para o caminho 1
        assertFalse(PimPamPum.containsDigit357(0, output));
        
        //Caso de teste para o caminho 2
        assertFalse(PimPamPum.containsDigit357(10, output));
        
        //Caso de teste para o caminho 3
            //Digito no inicio
            assertTrue(PimPamPum.containsDigit357(30, output));
            
            //Digito no fim
            assertTrue(PimPamPum.containsDigit357(13, output));
            
            //Digito no meio
            assertTrue(PimPamPum.containsDigit357(130, output));
        
        //Caso de teste para o caminho 4
            //Digito no inicio
            assertTrue(PimPamPum.containsDigit357(50, output));
            
            //Digito no fim
            assertTrue(PimPamPum.containsDigit357(15, output));
            
            //Digito no meio
            assertTrue(PimPamPum.containsDigit357(150, output));
        
        //Caso de teste para o caminho 5
            //Digito no inicio
            assertTrue(PimPamPum.containsDigit357(70, output));
            
            //Digito no fim
            assertTrue(PimPamPum.containsDigit357(17, output));
            
            //Digito no meio
            assertTrue(PimPamPum.containsDigit357(170, output));
        
    }

    /**
     * Testes para a ativação de todos os caminhos do método run da classe PimPamPum
     * 
     *                                              1   2   3   4
     * input < 0                                    F   F   F   V            
     * isDivisibleBy357( input, output ) == true    F   V   F   F   
     * containsDigit357( input, output ) == false   F   F   V   F
     */
    @Test(expected = IllegalArgumentException.class)
    public void testRun() {
       
        //Caso de teste para o caminho 1
            //Contem o algarismo 3
            assertEquals("13 => Pim", PimPamPum.run(13));
            
            //Contem o algarismo 5
            assertEquals("52 => Pam", PimPamPum.run(52));
            
            //Contem o algarismo 7
            assertEquals("17 => Pum", PimPamPum.run(17));
        
        //Caso de teste para o caminho 2
            //Divisivel por 3
            assertEquals("6 => Pim", PimPamPum.run(6));
            
            //Divisivel por 5
            assertEquals("10 => Pam", PimPamPum.run(10));
            
            //Divisivel por 7
            assertEquals("14 => Pum", PimPamPum.run(14));
            
        //Caso de teste para o caminho 3
        assertEquals("1 => 1", PimPamPum.run(1));
        
        //Caso de teste para o caminho 4
        assertEquals("Entrada Inválida", PimPamPum.run(-1));
    }
    
}
