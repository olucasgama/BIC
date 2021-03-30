package model;

public class Sensibilidade {

    private String peso;
    private Integer glicemia;
    private static String auxiliar = null;

    public Sensibilidade() {
    }

    public Sensibilidade(String peso, Integer glicemia) {
        this.peso = peso;
        this.glicemia = glicemia;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Integer getGlicemia() {
        return glicemia;
    }

    public void setGlicemia(Integer glicemia) {
        this.glicemia = glicemia;
    }

    public static String calcula(String peso, Integer glicemia) {

        if ("magro".equals(peso)) {
            if (glicemia < 150) {
                auxiliar = "Insulino Sensível DDTI < 40U/dia = 0";
            } else {
                if (glicemia < 200) {
                    auxiliar = "Insulino Sensível DDTI < 40U/dia = 1";
                } else {
                    if (glicemia < 250) {
                        auxiliar = "Insulino Sensível DDTI < 40U/dia = 2";
                    } else {
                        if (glicemia < 300) {
                            auxiliar = "Insulino Sensível DDTI < 40U/dia = 3";
                        } else {
                            if (glicemia < 350) {
                                auxiliar = "Insulino Sensível DDTI < 40U/dia = 4";
                            } else {
                                if (glicemia < 400) {
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
                if (glicemia < 200) {
                    auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 1";
                } else {
                    if (glicemia < 250) {
                        auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 3";
                    } else {
                        if (glicemia < 300) {
                            auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 4";
                        } else {
                            if (glicemia < 350) {
                                auxiliar = "Intermediário DDTI entre 40U/dia e 80U/dia = 6";
                            } else {
                                if (glicemia < 400) {
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
                if (glicemia < 200) {
                    auxiliar = "Insulino Resistente DDTI > 80U/dia = 2";
                } else {
                    if (glicemia < 250) {
                        auxiliar = "Insulino Resistente DDTI > 80U/dia = 4";
                    } else {
                        if (glicemia < 300) {
                            auxiliar = "Insulino Resistente DDTI > 80U/dia = 6";
                        } else {
                            if (glicemia < 350) {
                                auxiliar = "Insulino Resistente DDTI > 80U/dia = 8";
                            } else {
                                if (glicemia < 400) {
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

    public static String mostra() {
        String resultado = auxiliar;
        return resultado;
    }
}
