package model;


public class Sensibilidade {
    
    private String peso;
    private Integer glicemia;

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
}
