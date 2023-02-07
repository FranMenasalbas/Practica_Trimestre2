package com.clases;

import java.util.Scanner;

public class DetallesyEtiqueta {
    public void detalles(int usuarioElijeObra, Obras[] todasLasObras) {
        System.out.println("¿Qué obra quieres ver?: ");
        Scanner sc = new Scanner(System.in);
        usuarioElijeObra = sc.nextInt();
        for (int i = 0; i < todasLasObras.length; i++) {
            if (todasLasObras[i].getId() == usuarioElijeObra) {
                System.out.println("Nombre de la obra: " + todasLasObras[i].getNombre());
                System.out.println("Autor: " + todasLasObras[i].getAutor());
                System.out.println("Altura: " + todasLasObras[i].getAltura());
                System.out.println("Peso: " + todasLasObras[i].getPeso());
                System.out.println("Número de piezas: " + todasLasObras[i].getPiezas());
                System.out.println("Descripción: " + todasLasObras[i].getDescripcion());
            }
        }
    }

    public void etiqueta(Obras[] todasLasObras, int usuarioElijeObra){
        for (int i = 0; i < todasLasObras.length; i++) {
            if (todasLasObras[i].getId() == usuarioElijeObra) {
                System.out.println("Nombre: " + todasLasObras[i].getNombre());
                System.out.println("Autor: " + todasLasObras[i].getAutor());
                System.out.println("Descripcion: " + todasLasObras[i].getDescripcion());
            }
        }
}
}
