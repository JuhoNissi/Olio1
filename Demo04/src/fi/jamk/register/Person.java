/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.register;

/**
 *
 * @author h9321
 */
public class Person {
    private String Firstname;
    private String Surname;
    private String Social;

    public Person(String Firstname, String Surname, String Social) {
        this.Firstname = Firstname;
        this.Surname = Surname;
        this.Social = Social;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getSocial() {
        return Social;
    }

    public void setSocial(String Social) {
        this.Social = Social;
    }
    
    public String getInfo(){
        return this.Firstname + " " +this.Surname+" "+this.Social;
    }
}
