/*
Walther Alvarez
CISC 500
Assignment #9
This program uses the subclass BetterRectangle that provides a getPerimeter and getArea methods to compute the 
area and perimeter of a rectangle. The Rectangle class of the standard Java library does not supply a method to com­
pute the area or the perimeter of a rectangle. The program prompts the user for the coordinates of x and y
then prompts the user for the width and height of the rectangle and return the area and perimeter of it. 
*/
import java.util.Scanner;
public class Assignment9
{
      public static void main(String [] args)
      {
          Scanner in = new Scanner(System.in);

          // Prompting and taking in user input
          System.out.print("Please enter a coordinate points for x and y: ");
          int x = in.nextInt();
          int y = in.nextInt();

          System.out.print("Please enter a width and height: ");
          int width  = in.nextInt();
          int height = in.nextInt();

          BetterRectangle newRectangles = new BetterRectangle(x,y,width,height);

          double rectangleArea = newRectangles.getArea();
          double rectanglePerimeter = newRectangles.getPerimeter();

          System.out.printf("Area of a Rectangle is:     %2.2f",rectangleArea);
          System.out.printf("\nPerimeter of a Rectangle is: %2.2f",rectanglePerimeter);

      }
}