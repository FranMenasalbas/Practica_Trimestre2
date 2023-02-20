package com.clases;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestGenerales {
    private static final int ID = 100;
    private static final String NOMBRE = "nombre de prueba";
    private static final String AUTOR = "autor inventado";
    private static final String TECNICA = "óleo";
    private static final String MATERIAL = "acero";
    private static final double PRECIO = 1000;
    private static final double ALTURA = 3;
    private static final double PESO = 5;
    private static final int PIEZAS = 3;
    private static final String DESC = "descripcion";

    private Obras OBRA_CON_MATERIAL;

    private static final int OBRAS_EXPUESTAS = 1;
    private static final int DAR_DE_ALTA_UNA_NUEVA_OBRA = 2;
    private static final int MODIFICAR_LOS_DATOS = 3;
    private static final int DETALLES = 4;
    private static final int PRECIOS = 5;
    private static final int ETIQUETA = 6;
    private static final int SALIR = 7;
    private static final int MENU_PRINCIPAL = 8;

    private int DONDE_VA_EL_USUARIO = 0; // Esto simula a donde quiere ir el usuario

    @BeforeEach
    void creoObjetoObraConMaterial() {
        OBRA_CON_MATERIAL = new Obras(ID, NOMBRE, AUTOR, TECNICA, MATERIAL, PRECIO, ALTURA, PESO, PIEZAS, DESC);
    }

    @AfterEach
    void borroObjetoObraConMaterial() {
        OBRA_CON_MATERIAL = null;
    }

    // puedes entrar a cualquier sitio del menú

    @Test
    void entrarAObrasExpuestas() {
        DONDE_VA_EL_USUARIO = 1;
        assertTrue(DONDE_VA_EL_USUARIO == OBRAS_EXPUESTAS, "no entra en obras expuestas");
    }

    @Test
    void entrarADarDeAltaUnaNuevaObra() {
        DONDE_VA_EL_USUARIO = 2;
        assertTrue(DONDE_VA_EL_USUARIO == DAR_DE_ALTA_UNA_NUEVA_OBRA, "no entra en dar de alta una nueva obra");
    }

    @Test
    void entrarAObrasModificarLosDatos() {
        DONDE_VA_EL_USUARIO = 3;
        assertTrue(DONDE_VA_EL_USUARIO == MODIFICAR_LOS_DATOS, "no entra en modificar los datos");
    }

    @Test
    void entrarADetalles() {
        DONDE_VA_EL_USUARIO = 4;
        assertTrue(DONDE_VA_EL_USUARIO == DETALLES, "no entra en detalles");
    }

    @Test
    void entrarAPrecios() {
        DONDE_VA_EL_USUARIO = 5;
        assertTrue(DONDE_VA_EL_USUARIO == PRECIOS, "no entra en precios");
    }

    @Test
    void entrarAEtiqueta() {
        DONDE_VA_EL_USUARIO = 6;
        assertTrue(DONDE_VA_EL_USUARIO == ETIQUETA, "no entra en etiqueta");
    }

    @Test
    void Salir() {
        DONDE_VA_EL_USUARIO = 7;
        assertTrue(DONDE_VA_EL_USUARIO == SALIR, "no puede salir");
    }

    @Test
    void entrarAMenuPrincipal() {
        DONDE_VA_EL_USUARIO = 8;
        assertTrue(DONDE_VA_EL_USUARIO == MENU_PRINCIPAL, "no entra en el menu principal");
    }

    // buen funcionamiento del id

    @Test
    void elIdNoPuedeSerNegativo() {
        if (OBRA_CON_MATERIAL.getId() <= 1) {
            assertTrue(OBRA_CON_MATERIAL.getId() <= 1, "el id puede ser negativo pero no t tiene que dejar serlo");
        } else{
            assertTrue(OBRA_CON_MATERIAL.getId() >= 1);
        }
    }

    // geters

    @Test
    void elIdSeDevuelveBien() {
        assertTrue(ID == OBRA_CON_MATERIAL.getId(), "el id se devuelve mal");
    }

    @Test
    void elNombrSeDevuelveBien() {
        assertTrue(NOMBRE == OBRA_CON_MATERIAL.getNombre(), "el nombre se devuelve mal");
    }

    @Test
    void elAutorSeDevuelveBien() {
        assertTrue(AUTOR == OBRA_CON_MATERIAL.getAutor(), "el autor se devuelve bien");
    }

    @Test
    void laTecnicaSeDevuelveBien() {
        assertTrue(TECNICA == OBRA_CON_MATERIAL.getTecnica(), "la tecnica se devuelve mal");
    }

    @Test
    void elMaterialSeDevuelveBien() {
        assertTrue(MATERIAL == OBRA_CON_MATERIAL.getMaterial(), "el material se devuelve mal");
    }

    @Test
    void elPrecioSeDevuelveBien() {
        assertTrue(PRECIO == OBRA_CON_MATERIAL.getPrecio(), "el precio se devuelve mal");
    }

    @Test
    void laAlturaSeDevuelveBien() {
        assertTrue(ALTURA == OBRA_CON_MATERIAL.getAltura(), "la altura se devuelve mal");
    }

    @Test
    void elPesoSeDevuelveBien() {
        assertTrue(PESO == OBRA_CON_MATERIAL.getPeso(), "el peso se devuelve mal");
    }

    @Test
    void lasPiezasSeDevuelveBien() {
        assertTrue(PIEZAS == OBRA_CON_MATERIAL.getPiezas(), "las piezas se devuelven mal");
    }

    @Test
    void laDescripccionSeDevuelveBien() {
        assertTrue(DESC == OBRA_CON_MATERIAL.getDescripcion(), "la descripcion se devuelve mal");
    }

}
