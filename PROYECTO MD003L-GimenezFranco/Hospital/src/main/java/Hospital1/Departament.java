/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hospital1;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Departament {
    public Hospital pertence ;
    public ArrayList<Staff> staff;

    public Departament(Hospital pertence, ArrayList<Staff> staff) {
        this.pertence = pertence;
        this.staff = new ArrayList<Staff>();
         System.out.println("Departament");
    }

 

    
}
