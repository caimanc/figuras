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
public class triangulo extends datos
{

    public triangulo(double base, double altura, double radio) {
        super(base, altura, radio);
    }

    
    
    
   
     public double perimetro()
    {
        double base=getBase();
        double altura=getAltura();
        double lado3=Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
        double perimetro=lado3+base+altura;
        return perimetro;
    }
     public double area()
     {
         double area=getArea();
         return area/2;
     }
    
}
