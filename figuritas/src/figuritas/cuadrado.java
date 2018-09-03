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
public class cuadrado extends datos{

    public cuadrado(double base, double altura, double radio) {
        super(base, altura, radio);
    }

    
    
    public double perimetro()
     {
         double perimetro=getPerimetro();
         return perimetro;
     }
    public double area()
     {
         double area=getArea();
         return area;
     }
    
}
