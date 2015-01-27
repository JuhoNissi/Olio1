/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk;

/**
 *
 * @author h9321
 */
public class Worker {
    private String nimi;
    private String asema;
    private Double palkka;

    public Worker(String nimi, String asema, Double palkka) {
        this.nimi = nimi;
        this.asema = asema;
        this.palkka = palkka;
    }

    public String getNimi() {
        return nimi;
    }

    public String getAsema() {
        return asema;
    }

    public Double getPalkka() {
        return palkka;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setAsema(String asema) {
        this.asema = asema;
    }

    public void setPalkka(Double palkka) {
        this.palkka = palkka;
    }
    
    public String annaTiedot(){
        return this.nimi + " " + this.asema + " " + this.palkka + " ";
    }
}
