package rectangleoverlapsing;

import java.util.Scanner;

public class RectangleOverlapsing {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectangle one = new Rectangle(in.nextLine());
        Rectangle two = new Rectangle(in.nextLine());
        
        println("\nRectangle 1 :");
        one.drawRectangle(25);
        
        println("\nRectangle 2 :");
        two.drawRectangle(25);
        
        println("\nRectangles Overlapsing :");
        Rectangle.rectangleOverlapsing(25, one, two);
    }
    
    public static void print(String value) {
        System.out.print(value);
    }
    
    public static void println(String value) {
        System.out.println(value);
    }
}
