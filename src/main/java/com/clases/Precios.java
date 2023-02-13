package com.clases;

public class Precios {

    public void precio(Obras[] todasLasObras, int usuarioElijeObra) {

        double comision = (todasLasObras[usuarioElijeObra - 1].getPrecio() * 25) / 100;
        double importePorPeso = 20;
        double importePorAltura = 20;
        int importePorPiezas = 20;
        int numeroDePiezas = 0;
        double descuentoPorPictorica = 0;
        double descuentoPorSerEscultura = 0;
        int importePorSerEscultura = 0;
        // calcula los importes y descuentos
        for (int i = 0; i < todasLasObras.length; i++) {
            if (todasLasObras[i].getId() == usuarioElijeObra) {
                // importe por peso
                if (todasLasObras[i].getPeso() > 1) {
                    importePorPeso = 100;
                }
                // importe por altura
                if (todasLasObras[i].getAltura() > 2) {
                    importePorAltura = 100;
                }
                // importe por piezas
                if (todasLasObras[i].getPiezas() > 2) {
                    for (int n = 0; n < todasLasObras[i].getPiezas(); n++) {
                        numeroDePiezas++;
                    }
                    importePorPiezas = (numeroDePiezas - 2) * 100;
                }
                // descuento por técnica pictorica
                if (todasLasObras[i].getTecnica() != null
                        | todasLasObras[i].getTecnica() == "") {
                    descuentoPorPictorica = (todasLasObras[i].getPrecio() * 10) / 100;
                }
                // descuento por ser escultura
                if (todasLasObras[i].getMaterial() != null
                        | todasLasObras[i].getMaterial() == "") {
                    descuentoPorSerEscultura = (todasLasObras[i].getPrecio() * 20) / 100;
                }
                // importe por ser escultura
                if (todasLasObras[i].getMaterial() != null
                        | todasLasObras[i].getMaterial() == "") {
                    importePorSerEscultura = 50;
                }

                // calcula el precio

                double precioDeVenta = todasLasObras[i].getPrecio() + comision
                        + importePorPeso
                        + importePorAltura + importePorPiezas + importePorSerEscultura;

                double precioTotal = todasLasObras[i].getPrecio() + comision
                        + importePorPeso
                        + importePorAltura + importePorPiezas - descuentoPorPictorica
                        - descuentoPorSerEscultura + importePorSerEscultura;

                // Imprime el precio

                System.out.println("Nombre:" + todasLasObras[i].getNombre());
                System.out.println("Altura:" + todasLasObras[i].getAltura());
                System.out.println("Peso:" + todasLasObras[i].getPeso());
                System.out.println("Número de piezas:" + todasLasObras[i].getPiezas());
                System.out.println(
                        "Precio base:" + todasLasObras[i].getPrecio() + "euros");
                System.out.println("Comision de la galería:" + comision);
                System.out.println("Importe por peso:" + importePorPeso);
                System.out.println("Importe por altura:" + importePorAltura);
                for (int n = 3; n < todasLasObras[i].getPiezas() + 1; n++) {
                    System.out.println("Importe por pieza " + n + ": 100 euros");
                }
                System.out.println("Precio de venta:" + precioDeVenta + " euros");
                if (todasLasObras[i].getTecnica() != null
                        | todasLasObras[i].getTecnica() == "") {
                    System.out.println("Descuento por ser una obra con técnica  pictórica: "
                            + descuentoPorPictorica + " euros");
                }
                if (todasLasObras[i].getMaterial() != null
                        | todasLasObras[i].getMaterial() == "") {
                    System.out
                            .println("Descuento por ser escultura: " + descuentoPorSerEscultura + " euros");
                }
                if (todasLasObras[i].getMaterial() != null
                        | todasLasObras[i].getMaterial() == "") {
                    System.out.println("Importe por ser escultura: " + importePorSerEscultura + " euros");
                }
                if (descuentoPorPictorica == 0 & descuentoPorSerEscultura == 0) {
                    System.out.println("Ésta obra no tiene descuentos");
                }
                System.out.println("Ésta obra cuesta un total de : " + precioTotal + " euros");
            }
        }
    }
}
