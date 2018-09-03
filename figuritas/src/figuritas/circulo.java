/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuritas;

/**
 *
 * @author Estudiantes
 */
public class circulo extends datos {

    public circulo(double base, double altura, double radio) {
        super(base, altura, radio);
    }

    
 
    
    public double perimetro()
    {
        double radio=getRadio();
        double perimetro=Math.PI*radio*2;
        return perimetro;
    }

     public double area()
    {
        double radio=getRadio();
        double area=Math.PI*radio*radio;
        return area;
    }
    
    
}
