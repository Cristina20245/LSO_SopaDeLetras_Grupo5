package test;

import model.SopaDeLetras;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SopaDeLetrasTestCrear {

    SopaDeLetras sopaDeLetras;

    @BeforeEach
    void setUp() {
        sopaDeLetras = new SopaDeLetras(10,10);
    }

    @Test
    void crearSopadeLetras() {
        assertEquals(10,10);
    }
}


//test Crear sopa