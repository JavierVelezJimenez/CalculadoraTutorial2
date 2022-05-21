/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author javie
 */
package calculadora;

/**
 *
 * @author javie
 */
public class CalculadoraTutorial2 {
    

    private String nombre;
    private double numero1;//atributos
    private double numero2;

    public CalculadoraTutorial2(String nombre, double numero1, double numero2) {
        this.nombre = nombre;
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public CalculadoraTutorial2(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;

    }

    public CalculadoraTutorial2() {
    }

    // sets and gets
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }
    //mÃ©todos
    public double suma() {
        double suma = numero1 + numero2;
        return suma;
    }

    public double resta() {
        double resta = numero1 - numero2;
        return resta;
    }
}
