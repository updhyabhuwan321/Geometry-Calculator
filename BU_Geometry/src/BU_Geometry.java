import java.util.Scanner;

/**
 * Modified by Bhuwan Upadhyaya
 * Date: 2/16/2024
 * 
 * In this program we will write different methods and call them in the 
 * main methods of the program to calculate area and perimeter of 
 * three different geometrical shapes
 * 
   This program demonstrates static methods
*/

public class BU_Geometry
{
   public static void main(String[] args)
   {
      int choice;        // The user's choice
      double value = 0;  // The method's return value
      char letter;       // The user's Y or N decision
      double radius;     // The radius of the circle
      double length;     // The length of the rectangle
      double width;      // The width of the rectangle
      double height;     // The height of the triangle
      double base;       // The base of the triangle
      double side1;      // The first side of the triangle
      double side2;      // The second side of the triangle
      double side3;      // The third side of the triangle

      // Create a scanner object to read from the keyboard.
      Scanner keyboard = new Scanner(System.in);

      // The do loop allows the menu to be displayed first.
      do
      {
         // TASK #1 Call the printMenu method
          printMenu();
     
         choice = keyboard.nextInt();

         switch(choice)
         {
            case 1:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleArea method and
               // Store the result in the variable named value.
               value = circleArea(radius);

               System.out.println("The area of the circle is " + value);
               break;
            
            case 2:
               System.out.print("Enter the radius of the circle: ");
               radius = keyboard.nextDouble();

               // TASK #3 Call the circleCircumference method and
               // Store the result in the variable named value.
               value = circleCircumference(radius);

               System.out.println("The circumference of the circle is " + value);
               break;
              
            case 3:
               System.out.print("Enter the height of the triangle: ");
               height = keyboard.nextDouble();
               System.out.print("Enter the base of the triangle: ");
               base = keyboard.nextDouble();

               // TASK #3 Call the triangleArea method and
               // Store the result in the variable named value.
               value = triangleArea(base, height);

               System.out.println("The area of the triangle is " + value);
               break;
               
            case 4:
               System.out.print("Enter the length of side 1 of the triangle: ");
               side1 = keyboard.nextDouble();
               System.out.print("Enter the length of side 2 of the triangle: ");
               side2 = keyboard.nextDouble();
               System.out.print("Enter the length of side 3 of the triangle: ");
               side3 = keyboard.nextDouble();

               value = trianglePerimeter(side1, side2, side3);
               
               System.out.println("The perimeter of the triangle is " + value);
               break;
            
            case 5:
               System.out.print("Enter the length of the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectangleArea method and
               // Store the result in the variable named value.
               value = rectangleArea(length, width);

               System.out.println("The area of the rectangle is " + value);
               break;
               
            case 6:
               System.out.print("Enter the length of the rectangle: ");
               length = keyboard.nextDouble();
               System.out.print("Enter the width of the rectangle: ");
               width = keyboard.nextDouble();

               // TASK #3 Call the rectanglePerimeter method and
               // Store the result in the variable named value.
               value = rectanglePerimeter(length,width);
               
               System.out.println("The perimeter of the rectangle is " + value);
               break;

            default:
               System.out.println("""
                                  You did not enter a valid choice.
                                  Please choose number from 1 through 6""");
         }
         keyboard.nextLine(); // Consume the new line.

         System.out.println("Do you want to exit the program (Y/N)?: ");
         String answer = keyboard.nextLine();
         letter = answer.charAt(0);

      } while(letter != 'Y' && letter != 'y');
   }

   // TASK #1 Create the printMenu method here
   public static void printMenu(){
    System.out.println("""
                       This is a geometry calculator
                       Choose what you would like to calculate
                       1. Find the area of a circle
                       2. Find the circumference of a circle
                       3. Find the area of a triangle
                       4. Find the perimeter of a triangle
                       5. Find the area of a rectangle
                       6. Find the perimeter of a rectangle
                       Enter the number of your choice:""");
   }
  
   // TASK #2 Create the value-returning methods here
   /**
    * this method will calculate the area of circle
    * @param radius ---> radius of the circle
    * @return ---> circleArea
    */
   public static double circleArea(double radius){
       return Math.PI * radius *radius;
   }
   
   /**
    * This method will calculate the circumference of circle
    * radius of circle is needed to calculate circumference of circle 
    * @param radius ----> radius of the circle
    * @return circleCircumference
    */
   public static double circleCircumference(double radius){
       return 2 *  Math.PI * radius;
   }
   
   /**
    * This method will calculate area of triangle
    * base length and height are required to calculate area
    * @param base ---> length of base of the triangle
    * @param height ---> height of the triangle
    * @return ---> traingleArea
    */
   public static double triangleArea(double base, double height){
       return (base * height) / 2;
   }
   /**
    * This method will calculate the perimeter of the triangle
    * length of three sides are required
    * @param side1 --> length of side1
    * @param side2 --> length of side2
    * @param side3 --> length of side3
    * @return  --> perimeter of triangle
    */
   public static double trianglePerimeter(double side1, double side2, double side3){
       return side1 + side2 + side3;
   }
   
   /**
    * This method  will calculate the area of the rectangle 
    * length and width are required for area of rectangle
    * @param length --> length of the side of the rectangle
    * @param width --> width of the rectangle
    * @return --> area of rectangle
    */
   public static double rectangleArea(double length, double width){
       return length * width;
   }
   
   /**
    * This method will calculate the perimeter of rectangle
    * length and width are required to calculate rectanglePerimeter3
    * 
    * @param length --> length of the side of the rectangle
    * @param width --> width of the rectangle
    * @return --> perimeter
    */
   public static double rectanglePerimeter(double length, double width){
       return (2*length)+(2 * width);
   }
   // TASK #4 Write java documentation comments for each method
}