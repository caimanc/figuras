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
public class datos 
{
    private double base;
    private double altura;
    private double radio;
    private double area;
    private double perimetro;

    public datos(double base, double altura, double radio) {
        this.base = base;
        this.altura = altura;
        this.radio = radio;
    }

    

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        this.area=this.base*this.altura;
        return area;
    }

    public double getPerimetro() {
        this.perimetro=this.base*2+this.altura*2;
        return perimetro;
    }
    
}
