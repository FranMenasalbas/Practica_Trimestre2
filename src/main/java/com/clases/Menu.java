package com.clases;

import java.util.Scanner;

public class Menu {

    //Esto es lo que se muestra en el menu.
    private static final String Primera_opcion_del_menu = "1. Ir al menu principal";
    private static final String Segunda_opcion_del_menu = "2. Obras expuestas";
    private static final String Tercera_opcion_del_menu = "3. Dar de alta una nueva obra";
    private static final String Cuarta_opcion_del_menu = "4. Modificar los datos de una obra";
    private static final String Quinta_opcion_del_menu = "5. Datalles de las obras";
    private static final String Sexta_opcion_del_menu = "6. Precios";
    private static final String Septima_opcion_del_menu = "7. Etiqueta";
    private static final String Opcion_de_salir = "8: Salir de la aplicación";
    private static final String[] Opciones_del_menu = { Primera_opcion_del_menu, Segunda_opcion_del_menu,
            Tercera_opcion_del_menu, Cuarta_opcion_del_menu, Quinta_opcion_del_menu, Sexta_opcion_del_menu,
            Septima_opcion_del_menu, Opcion_de_salir };

    //Estas son las referencias entre numero de opcion y destino.
    private static final int Menu_pricipal = 1;
    private static final int Obras_expuestas = 2;
    private static final int Dar_de_alta = 3;
    private static final int Modificar_los_datos = 4;
    private static final int Detalles = 5;
    private static final int Precios = 6;
    private static final int Etiqueta = 7;
    private static final int Salir = 8;

    private static boolean terminar = false;

    private static final String Mensaje_de_error = "Opcion incorrecta. Prueba a poner otra opcion";
    private static final String Mensaje_de_despedida = "Gracias por usar la aplicación de GALERÍA JDWS, le agradeceriamos que fuese a a ver las obras en persona";
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //muestra el menu principal al iniciar la aplicación
        for(int n = 1; n < 2; n++){
            for(int i = 0; i < Opciones_del_menu.length; i++){
                System.out.println(Opciones_del_menu[i]);
            }
            System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
        }

        //Menu
        while (!terminar){
            
            int UsuarioDice = 0;
            UsuarioDice = sc.nextInt();
            
            //System.out.println(Opciones_del_menu);
            if(UsuarioDice < 0 | UsuarioDice > 8){
                System.out.println(Mensaje_de_error);
            }
            switch (UsuarioDice){
                case Menu_pricipal:
                for(int i = 0; i < Opciones_del_menu.length; i++){
                    System.out.println(Opciones_del_menu[i]);
                }
                System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                break;
                case Obras_expuestas:
                    System.out.println("Obras espuestas");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;
                case Dar_de_alta:
                    System.out.println("Dar de alta");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;
                case Modificar_los_datos:
                    System.out.println("Modificar los datos de una obra");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;
                case Detalles:
                    System.out.println("Detalles");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;
                case Precios:
                    System.out.println("Precios");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;
                case Etiqueta:
                    System.out.println("Etiqueta");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;
                case Salir:
                    System.out.println(Mensaje_de_despedida);
                    terminar = true;
            }
        }

    }
}
