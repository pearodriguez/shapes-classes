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
public class Shape {
    private double name; 
    private double length; 
    private double width; 
    private double area; 
    private double radius; 
    private double pi = 3.14; 
    
    public Shape () 
    {
        
    }
    
    public Shape(double l, double w) 
    {
        length = l; 
        width = w; 
    }

    public Shape (double r)
    {
        radius = r; 
    }
    
    // Setters & Getters 

    public double setLength(double l)
    {
        length = l; 
        return length; 
    }
    
    public double getLength()
    {
        return length; 
    }
        
    public double setWidth(double w)
    {
        width = w; 
        return width; 
    }
    
    public double getwidth()
    {
        return width; 
    }
      
    public double setRadius(double r)
    {
        radius = r; 
        return radius; 
    }
    
    public double getRadius()
    {
        
        return radius; 
    }
        
    public double setPi(double p)
    {
        pi = p; 
        return p; 
    }
    
    public double getPi()
    {
        return pi; 
    }
    
    public double setArea (double a) 
    {
        area = a; 
        return area; 
    }
    
    public double getArea()
    {
        area = 0.0;
        return area;
    }
    
    public double area () 
    {
        this.area = this.getLength() * this.getLength(); 
        return area; 
    }
    
    @Override
    public String toString()
    {
        return "Length: " + length + " Width: " + width + " Area: " + area; 
    }
    

}
