package com.clases;

import java.util.Scanner;

public class Menu {

    // Esto es lo que se muestra en el menu.

    private static final String Primera_opcion_del_menu = "1. Obras expuestas";
    private static final String Segunda_opcion_del_menu = "2. Dar de alta una nueva obra";
    private static final String Tercera_opcion_del_menu = "3. Modificar los datos de una obra";
    private static final String Cuarta_opcion_del_menu = "4. Datalles de las obras";
    private static final String Quinta_opcion_del_menu = "5. Precios";
    private static final String Sexta_opcion_del_menu = "6. Etiqueta";
    private static final String Opcion_de_salir = "7. Salir de la aplicación";
    private static final String Opcion_Fantasma = "8. Ir al menu principal";
    private static final String[] opcionesDelMenu = { Primera_opcion_del_menu,
            Segunda_opcion_del_menu, Tercera_opcion_del_menu, Cuarta_opcion_del_menu, Quinta_opcion_del_menu,
            Sexta_opcion_del_menu, Opcion_de_salir, Opcion_Fantasma };

    // Estas son las referencias entre numero de opcion y destino.

    private static final int Obras_expuestas = 1; // hecho
    private static final int Dar_de_alta = 2; // hecho
    private static final int Modificar_los_datos = 3;
    private static final int Detalles = 4;// hecho
    private static final int Precios = 5;
    private static final int Etiqueta = 6; // hecho
    private static final int Salir = 7; // hecho
    private static final int Menu_pricipal = 8; // hecho

    private static boolean terminar = false;

    private static final String MensajeDeError = "Opcion incorrecta. Prueba a poner otra opcion";
    private static final String Mensaje_de_despedida = "Gracias por usar la aplicación de GALERÍA JDWS, le agradeceriamos que fuese a ver las obras en persona";

    public static void main(String[] args) {

        // Aqui se archivan las obras.

        Obras obra1 = new Obras(001, "Guernica", "P.Picasso", "Óleo", null, 1000, 5, 2, 5, "cuadro guerra civil");
        Obras obra2 = new Obras(002, "La Vie", "P.Picasso", "Óleo", null, 200, 1, 1, 1, "óleo");
        Obras obra3 = new Obras(003, "El Sueño", "P.Picasso", "Óleo", null, 300, 1.3, 1, 1, "óleo");
        Obras obra4 = new Obras(004, "Retrato de Dora Maar", "P.Picasso", "Óleo", null, 400, 0.8, 1, 5, "óleo");
        Obras obra5 = new Obras(005, "El piel roja", "U.Checa", null, "Escultura", 350, 0.8, 2, 1, "escultura");
        Obras[] todasLasObras = { obra1, obra2, obra3, obra4, obra5 };

        // muestra el menu principal al iniciar la aplicación
        for (int n = 1; n < 2; n++) {
            for (int i = 0; i < opcionesDelMenu.length - 1; i++) {
                System.out.println(opcionesDelMenu[i]);
            }
            System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
        }

        // Aquí empieza el menú.

        Scanner sc = new Scanner(System.in);

        while (!terminar) {

            int UsuarioDice = 0;
            int UsuarioElijeObra = 0;
            String UsuarioDaNombre = null;
            String UsuarioDaAutor = null;
            String UsuarioDaTecnica = null;
            String UsuarioDaMaterial = null;
            int UsuarioDaPrecio = 0;
            int UsuarioDaAltura = 0;
            int UsuarioDaPeso = 0;
            int UsuarioDaPiezas = 0;
            String UsuarioDaDescripcion = null;
            UsuarioDice = sc.nextInt();

            // System.out.println(Opciones_del_menu);
            if (UsuarioDice <= 0 | UsuarioDice > 8) {
                System.out.println(MensajeDeError);
            }
            switch (UsuarioDice) {
                // Menú principal.
                case Menu_pricipal:
                    for (int i = 0; i < opcionesDelMenu.length - 1; i++) {
                        System.out.println(opcionesDelMenu[i]);
                    }
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                // Obras expuestas.
                case Obras_expuestas:
                    for (int i = 0; i < todasLasObras.length; i++) {
                        System.out.println(todasLasObras[i]);
                    }
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Dar de alta.
                case Dar_de_alta:

                    Obras[] MasEspacioParaNuevasObras = new Obras[todasLasObras.length + 1];
                    for (int i = 0; i < todasLasObras.length; i++) {
                        MasEspacioParaNuevasObras[i] = todasLasObras[i];
                    }
                    System.out.println(
                            "El id de la obra se registrara automaticamente con el Id más grande disponible, si desea cambiarlo dirijase al menu de modificacion de datos, ahora empecemos a dar de alta la nueva obra.");

                    System.out.println("Como se llama la obra?: ");
                    sc.nextLine();
                    UsuarioDaNombre = sc.nextLine();
                    System.out.println("Quien es el autor?: ");
                    UsuarioDaAutor = sc.nextLine();
                    System.out.println(
                            "Si es una pintura, porfavor introduzca la tecnica con la que se hecho(si es una escultura pase a la siguiente opción): ");
                    UsuarioDaTecnica = sc.nextLine();
                    System.out.println("Si es una escultura, porfavor introduzca de que material está hecha: ");
                    UsuarioDaMaterial = sc.nextLine();
                    System.out.println("Por último, introduzca una descripción a la obra: ");
                    UsuarioDaDescripcion = sc.nextLine();
                    System.out.println("Guay, ahora pasemos a los números");
                    System.out.println("Introduzca el precio base de la obra: ");
                    UsuarioDaPrecio = sc.nextInt();
                    System.out.println("Introduzca la altura de la obra (EN METROS): ");
                    UsuarioDaAltura = sc.nextInt();
                    System.out.println("Introduzca el peso de la obra (EN TONELADAS): ");
                    UsuarioDaPeso = sc.nextInt();
                    System.out.println("Introduzca el número de piezas que componen la obra: ");
                    UsuarioDaPiezas = sc.nextInt();
                    Obras ObraNueva = new Obras(MasEspacioParaNuevasObras.length, UsuarioDaNombre, UsuarioDaAutor,
                            UsuarioDaTecnica, UsuarioDaMaterial, UsuarioDaPrecio, UsuarioDaAltura, UsuarioDaPeso,
                            UsuarioDaPiezas, UsuarioDaDescripcion);

                    MasEspacioParaNuevasObras[MasEspacioParaNuevasObras.length - 1] = ObraNueva;
                    todasLasObras = MasEspacioParaNuevasObras;

                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Modificar los datos.
                case Modificar_los_datos:
                    System.out.println("Modificar los datos de una obra");
                    System.out.println("¿Pulsa 8 para volver al menú: ");
                    break;

                // Detalles.
                case Detalles:
                    System.out.println("¿Qué obra quieres ver?: ");
                    UsuarioElijeObra = sc.nextInt();
                    System.out.println(
                            "Nombre de la obra: " + todasLasObras[UsuarioElijeObra - 1].getNombre() + ", Autor: "
                                    + todasLasObras[UsuarioElijeObra - 1].getAutor() + ", Altura: "
                                    + todasLasObras[UsuarioElijeObra - 1].getAltura() + ", Peso: "
                                    + todasLasObras[UsuarioElijeObra - 1].getPeso()
                                    + ", Número de piezas: " + todasLasObras[UsuarioElijeObra - 1].getPiezas()
                                    + ", Descripción: "
                                    + todasLasObras[UsuarioElijeObra - 1].getDescripcion());
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Precios.
                case Precios:
                    System.out.println("¿Qué obra quieres comprar?: ");
                    UsuarioElijeObra = sc.nextInt();
                    double comision = (todasLasObras[UsuarioElijeObra-1].getPrecio() * 25) / 100;
                    double importePorPeso = 20;
                    double importePorAltura = 20;
                    int importePorPiezas = 20;
                    double descuentoPorTecnicaPictorica = 0;
                    double descuentoPorSerEscultura = 0;
                    int importePorSerEscultura = 0;
                    double precioTotal = todasLasObras[UsuarioElijeObra-1].getPrecio() + comision + importePorPeso
                            + importePorAltura + importePorPiezas - descuentoPorTecnicaPictorica
                            - descuentoPorSerEscultura + importePorSerEscultura;
                    
                    if (todasLasObras[UsuarioElijeObra-1].getPeso() > 1) {
                        importePorPeso = 100;
                    }
                    if (todasLasObras[UsuarioElijeObra-1].getAltura() > 2) {
                        importePorAltura = 100;
                    }
                    if (todasLasObras[UsuarioElijeObra-1].getPiezas() > 2) {
                        importePorPiezas = 100;
                    }
                    if (todasLasObras[UsuarioElijeObra-1].getTecnica() == "Pictorica" // Esto se debe a que el código
                                                                                    // acepte que el galerista se
                                                                                    // equivoque al meter la Tecnica de
                                                                                    // la obra.
                            | todasLasObras[UsuarioElijeObra-1].getTecnica() == "pictorica"
                            | todasLasObras[UsuarioElijeObra-1].getTecnica() == "Píctorica"
                            | todasLasObras[UsuarioElijeObra-1].getTecnica() == "píctorica") {
                        descuentoPorTecnicaPictorica = (todasLasObras[UsuarioElijeObra-1].getPrecio() * 10) / 100;
                    }
                    if (todasLasObras[UsuarioElijeObra-1].getMaterial() != null
                            | todasLasObras[UsuarioElijeObra-1].getMaterial() == "") {
                        descuentoPorSerEscultura = (todasLasObras[UsuarioElijeObra-1].getPrecio() * 20) / 100;
                    }
                    if (todasLasObras[UsuarioElijeObra-1].getMaterial() != null
                            | todasLasObras[UsuarioElijeObra-1].getMaterial() == "") {
                        importePorSerEscultura = 50;
                    }
                    System.out.println("Ésta obra cuesta: " + precioTotal + " euros");
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Etiqueta.
                case Etiqueta:
                    System.out.println("Etiqueta");
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Salir
                case Salir:
                    System.out.println(Mensaje_de_despedida);
                    terminar = true;
            }
        }

    }
}
