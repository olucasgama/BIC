/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

public class SensibilidadeDAO {

    private static SensibilidadeDAO instancia = new SensibilidadeDAO();
    private String auxiliar = null;

    public static SensibilidadeDAO getInstancia() {
        return instancia;
    }

    public SensibilidadeDAO() {
    }

}
