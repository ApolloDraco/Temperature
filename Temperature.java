/* 
 *  Description: A Java program for converting 35 degrees Celsius to Fahrenheit
 */

public class Temperature {
    public static void main(String[] args) {
        float celsius = 35;
        float fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("%.2f degrees Celsius is equal to %.2f degrees Fahrenheit", celsius, fahrenheit);
    }
}
