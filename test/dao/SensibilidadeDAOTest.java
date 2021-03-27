/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import junit.framework.TestCase;


public class SensibilidadeDAOTest extends TestCase {

    SensibilidadeDAO exemp;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        exemp = new SensibilidadeDAO();
    }

    public void testeSensibilidade_magro_0() {
        assertEquals(exemp.calcula("magro", 149), "Insulino Sensível DDTI < 40U/dia = 0");
    }

    public void testeSensibilidade_magro_1() {
        assertEquals(exemp.calcula("magro", 199), "Insulino Sensível DDTI < 40U/dia = 1");
    }

    public void testeSensibilidade_magro_2() {
        assertEquals(exemp.calcula("magro", 249), "Insulino Sensível DDTI < 40U/dia = 2");
    }

    public void testeSensibilidade_magro_3() {
        assertEquals(exemp.calcula("magro", 299), "Insulino Sensível DDTI < 40U/dia = 3");
    }

    public void testeSensibilidade_magro_4() {
        assertEquals(exemp.calcula("magro", 349), "Insulino Sensível DDTI < 40U/dia = 4");
    }

    public void testeSensibilidade_magro_5() {
        assertEquals(exemp.calcula("magro", 399), "Insulino Sensível DDTI < 40U/dia = 5");
    }

    public void testeSensibilidade_magro_6() {
        assertEquals(exemp.calcula("magro", 400), "Insulino Sensível DDTI < 40U/dia = 6");
    }

    public void testeSensibilidade_normal_0() {
        assertEquals(exemp.calcula("normal", 149), "Intermediário DDTI entre 40U/dia e 80U/dia = 0");
    }

    public void testeSensibilidade_normal_1() {
        assertEquals(exemp.calcula("normal", 199), "Intermediário DDTI entre 40U/dia e 80U/dia = 1");
    }

    public void testeSensibilidade_normal_3() {
        assertEquals(exemp.calcula("normal", 249), "Intermediário DDTI entre 40U/dia e 80U/dia = 3");
    }

    public void testeSensibilidade_normal_4() {
        assertEquals(exemp.calcula("normal", 299), "Intermediário DDTI entre 40U/dia e 80U/dia = 4");
    }

    public void testeSensibilidade_normal_6() {
        assertEquals(exemp.calcula("normal", 349), "Intermediário DDTI entre 40U/dia e 80U/dia = 6");
    }

    public void testeSensibilidade_normal_8() {
        assertEquals(exemp.calcula("normal", 399), "Intermediário DDTI entre 40U/dia e 80U/dia = 8");
    }

    public void testeSensibilidade_normal_9() {
        assertEquals(exemp.calcula("normal", 400), "Intermediário DDTI entre 40U/dia e 80U/dia = 9");
    }

    public void testeSensibilidade_obeso_0() {
        assertEquals(exemp.calcula("obeso", 149), "Insulino Resistente DDTI > 80U/dia = 0");
    }

    public void testeSensibilidade_obeso_2() {
        assertEquals(exemp.calcula("obeso", 199), "Insulino Resistente DDTI > 80U/dia = 2");
    }

    public void testeSensibilidade_obeso_4() {
        assertEquals(exemp.calcula("obeso", 249), "Insulino Resistente DDTI > 80U/dia = 4");
    }

    public void testeSensibilidade_obeso_6() {
        assertEquals(exemp.calcula("obeso", 299), "Insulino Resistente DDTI > 80U/dia = 6");
    }

    public void testeSensibilidade_obeso_8() {
        assertEquals(exemp.calcula("obeso", 349), "Insulino Resistente DDTI > 80U/dia = 8");
    }

    public void testeSensibilidade_obeso_10() {
        assertEquals(exemp.calcula("obeso", 399), "Insulino Resistente DDTI > 80U/dia = 10");
    }

    public void testeSensibilidade_obeso_12() {
        assertEquals(exemp.calcula("obeso", 400), "Insulino Resistente DDTI > 80U/dia = 12");
    }
}
