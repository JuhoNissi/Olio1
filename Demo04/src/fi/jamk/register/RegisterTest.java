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
public class RegisterTest {
    
    public static void main(String arg[]){
        Register People=new Register();
    
        Person h =new Person("Jack","Reacher","241278-109M");
        
        //lisätään henkilö People rekisteriin
        if(People.addPerson(h)){
            System.out.println("Added!");
        }else{
            System.out.println("Not Added!");
        }
        
        h=new Person("Maria","Alison","120645-756Y");
        if(People.addPerson(h)){
            System.out.println("Added!");
        }else{
            System.out.println("Not Added!");
        }
        
        System.out.println("Register inputs:");
        for(int i=0;i<People.getPersoncount();i++){
            h=People.getPerson(i);
            System.out.println(h.getInfo());
        }
        
        String Social="161155-222k";
        System.out.println("Looking for Person with Social: " + Social);
        h=People.findPerson(Social);
        if(h!=null)System.out.println(h.getInfo());
        else System.out.println("Person cannot found!");
    }
    
}
