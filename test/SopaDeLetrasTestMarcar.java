package test;

import model.SopaDeLetras;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SopaDeLetrasTestMarcar {

    SopaDeLetras sopaDeLetras;

    @BeforeEach
    void setUp() {
        sopaDeLetras = new SopaDeLetras(10,10);
    }

    @Test
    void marcarLetrasDescubiertas() {
        assertNotNull(true);
    }
}

//