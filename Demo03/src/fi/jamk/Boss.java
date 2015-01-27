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
public class Boss extends Worker {
    private String auto;
    private Double bonus;

    public Boss(String auto, Double bonus, String nimi, String asema, Double palkka) {
        super(nimi, asema, palkka);
        this.auto = auto;
        this.bonus = bonus;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    
    public String annaTiedot(){
        return super.annaTiedot() + " " + this.auto + " " + this.bonus + " ";
    }
}
