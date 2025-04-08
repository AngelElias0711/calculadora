package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Calculadora calc = new Calculadora(5, 3);
        int resultado= calc.suma();
        System.out.println("el resultado de la suma es: " + resultado);
        
    }
}
