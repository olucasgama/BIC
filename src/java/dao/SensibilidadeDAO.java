/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author lucas
 */

public class SensibilidadeDAO {

    private static SensibilidadeDAO instancia = new SensibilidadeDAO();
    private String auxiliar = null;

    public static SensibilidadeDAO getInstancia() {
        return instancia;
    }
    
    public SensibilidadeDAO() {
    }

    public String calcula(String peso, Integer glicemia) {
       
        if ("magro".equals(peso)) {
            if (glicemia < 150) {
                auxiliar = "Insulino Sensível DDTI < 40U/dia = 0";
            } else {
                if (glicemia == 150 && glicemia <= 199) {
                    auxiliar = "Insulino Sensível DDTI < 40U/dia = 1";
                } else {
                    if (glicemia == 200 && glicemia <= 249) {
                        auxiliar = "Insulino Sensível DDTI < 40U/dia = 2";
                    } else {
                        if (glicemia == 250 && glicemia <= 299) {
                            auxiliar = "Insulino Sensível DDTI < 40U/dia = 3";
                        } else {
                            if (glicemia == 300 && glicemia <= 349) {
                                auxiliar = "Insulino Sensível DDTI < 40U/dia = 4";
                            } else {
                                if (glicemia == 350 && glicemia <= 399) {
                                    auxiliar = "Insulino Sensível DDTI < 40U/dia = 5";
                                } else {
                                    if (glicemia >= 400) {
                                        auxiliar = "Insulino Sensível DDTI < 40U/dia = 6";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if ("normal".equals(peso)) {
            if (glicemia < 150) {
                auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 0";
            } else {
                if (glicemia == 150 && glicemia <= 199) {
                    auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 1";
                } else {
                    if (glicemia == 200 && glicemia <= 249) {
                        auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 3";
                    } else {
                        if (glicemia == 250 && glicemia <= 299) {
                            auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 4";
                        } else {
                            if (glicemia == 300 && glicemia <= 349) {
                                auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 6";
                            } else {
                                if (glicemia == 350 && glicemia <= 399) {
                                    auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 8";
                                } else {
                                    if (glicemia >= 400) {
                                        auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 9";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else if ("obeso".equals(peso)) {
            if (glicemia < 150) {
                auxiliar = "Insulino Resistente DDTI > 80U/dia = 0";
            } else {
                if (glicemia == 150 && glicemia <= 199) {
                    auxiliar = "Insulino Resistente DDTI > 80U/dia = 2";
                } else {
                    if (glicemia == 200 && glicemia <= 249) {
                        auxiliar = "Insulino Resistente DDTI > 80U/dia = 4";
                    } else {
                        if (glicemia == 250 && glicemia <= 299) {
                            auxiliar = "Insulino Resistente DDTI > 80U/dia = 6";
                        } else {
                            if (glicemia == 300 && glicemia <= 349) {
                                auxiliar = "Insulino Resistente DDTI > 80U/dia = 8";
                            } else {
                                if (glicemia == 350 && glicemia <= 399) {
                                    auxiliar = "Insulino Resistente DDTI > 80U/dia = 10";
                                } else {
                                    if (glicemia >= 400) {
                                        auxiliar = "Insulino Resistente DDTI > 80U/dia = 12";
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return auxiliar;
    }
    
    public String mostra(){
        String resultado = auxiliar;
        return resultado;
    }

}
