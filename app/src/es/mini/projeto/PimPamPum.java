package es.mini.projeto;

/**
 *
 * @author tmsilva
 */
public class PimPamPum {
    
    public static boolean isDivisibleBy357( long num, StringBuilder output ){
        
        boolean isDivisibleBy357 = false;
        
        if( num % 3 == 0 ){ 
            output.append( "Pim" );
            isDivisibleBy357 = true;    
            
        }
        
        if( num % 5 == 0 ){    
            output.append( "Pam" ); 
            isDivisibleBy357 = true; 
            
        }
        
        if( num % 7 == 0 ){   
            output.append( "Pum" );
            isDivisibleBy357 = true; 
            
        }
        
        return isDivisibleBy357;
    }
    
    public static boolean containsDigit357( long num, StringBuilder output ){
        
        boolean containsDigit357 = false;
        String numStr = Long.toString( num );
        
        for( int index = 0; index < numStr.length(); index++ ){
            switch( numStr.charAt( index ) ){
                case '3':
                    output.append( "Pim" );
                    containsDigit357 = true;
                    break;
                    
                case '5':
                    output.append( "Pam" );
                    containsDigit357 = true;
                    break;
                    
                case '7':
                    output.append( "Pum" );
                    containsDigit357 = true;
                    break;
            }
        }
        
        return containsDigit357;
    }
        
    public static String run( long input ){
        
       if( input < 0 ){
            throw new IllegalArgumentException("Numero Nao Pode Ser Menor Que Zero!");
            
        }
        
        System.out.print( "+-----------+\n| PimPamPum |\n+-----------+\n" );
        StringBuilder output = new StringBuilder();
        output.append( input ).append( " => " );
        
        if( isDivisibleBy357( input, output ) ){
            containsDigit357( input, output );
            
        } else if( !containsDigit357( input, output ) ){
            output.append( input );
            
        }
        
        return output.toString();     
        
    }  
        
}