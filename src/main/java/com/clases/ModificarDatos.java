package com.clases;

import java.util.Scanner;

public class ModificarDatos {

    private static final int ID = 1;
    private static final int NOMBRE = 2;
    private static final int AUTOR = 3;
    private static final int TECNICA = 4;
    private static final int MATERIAL = 5;
    private static final int PRECIO = 6;
    private static final int ALTURA = 7;
    private static final int PESO = 8;
    private static final int PIEZAS = 9;
    private static final int DESCRIPCION = 10;

    private static final String PRIMERA_OPCION_DE_MODIFICACION = "1. ID";
    private static final String SEGUNDA_OPCION_DE_MODIFICACION = "2. Nombre";
    private static final String TERCERA_OPCION_DE_MODIFICACION = "3. Autor";
    private static final String CUARTA_OPCION_DE_MODIFICACION = "4. Tecnica";
    private static final String QUINTA_OPCION_DE_MODIFICACION = "5. Material";
    private static final String SEXTA_OPCION_DE_MODIFICACION = "6. Precio";
    private static final String SEPTIMA_OPCION_DE_MODIFICACION = "7. Altura";
    private static final String OCTAVA_OPCION_DE_MODIFICACION = "8. Peso";
    private static final String NOVENA_OPCION_DE_MODIFICACION = "9. Piezas";
    private static final String DECIMA_OPCION_DE_MODIFICACION = "10. Descripción";
    private static final String[] OPCIONES_DEL_DE_MODIFICACION = { PRIMERA_OPCION_DE_MODIFICACION,
            SEGUNDA_OPCION_DE_MODIFICACION, TERCERA_OPCION_DE_MODIFICACION, CUARTA_OPCION_DE_MODIFICACION,
            QUINTA_OPCION_DE_MODIFICACION,
            SEXTA_OPCION_DE_MODIFICACION, SEPTIMA_OPCION_DE_MODIFICACION, OCTAVA_OPCION_DE_MODIFICACION,
            NOVENA_OPCION_DE_MODIFICACION, DECIMA_OPCION_DE_MODIFICACION };

    public void modificacion(Obras[] todasLasObras, int usuarioElijeObra) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el ID de la obra quieres modificar: ");
        usuarioElijeObra = sc.nextInt();
        int usuarioElijeQueModificar = 0;
        int nuevoDatoNumerico = 0;
        String nuevoDatoEscrito = null;
        nuevoDatoEscrito = sc.nextLine();

        // Éste for asegura que el id que has introducido sea el mismo que el que tiene
        // la obra que vas a modificar.
        for (int i = 0; i < todasLasObras.length; i++) {
            if (todasLasObras[i].getId() == usuarioElijeObra) {
                System.out.println("De las siguientes opciones:");

                // Éste for muestra un menú que indica las opciones de los datos que puedes
                // modificar.
                for (int n = 0; n < OPCIONES_DEL_DE_MODIFICACION.length; n++) {
                    System.out.println(OPCIONES_DEL_DE_MODIFICACION[n]);
                }

                System.out.println("¿Qué quieres modificar?: ");
                usuarioElijeQueModificar = sc.nextInt();

                // Éste switch realiza los cambios.
                switch (usuarioElijeQueModificar) {
                    case ID:
                        System.out.println("El ID actual es= " + todasLasObras[i].getId() + ", introduce el nuevo ID: ");
                        nuevoDatoNumerico = sc.nextInt();
                        todasLasObras[i].setId(nuevoDatoNumerico);
                        break;
                    case NOMBRE:
                        System.out.println(
                                "El Nombre actual es= " + todasLasObras[i].getNombre()
                                        + ", introduce un nuevo nombre para ésta obra: ");
                        nuevoDatoEscrito = sc.nextLine();
                        todasLasObras[i].setNombre(nuevoDatoEscrito);
                        break;
                    case AUTOR:
                        System.out.println(
                                "El Autor actual es= " + todasLasObras[i].getAutor() + ", introduce el nuevo autor: ");
                        nuevoDatoEscrito = sc.nextLine();
                        todasLasObras[i].setAutor(nuevoDatoEscrito);
                        break;
                    case TECNICA:
                        System.out.println(
                                "La Tecnica actual es= " + todasLasObras[i].getTecnica()
                                        + ", introduce una nueva tecnica: ");
                        nuevoDatoEscrito = sc.nextLine();
                        todasLasObras[i].setTecnica(nuevoDatoEscrito);
                        break;
                    case MATERIAL:
                        System.out.println(
                                "El material actual es= " + todasLasObras[i].getMaterial()
                                        + ", introduce el nuevo material: ");
                        nuevoDatoEscrito = sc.nextLine();
                        todasLasObras[i].setMaterial(nuevoDatoEscrito);
                        break;
                    case PRECIO:
                        System.out.println("El precio actual es= " + todasLasObras[i].getPrecio()
                                + ", introduce un nuevo precio base: ");
                        nuevoDatoNumerico = sc.nextInt();
                        todasLasObras[i].setPrecio(nuevoDatoNumerico);
                        break;
                    case ALTURA:
                        System.out.println("La actual es= " + todasLasObras[i].getAltura()
                                + ", introduce la altura que le corresponde a ésta obra: ");
                        nuevoDatoNumerico = sc.nextInt();
                        todasLasObras[i].setAltura(nuevoDatoNumerico);
                        break;
                    case PESO:
                        System.out.println("El peso actual es= " + todasLasObras[i].getPeso()
                                + ", introduce el peso real de ésta obra: ");
                        nuevoDatoNumerico = sc.nextInt();
                        todasLasObras[i].setPeso(nuevoDatoNumerico);
                        break;
                    case PIEZAS:
                        System.out.println("El número de piezas actual es= " + todasLasObras[i].getPiezas()
                                + ", introduce el nuevo número de piezas: ");
                        nuevoDatoNumerico = sc.nextInt();
                        todasLasObras[i].setPiezas(nuevoDatoNumerico);
                        break;
                    case DESCRIPCION:
                        System.out.println(
                                "La descripcion actual es= " + todasLasObras[i].getDescripcion()
                                        + ", introduce una nueva descripcion: ");
                        nuevoDatoEscrito = sc.nextLine();
                        todasLasObras[i].setDescripcion(nuevoDatoEscrito);
                        break;
                }//switch
            }//if
        }//for
    }//public void
}//fin de la clase
