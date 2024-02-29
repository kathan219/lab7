package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static String fizbuz(int i) {

        if (i%3==0){
           return "Fizz";
        } else if (i%5==0) {
            return "Buzz";

        }
        return Integer.toString(i);
    }
}
