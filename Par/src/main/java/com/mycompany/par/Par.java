package com.mycompany.Par;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner; // Importar la clase Scanner


/**
 *
 * @author Hns. Monterroso
 */
public class Par { // Define una clase publica llamada Par

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Crea una instancia de Scanner para leer lo que el usuario le indique
        System.out.println("Ingrese un valor: "); //Solicita al usuario que ingrese un valor de tipo entero
        int numero = scanner.nextInt(); // Lee el valor entero que el usuario ingreso

        if (numero % 2 == 0) { // Comprueba si el numero ingresado es par 
            System.out.println(numero + " es par."); // Si es par, muestra el mensaje "par"
        } else {
            System.out.println(numero + " es impar."); // Si no es par muestra un mensaje indicando que es "impar"
        }
    }
}
   
