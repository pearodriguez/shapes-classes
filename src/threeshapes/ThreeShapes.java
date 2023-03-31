/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeshapes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author peterrodriguez
 */
public class ThreeShapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    ArrayList <Shape> sh = new ArrayList(); 
    Scanner input = new Scanner (System.in); 
    int option, num; 
    double length, width, radius;  
    
    do {
        menu(); 
        System.out.println("\nEnter option: "); 
        option = input.nextInt(); 
            
        switch (option) {
            case 0:
                System.out.print("Goodbye\n");
                break;
            case 1:
                System.out.println("How many Rectangles: ");
                num = input.nextInt(); 
                for(int i = 0; i < num; i++ ){
                System.out.println("Rectangle length: "); 
                length = input.nextDouble(); 
                System.out.println("Rectangle width: "); 
                width = input.nextDouble(); 
                Rectangle r = new Rectangle (length, width);
                r.area(); 
                sh.add(r); 
                }
                break;
            case 2:
                System.out.println("How many Squares: ");
                num = input.nextInt(); 
                for(int i = 0; i < num; i++) {
                System.out.println("Square length: "); 
                length = input.nextDouble(); 
                System.out.println("Square width: "); 
                width = input.nextDouble(); 
                Square sq = new Square(length, width); 
                sq.area(); 
                sh.add(sq); 
                }
                break;
            case 3:                
                System.out.println("How many Circles: ");
                num = input.nextInt(); 
                for(int i = 0; i < num; i++) {
                System.out.println("Radius length: "); 
                radius = input.nextDouble(); 
                Circle c = new Circle(radius); 
                c.area(); 
                sh.add(c); 
                }
                break;
            case 4: 
                System.out.println("\nList of Shapes: "); 
                for(Shape s : sh)
                    System.out.println(s.getClass().getSimpleName() + " ==> " + " area: " + s.area()); 
                break;
            default:
                System.out.print("Error, try again");     
                break;
            }
        } while (option != 0);
        
    }
    
    public static void menu () 
    {
        System.out.println("\nOptions" + "\n0) Quit" + " 1) Rectangle" + 
                            " 2) Square" + " 3) Circle" + " 4) Display Shapes" ); 
    }


}
    /* TESTING
    Shape s = new Shape(); 
    System.out.println(s.toString()); 
    
    System.out.println("\n=====RECTANGLE====");
    Rectangle r = new Rectangle(5.0, 10.0); 
    //System.out.println(r.toString()); 
    r.area();
    System.out.println(r.toString()); 
    
    System.out.println("\n=====SQUARE=====");
    
    Square sq = new Square(5.5, 5.5); 
    sq.area(); 
    System.out.println(sq.toString()); 
    
    System.out.println("\n=====CIRCLE=====");
    
    Circle c = new Circle (2.5); 
    System.out.println(c.toString());
    */ 