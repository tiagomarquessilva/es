package es.mini.projeto;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmsilva
 */
public class BlackBoxTests {
    
    /**
     * Teste de Black Box
     */
    @Test(expected = IllegalArgumentException.class) 
    public void testPimPamPum() {
        
        /*
        Legenda:
        A3 = Contém Algarismo 3
        A5 = Contém Algarismo 5
        A7 = Contém Algarismo 7
        D3 = Divisivel Por 3
        D5 = Divisivel Por 5
        D7 = Divisivel Por 7
        NA3 = Não Contém Algarismo 3
        NA5 = Não Contém Algarismo 5
        NA7 = Não Contém Algarismo 7
        ND3 = Não Divisivel Por 3
        ND5 = Não Divisivel Por 5
        ND7 = Não Divisivel Por 7
        */
        
        //Caso de teste para um numero que corresponda aos criterios: A3 NA5 NA7 ND3 ND5 ND7 
        assertEquals( "13 => Pim", PimPamPum.run(13) );

        //Caso de teste para um numero que corresponda aos criterios: A5 NA3 NA7 ND3 ND5 ND7 
        assertEquals( "52 => Pam", PimPamPum.run(52) );

        //Caso de teste para um numero que corresponda aos criterios: A7 NA3 NA5 ND3 ND5 ND7 
        assertEquals( "17 => Pum", PimPamPum.run(17) );

        //Caso de teste para um numero que corresponda aos criterios: D3 NA3 NA5 NA7 ND5 ND7 
        assertEquals( "6 => Pim", PimPamPum.run(6) );

        //Caso de teste para um numero que corresponda aos criterios: D5 NA3 NA5 NA7 ND3 ND7 
        assertEquals( "10 => Pam", PimPamPum.run(10) );

        //Caso de teste para um numero que corresponda aos criterios: D7 NA3 NA5 NA7 ND3 ND5 
        assertEquals( "14 => Pum", PimPamPum.run(14) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 NA7 ND3 ND5 ND7 
        assertEquals( "53 => PamPim", PimPamPum.run(53) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 NA5 ND3 ND5 ND7 
        assertEquals( "37 => PimPum", PimPamPum.run(37) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D3 NA5 NA7 ND5 ND7 
        assertEquals( "3 => PimPim", PimPamPum.run(3) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D5 NA5 NA7 ND3 ND7 
        assertEquals( "130 => PamPim", PimPamPum.run(130) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D7 NA5 NA7 ND3 ND5 
        assertEquals( "133 => PumPimPim", PimPamPum.run(133) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 NA3 ND3 ND5 ND7 
        assertEquals( "157 => PamPum", PimPamPum.run(157) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D3 NA3 NA7 ND5 ND7 
        assertEquals( "51 => PimPam", PimPamPum.run(51) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D5 NA3 NA7 ND3 ND7 
        assertEquals( "5 => PamPam", PimPamPum.run(5) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D7 NA3 NA7 ND3 ND5 
        assertEquals( "56 => PumPam", PimPamPum.run(56) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D3 NA3 NA5 ND5 ND7 
        assertEquals( "27 => PimPum", PimPamPum.run(27) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D5 NA3 NA5 ND3 ND7 
        assertEquals( "170 => PamPum", PimPamPum.run(170) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D7 NA3 NA5 ND3 ND5 
        assertEquals( "7 => PumPum", PimPamPum.run(7) );

        //Caso de teste para um numero que corresponda aos criterios: D3 D5 NA3 NA5 NA7 ND7 
        assertEquals( "60 => PimPam", PimPamPum.run(60) );

        //Caso de teste para um numero que corresponda aos criterios: D3 D7 NA3 NA5 NA7 ND5 
        assertEquals( "21 => PimPum", PimPamPum.run(21) );

        //Caso de teste para um numero que corresponda aos criterios: D5 D7 NA3 NA5 NA7 ND3 
        assertEquals( "140 => PamPum", PimPamPum.run(140) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 ND3 ND5 ND7 
        assertEquals( "1357 => PimPamPum", PimPamPum.run(1357) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D3 NA7 ND5 ND7 
        assertEquals( "153 => PimPamPim", PimPamPum.run(153) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D5 NA7 ND3 ND7 
        assertEquals( "235 => PamPimPam", PimPamPum.run(235) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D7 NA7 ND3 ND5 
        assertEquals( "532 => PumPamPim", PimPamPum.run(532) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D3 NA5 ND5 ND7 
        assertEquals( "237 => PimPimPum", PimPamPum.run(237) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D5 NA5 ND3 ND7 
        assertEquals( "370 => PamPimPum", PimPamPum.run(370) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D7 NA5 ND3 ND5 
        assertEquals( "371 => PumPimPum", PimPamPum.run(371) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D3 D5 NA5 NA7 ND7 
        assertEquals( "30 => PimPamPim", PimPamPum.run(30) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D3 D7 NA5 NA7 ND5 
        assertEquals( "63 => PimPumPim", PimPamPum.run(63) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D5 D7 NA5 NA7 ND3 
        assertEquals( "1330 => PamPumPimPim", PimPamPum.run(1330) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D3 NA3 ND5 ND7 
        assertEquals( "57 => PimPamPum", PimPamPum.run(57) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D5 NA3 ND3 ND7 
        assertEquals( "275 => PamPumPam", PimPamPum.run(275) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D7 NA3 ND3 ND5 
        assertEquals( "574 => PumPamPum", PimPamPum.run(574) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D3 D5 NA3 NA7 ND7 
        assertEquals( "15 => PimPamPam", PimPamPum.run(15) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D3 D7 NA3 NA7 ND5 
        assertEquals( "252 => PimPumPam", PimPamPum.run(252) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D5 D7 NA3 NA7 ND3 
        assertEquals( "245 => PamPumPam", PimPamPum.run(245) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D3 D5 NA3 NA5 ND7 
        assertEquals( "270 => PimPamPum", PimPamPum.run(270) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D3 D7 NA3 NA5 ND5 
        assertEquals( "147 => PimPumPum", PimPamPum.run(147) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D5 D7 NA3 NA5 ND3 
        assertEquals( "70 => PamPumPum", PimPamPum.run(70) );

        //Caso de teste para um numero que corresponda aos criterios: D3 D5 D7 NA3 NA5 NA7 
        assertEquals( "210 => PimPamPum", PimPamPum.run(210) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D3 ND5 ND7 
        assertEquals( "537 => PimPamPimPum", PimPamPum.run(537) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D5 ND3 ND7 
        assertEquals( "1375 => PamPimPumPam", PimPamPum.run(1375) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D7 ND3 ND5 
        assertEquals( "3157 => PumPimPamPum", PimPamPum.run(3157) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D3 D5 NA7 ND7 
        assertEquals( "135 => PimPamPimPam", PimPamPum.run(135) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D3 D7 NA7 ND5 
        assertEquals( "1533 => PimPumPamPimPim", PimPamPum.run(1533) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D5 D7 NA7 ND3 
        assertEquals( "35 => PamPumPimPam", PimPamPum.run(35) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D3 D5 NA5 ND7 
        assertEquals( "2370 => PimPamPimPum", PimPamPum.run(2370) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D3 D7 NA5 ND5 
        assertEquals( "273 => PimPumPumPim", PimPamPum.run(273) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D5 D7 NA5 ND3 
        assertEquals( "3710 => PamPumPimPum", PimPamPum.run(3710) );

        //Caso de teste para um numero que corresponda aos criterios: A3 D3 D5 D7 NA5 NA7 
        assertEquals( "630 => PimPamPumPim", PimPamPum.run(630) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D3 D5 NA3 ND7 
        assertEquals( "75 => PimPamPumPam", PimPamPum.run(75) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D3 D7 NA3 ND5 
        assertEquals( "567 => PimPumPamPum", PimPamPum.run(567) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D5 D7 NA3 ND3 
        assertEquals( "175 => PamPumPumPam", PimPamPum.run(175) );

        //Caso de teste para um numero que corresponda aos criterios: A5 D3 D5 D7 NA3 NA7 
        assertEquals( "105 => PimPamPumPam", PimPamPum.run(105) );

        //Caso de teste para um numero que corresponda aos criterios: A7 D3 D5 D7 NA3 NA5 
        assertEquals( "1470 => PimPamPumPum", PimPamPum.run(1470) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D3 D5 ND7 
        assertEquals( "375 => PimPamPimPumPam", PimPamPum.run(375) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D3 D7 ND5 
        assertEquals( "357 => PimPumPimPamPum", PimPamPum.run(357) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D5 D7 ND3 
        assertEquals( "3745 => PamPumPimPumPam", PimPamPum.run(3745) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 D3 D5 D7 NA7 
        assertEquals( "315 => PimPamPumPimPam", PimPamPum.run(315) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A7 D3 D5 D7 NA5 
        assertEquals( "2730 => PimPamPumPumPim", PimPamPum.run(2730) );

        //Caso de teste para um numero que corresponda aos criterios: A5 A7 D3 D5 D7 NA3 
        assertEquals( "1575 => PimPamPumPamPumPam", PimPamPum.run(1575) );

        //Caso de teste para um numero que corresponda aos criterios: A3 A5 A7 D3 D5 D7 
        assertEquals( "735 => PimPamPumPumPimPam", PimPamPum.run(735) );

        //Caso de teste para um numero que corresponda aos criterios: NA3 NA5 NA7 ND3 ND5 ND7 
        assertEquals( "1 => 1", PimPamPum.run(1) );
        
        //Caso de teste para o valor limite
        assertEquals( "0 => PimPamPum", PimPamPum.run(0) );
        
        //Caso de teste para uma entrada inválida
        assertEquals( "Entrada Inválida", PimPamPum.run( -1 ) );
    }
    
}
