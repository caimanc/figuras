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
import java.util.Scanner;
public class Figuritas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ya=new Scanner(System.in);
        System.out.println("A que figura desea hallarle el area y el perimetro");
        System.out.println("1. triangulo");
        System.out.println("2. cuadrado");
        System.out.println("3. circulo");
        System.out.println("4. rectangulo");
        int valor=ya.nextInt();
        double base=0;
        double altura=0;
        double radio=0;
        
        switch (valor)
        {
            case 1:
                System.out.println("ingrese base");
                base=ya.nextDouble();
                System.out.println("ingrese altura");
                altura=ya.nextDouble();
                triangulo t=new triangulo(base,altura,radio);
                
                break;
            case 2:
                System.out.println("ingrese base");
                base=ya.nextDouble();
                System.out.println("ingrese altura");
                altura=ya.nextDouble();
                break;
            case 3:
                System.out.println("radio");
                radio=ya.nextDouble();
                break;
            case 4:
                System.out.println("ingrese base");
                base=ya.nextDouble();
                System.out.println("ingrese altura");
                altura=ya.nextDouble();
                break;
        }
    }
    
}
