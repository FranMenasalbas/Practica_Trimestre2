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


        //Aqui se archivan las obras.

        Obras obra1 =new Obras(001, "Guernica", "P.Picasso", "Óleo", null, 1000, 5, 2, 5, "cuadro guerra civil");
        Obras obra2 = new Obras(002, "La Vie", "P.Picasso", "Óleo", null, 200, 1, 1, 1, "óleo");
        Obras obra3 = new Obras(003, "El Sueño", "P.Picasso", "Óleo", null, 300, 1.3, 1, 1, "óleo");
        Obras obra4 = new Obras(004, "Retrato de Dora Maar", "P.Picasso", "Óleo", null, 400, 0.8, 1, 5, "óleo");
        Obras obra5 = new Obras(005, "El piel roja", "U.Checa", null, "Escultura", 350, 0.8, 2, 1, "escultura");
        Obras Todas_las_obras[] = {obra1, obra2, obra3, obra4, obra5};


        //muestra el menu principal al iniciar la aplicación
        for(int n = 1; n < 2; n++){
            for(int i = 0; i < Opciones_del_menu.length; i++){
                System.out.println(Opciones_del_menu[i]);
            }
            System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
        }

        
        //Aquí empieza el menú.

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        while (!terminar){
            
            int UsuarioDice = 0;
            int UsuarioElijeObra = 0;
            UsuarioDice = sc.nextInt();

            
            
            
            //System.out.println(Opciones_del_menu);
            if(UsuarioDice < 0 | UsuarioDice > 8){
                System.out.println(Mensaje_de_error);
            }
            switch (UsuarioDice){
                //Menú principal.
                case Menu_pricipal:
                    for(int i = 0; i < Opciones_del_menu.length; i++){
                        System.out.println(Opciones_del_menu[i]);
                    }
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                //Obras expuestas.
                case Obras_expuestas:
                    for(int i = 0; i < Todas_las_obras.length; i++){
                        System.out.println(Todas_las_obras[i]);
                    }
                    System.out.println("Pulsa 1 para volver al menú: ");
                    break;

                //Dar de alta.
                case Dar_de_alta:
                    System.out.println("Dar de alta");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                //Modificar los datos.
                case Modificar_los_datos:
                    System.out.println("Modificar los datos de una obra");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                //Detalles.
                case Detalles:
                System.out.println("¿Qué obra quieres ver?: ");
                UsuarioElijeObra = sc2.nextInt();
                
                    switch (UsuarioElijeObra) {
                        case 1:
                            System.out.println("Nombre de la obra: " + obra1.getNombre() +", Autor: " + obra1.getAutor() + ", Altura: " + obra1.getAltura() + ", Peso: " + obra1.getPeso() + ", Número de piezas: " + obra1.getPiezas() + ", Descripción: " + obra1.getDescripcion());
                            break;
                        case 2:
                            System.out.println("Nombre de la obra: " + obra2.getNombre() +", Autor: " + obra2.getAutor() + ", Altura: " + obra2.getAltura() + ", Peso: " + obra2.getPeso() + ", Número de piezas: " + obra2.getPiezas() + ", Descripción: " + obra2.getDescripcion());
                            break;
                        case 3:
                            System.out.println("Nombre de la obra: " + obra3.getNombre() +", Autor: " + obra3.getAutor() + ", Altura: " + obra3.getAltura() + ", Peso: " + obra3.getPeso() + ", Número de piezas: " + obra3.getPiezas() + ", Descripción: " + obra3.getDescripcion());
                            break;
                        case 4:
                            System.out.println("Nombre de la obra: " + obra4.getNombre() +", Autor: " + obra4.getAutor() + ", Altura: " + obra4.getAltura() + ", Peso: " + obra4.getPeso() + ", Número de piezas: " + obra4.getPiezas() + ", Descripción: " + obra4.getDescripcion());
                            break;
                        case 5:
                            System.out.println("Nombre de la obra: " + obra5.getNombre() +", Autor: " + obra5.getAutor() + ", Altura: " + obra5.getAltura() + ", Peso: " + obra5.getPeso() + ", Número de piezas: " + obra5.getPiezas() + ", Descripción: " + obra5.getDescripcion());
                            break;
                    }
                    
                    System.out.println("Pulsa 1 para volver al menú: ");
                    break;

                //Precios.
                case Precios:
                    System.out.println("Precios");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                //Etiqueta.
                case Etiqueta:
                    System.out.println("Etiqueta");
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                //Salir
                case Salir:
                    System.out.println(Mensaje_de_despedida);
                    terminar = true;
            }
        }

    }
}
