/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fi.jamk.register;

import java.util.ArrayList;

/**
 *
 * @author h9321
 */
public class Register {
    private final ArrayList<Person> Persons;
    
    public Register(){
        this.Persons=new ArrayList<>();
    }
    
    public int getPersoncount(){
        return this.Persons.size();
    }
    
    public boolean addPerson(Person h){
        return this.Persons.add(h);
    }
    
    public Person getPerson(int index){
        if(index<getPersoncount())
            return this.Persons.get(index);
        else return null;
    }
    
    public Person findPerson(String Social){
        for(Person h:this.Persons){
            if(Social.equalsIgnoreCase(h.getSocial()))
                return h;
        }
        //sotua vastaavaa henkilöä ei löydy arraylistasta
        return null;
    }
}
