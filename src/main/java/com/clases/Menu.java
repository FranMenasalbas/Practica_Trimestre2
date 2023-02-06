package com.clases;

import java.util.Scanner;

public class Menu {

    // Esto es lo que se muestra en el menu.

    private static final String PRIMERA_OPCION_DEL_MENU = "1. Obras expuestas";
    private static final String SEGUNDA_OPCION_DEL_MENU = "2. Dar de alta una nueva obra";
    private static final String TERCERA_OPCION_DEL_MENU = "3. Modificar los datos de una obra";
    private static final String CUARTA_OPCION_DEL_MENU = "4. Datalles de las obras";
    private static final String QUINTA_OPCION_DEL_MENU = "5. Precios";
    private static final String SEXTA_OPCION_DEL_MENU = "6. Etiqueta";
    private static final String OPCION_DE_SALIR = "7. Salir de la aplicación";
    private static final String[] OPCIONES_DEL_MENU = { PRIMERA_OPCION_DEL_MENU,
            SEGUNDA_OPCION_DEL_MENU, TERCERA_OPCION_DEL_MENU, CUARTA_OPCION_DEL_MENU, QUINTA_OPCION_DEL_MENU,
            SEXTA_OPCION_DEL_MENU, OPCION_DE_SALIR };

    // Estas son las referencias entre numero de opcion y destino.

    private static final int OBRAS_EXPUESTAS = 1; // hecho
    private static final int DAR_DE_ALTA_UNA_NUEVA_OBRA = 2; // hecho
    private static final int MODIFICAR_LOS_DATOS = 3;
    private static final int DETALLES = 4;// hecho
    private static final int PRECIOS = 5; // hecho
    private static final int ETIQUETA = 6;
    private static final int SALIR = 7; // hecho
    private static final int MENU_PRINCIPAL = 8; // hecho

    private static boolean terminar = false;

    private static final String MENSAJE_DE_ERROR = "Opcion incorrecta. Prueba a poner otra opcion";
    private static final String MENSAJE_DE_DESPEDIDA = "Gracias por usar la aplicación de GALERÍA JDWS, le agradeceriamos que fuese a ver las obras en persona";

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
            for (int i = 0; i < OPCIONES_DEL_MENU.length; i++) {
                System.out.println(OPCIONES_DEL_MENU[i]);
            }
            System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
        }

        // Aquí empieza el menú.

        Scanner sc = new Scanner(System.in);

        while (!terminar) {

            int usuarioDice = 0;
            int usuarioElijeObra = 0;
            String usuarioDaNombre = null;
            String usuarioDaAutor = null;
            String usuarioDaTecnica = null;
            String usuarioDaMaterial = null;
            int usuarioDaPrecio = 0;
            int usuarioDaAltura = 0;
            int usuarioDaPeso = 0;
            int usuarioDaPiezas = 0;
            String usuarioDaDescripcion = null;
            usuarioDice = sc.nextInt();

            if (usuarioDice <= 0 | usuarioDice > 8) {
                System.out.println(MENSAJE_DE_ERROR);
            }
            switch (usuarioDice) {

                // Menú principal.

                case MENU_PRINCIPAL:
                    for (int i = 0; i < OPCIONES_DEL_MENU.length; i++) {
                        System.out.println(OPCIONES_DEL_MENU[i]);
                    }
                    System.out.println("¿A donde quieres ir? (Usa los numeros correspondientes NO el nombre): ");
                    break;

                // Obras expuestas.

                case OBRAS_EXPUESTAS:
                    for (int i = 0; i < todasLasObras.length; i++) {
                        System.out.println(todasLasObras[i]);
                    }
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Dar de alta.

                case DAR_DE_ALTA_UNA_NUEVA_OBRA:

                    Obras[] MasEspacioParaNuevasObras = new Obras[todasLasObras.length + 1];
                    for (int i = 0; i < todasLasObras.length; i++) {
                        MasEspacioParaNuevasObras[i] = todasLasObras[i];
                    }
                    System.out.println(
                            "El id de la obra se registrara automaticamente con el Id más grande disponible, si desea cambiarlo dirijase al menu de modificacion de datos, ahora empecemos a dar de alta la nueva obra.");

                    System.out.println("Como se llama la obra?: ");
                    sc.nextLine();
                    usuarioDaNombre = sc.nextLine();
                    System.out.println("Quien es el autor?: ");
                    usuarioDaAutor = sc.nextLine();
                    System.out.println(
                            "Si es una pintura, porfavor introduzca la tecnica con la que se hecho(si es una escultura pase a la siguiente opción): ");
                    usuarioDaTecnica = sc.nextLine();
                    System.out.println("Si es una escultura, porfavor introduzca de que material está hecha: ");
                    usuarioDaMaterial = sc.nextLine();
                    System.out.println("Por último, introduzca una descripción a la obra: ");
                    usuarioDaDescripcion = sc.nextLine();
                    System.out.println("Guay, ahora pasemos a los números");
                    System.out.println("Introduzca el precio base de la obra: ");
                    usuarioDaPrecio = sc.nextInt();
                    System.out.println("Introduzca la altura de la obra (EN METROS): ");
                    usuarioDaAltura = sc.nextInt();
                    System.out.println("Introduzca el peso de la obra (EN TONELADAS): ");
                    usuarioDaPeso = sc.nextInt();
                    System.out.println("Introduzca el número de piezas que componen la obra: ");
                    usuarioDaPiezas = sc.nextInt();
                    Obras ObraNueva = new Obras(MasEspacioParaNuevasObras.length, usuarioDaNombre, usuarioDaAutor,
                            usuarioDaTecnica, usuarioDaMaterial, usuarioDaPrecio, usuarioDaAltura, usuarioDaPeso,
                            usuarioDaPiezas, usuarioDaDescripcion);

                    MasEspacioParaNuevasObras[MasEspacioParaNuevasObras.length - 1] = ObraNueva;
                    todasLasObras = MasEspacioParaNuevasObras;

                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Modificar los datos.

                case MODIFICAR_LOS_DATOS:
                    System.out.println("Modificar los datos de una obra");
                    System.out.println("¿Pulsa 8 para volver al menú: ");
                    break;

                // Detalles.

                case DETALLES:
                    System.out.println("¿Qué obra quieres ver?: ");
                    usuarioElijeObra = sc.nextInt();
                    System.out.println(
                            "Nombre de la obra: " + todasLasObras[usuarioElijeObra - 1].getNombre() + ", Autor: "
                                    + todasLasObras[usuarioElijeObra - 1].getAutor() + ", Altura: "
                                    + todasLasObras[usuarioElijeObra - 1].getAltura() + ", Peso: "
                                    + todasLasObras[usuarioElijeObra - 1].getPeso()
                                    + ", Número de piezas: " + todasLasObras[usuarioElijeObra - 1].getPiezas()
                                    + ", Descripción: "
                                    + todasLasObras[usuarioElijeObra - 1].getDescripcion());
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Precios.

                case PRECIOS:
                    System.out.println("Introduce el ID de la obra quieres comprar: ");
                    usuarioElijeObra = sc.nextInt();
                    double comision = (todasLasObras[usuarioElijeObra - 1].getPrecio() * 25) / 100;
                    double importePorPeso = 20;
                    double importePorAltura = 20;
                    int importePorPiezas = 20;
                    int numeroDePiezas = 0;
                    double descuentoPorTecnicaPictorica = 0;
                    double descuentoPorSerEscultura = 0;
                    int importePorSerEscultura = 0;

                    // calcula los importes y descuentos

                    if (todasLasObras[usuarioElijeObra - 1].getPeso() > 1) {
                        importePorPeso = 100;
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getAltura() > 2) {
                        importePorAltura = 100;
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getPiezas() > 2) {
                        for (int i = 0; i < todasLasObras[usuarioElijeObra - 1].getPiezas(); i++) {
                            numeroDePiezas++;
                        }
                        importePorPiezas = (numeroDePiezas - 2) * 100;
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getTecnica() == "Pictorica"
                            | todasLasObras[usuarioElijeObra - 1].getTecnica() == "pictorica"
                            | todasLasObras[usuarioElijeObra - 1].getTecnica() == "Píctorica"
                            | todasLasObras[usuarioElijeObra - 1].getTecnica() == "píctorica") {
                        descuentoPorTecnicaPictorica = (todasLasObras[usuarioElijeObra - 1].getPrecio() * 10) / 100;
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getMaterial() != null
                            | todasLasObras[usuarioElijeObra - 1].getMaterial() == "") {
                        descuentoPorSerEscultura = (todasLasObras[usuarioElijeObra - 1].getPrecio() * 20) / 100;
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getMaterial() != null
                            | todasLasObras[usuarioElijeObra - 1].getMaterial() == "") {
                        importePorSerEscultura = 50;
                    }

                    // calcula el precio

                    double precioDeVenta = todasLasObras[usuarioElijeObra - 1].getPrecio() + comision + importePorPeso
                            + importePorAltura + importePorPiezas + importePorSerEscultura;
                    double precioTotal = todasLasObras[usuarioElijeObra - 1].getPrecio() + comision + importePorPeso
                            + importePorAltura + importePorPiezas - descuentoPorTecnicaPictorica
                            - descuentoPorSerEscultura + importePorSerEscultura;

                    // Imprime el precio

                    System.out.println("Nombre:" + todasLasObras[usuarioElijeObra - 1].getNombre());
                    System.out.println("Altura:" + todasLasObras[usuarioElijeObra - 1].getAltura());
                    System.out.println("Peso:" + todasLasObras[usuarioElijeObra - 1].getPeso());
                    System.out.println("Número de piezas:" + todasLasObras[usuarioElijeObra - 1].getPiezas());
                    System.out.println("Precio base:" + todasLasObras[usuarioElijeObra - 1].getPrecio() + "euros");
                    System.out.println("Comision de la galería:" + comision);
                    System.out.println("Importe por peso:" + importePorPeso);
                    System.out.println("Importe por altura:" + importePorAltura);
                    for (int i = 3; i < todasLasObras[usuarioElijeObra - 1].getPiezas() + 1; i++) {
                        System.out.println("Importe por pieza " + i + ": 100 euros");
                    }
                    System.out.println("Precio de venta:" + precioDeVenta + " euros");
                    if (todasLasObras[usuarioElijeObra - 1].getTecnica() == "Pictorica"
                            | todasLasObras[usuarioElijeObra - 1].getTecnica() == "pictorica"
                            | todasLasObras[usuarioElijeObra - 1].getTecnica() == "Pictórica"
                            | todasLasObras[usuarioElijeObra - 1].getTecnica() == "pictórica") {
                        System.out.println("Descuento por ser una obra con técnica  pictórica: "
                                + descuentoPorTecnicaPictorica + " euros");
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getMaterial() != null
                            | todasLasObras[usuarioElijeObra - 1].getMaterial() == "") {
                        System.out.println("Descuento por ser escultura: " + descuentoPorSerEscultura + " euros");
                    }
                    if (todasLasObras[usuarioElijeObra - 1].getMaterial() != null
                            | todasLasObras[usuarioElijeObra - 1].getMaterial() == "") {
                        System.out.println("Importe por ser escultura: " + importePorSerEscultura + " euros");
                    }
                    if (descuentoPorTecnicaPictorica == 0 & descuentoPorSerEscultura == 0) {
                        System.out.println("Ésta obra no tiene descuentos");
                    }
                    System.out.println("Ésta obra cuesta un total de : " + precioTotal + " euros");
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Etiqueta.

                case ETIQUETA:
                System.out.println("Introduce el ID de la obra que quieras ver su etiqueta: ");
                usuarioElijeObra = sc.nextInt();
                    System.out.println("Nombre: " + todasLasObras[usuarioElijeObra - 1].getNombre());
                    System.out.println("Autor: " + todasLasObras[usuarioElijeObra - 1].getAutor());
                    System.out.println("Descripcion: " + todasLasObras[usuarioElijeObra - 1].getDescripcion());
                    System.out.println("Pulsa 8 para volver al menú: ");
                    break;

                // Salir.

                case SALIR:
                    System.out.println(MENSAJE_DE_DESPEDIDA);
                    terminar = true;
            }
        }
    }
}