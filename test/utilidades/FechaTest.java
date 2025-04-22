package utilidades;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FechaTest {

    @org.junit.jupiter.api.Test
    void esValida() {
    }

    @org.junit.jupiter.api.Test
    void esBisiesto() {
        assertTrue(Fecha.esBisiesto(2004));
        assertTrue(Fecha.esBisiesto(2000));
        assertFalse(Fecha.esBisiesto(2025));
        assertFalse(Fecha.esBisiesto(2100));
    }

    @org.junit.jupiter.api.Test
    void diaDelAnio() {
        Fecha f1 = new Fecha(22,1,2025);
        assertEquals(22, f1.diaDelAnio());

        Fecha f2 = new Fecha(22,2,2025);
        assertEquals(53, f2.diaDelAnio());

        Fecha f3 = new Fecha(31,12,2025);
        assertEquals(365, f3.diaDelAnio());

        Fecha f4 = new Fecha(31,12,2024);
        assertEquals(366, f4.diaDelAnio());



    }

    @org.junit.jupiter.api.Test
    void diasEntreFechas() {
    }


    @Test
    void esPosterior() {
        Fecha fAnt = new Fecha(12,04,2023);
        Fecha fPosterior = new Fecha(7,05,2025);
        Fecha fIgual = new Fecha(12,04,2023);
        Fecha fMismoAnio = new Fecha(22,7,2023);

        assertTrue(fPosterior.esPosterior(fAnt));
        assertFalse(fAnt.esPosterior(fPosterior));
        assertFalse(fAnt.esPosterior(fIgual));
        assertTrue(fMismoAnio.esPosterior(fAnt));
    }
}