/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quicksort;

/**
 *
 * @author felipe
 */
public class Quicksort {

    public static void main(String[] args) {

    int []arreglo = {1,2,3,4,5,6,7,8,9,10 };
        
    Ordenador o = new Ordenador();
    o.ordenarQuicksort(arreglo);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
