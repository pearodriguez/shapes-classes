/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threeshapes;

/**
 *
 * @author peterrodriguez
 */
public class Circle extends Shape {
    
    public Circle()
    {
        super(); 
    }
    
    public Circle(double r)
    {
        super(r); 
    }
    
    @Override
    public double area()
    {
        double a = this.getArea(); 
        a = (this.getRadius() * this.getRadius()) * this.getPi(); 
        return a; 
    }
    
    @Override
    public String toString()
    {
        return "Radius: " + this.getRadius() + " Pi: " + this.getPi() + " Area: " + this.area(); 
    }
    
}
