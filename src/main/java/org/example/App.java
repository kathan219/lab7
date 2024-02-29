package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder sb = new StringBuilder();
        for (int e = 1; e <=100 ; e++) {
            String m = fizbuz(e);
            sb.append(m);
            if(e<100){
                sb.append(",");
            }
        }
        System.out.println(sb);
    }

    public static String fizbuz(int i) {

        if(i%15==0){
            return "FizzBuzz";
        }else if (i%3==0){
           return "Fizz";
        } else if (i%5==0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
}
