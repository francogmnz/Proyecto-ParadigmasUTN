package Hospital1;

import Ejecutable.ErrorObjeto;
import static Hospital1.Receptionist.iCount;
import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Hospital {
    
    public static int iCount = 0;
    private String name;
    private String adress;
    private int phone; 
    private ArrayList<Person> person; //= new ArrayList<Person>();
    private ArrayList<Departament> departament;         
    
      public Hospital(String name, String adress, int phone) throws ErrorObjeto{ 
        if (iCount < 3) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
         System.out.println("Hospital");
         System.out.println("\n Nombre: "+this.name+"\n Direccion: "+this.adress+"\n Telefono: "+this.phone);
            iCount++;
        }else {
            throw new ErrorObjeto("ERROR en la clase: " + this.getClass().getName());
        }
    }
    
    
}
