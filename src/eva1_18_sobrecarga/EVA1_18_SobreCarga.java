/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga;

/**
 *
 * @author IvanTron
 */
public class EVA1_18_SobreCarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola Mundo!!");
        Prueba obj = new Prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Área de un rectangulo de 15 x 20" + calcularArea(15, 20));
        System.out.println("Área de un triangulo de 15 x 20" + calcularArea(15.0, 20.0, 1));
        System.out.println("Área de un círculo de radio 100 " + calcularArea(100));
        System.out.println("Área de un círculo de radio 100 " + calcularArea(100));
    }
    //Calcula el área de un rectangulo
    public static double calcularArea(double largo, double ancho) {
        return largo * ancho;
    }
    //Calcula el área de un triangulo
    public static double calcularArea(double base, double altura, int esTriangulo) {
        return base * altura;
    }
    //Calcula el área de un triangulo
    public static double calcularArea(int esTriangulo, double base, double altura) {
        return base * altura;
    }
    //Calcula el área de un circulo
    public static double calcularArea(double radio) {
        System.out.println("Double");
        return Math.PI * Math.pow(radio, 2);
    }
    //Calcula el área de un circulo con entero
    public static double calculaArea(int radio) {
        System.out.println("Entero");
        return Math.PI * Math.pow(radio, 2);
    }
}

class Prueba {
    
}