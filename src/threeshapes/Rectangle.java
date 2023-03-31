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
public class Rectangle extends Shape {

    
    public Rectangle () 
    {
        super(); 
    }
    
    public Rectangle (double l, double w)
    {
        super(l, w); 
    }
    
    @Override
    public double area()
{
    double a = this.getArea(); 
    a = this.getLength() * this.getwidth(); 
    return this.setArea(a); 
}
    
}
