package Hospital1;
import Hospital1.FullName;
import Hospital1.Gender;
import Hospital1.Phone;
import Hospital1.Hospital;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author franc
 */
public abstract class Person {
    private String title;  
    private  String givenName;
    private  String middleName;
    private  String familyName; 
    public  String name; 
    private Date birthDate;
    private int phone;
    public  String gender;
    public  String homeaddress;
    private ArrayList<Hospital> hospital;

    public Person(String title, String givenName, String middleName, String familyName, String name, Date birthDate, 
            int phone, String gender, String homeaddress) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birthDate = birthDate;
        this.phone = phone;
        this.gender = gender;
        this.homeaddress = homeaddress;
    
        System.out.println("\n Titulo: " +this.title+ "\n  Primer nombre: " + this.givenName+ "\n Segundo Nombre: " +this.middleName+
                "\nApellido: " +this.familyName+ "\nNombre: "+this.name+"\nFecha cumpleaños: " +this.birthDate+
                "\nGenero: " +this.gender+"\nDomicilio: " +this.homeaddress+"\nCelular: " +this.phone);
        
    }
    
    public void setHospital(ArrayList hospital){
        this.hospital= hospital;
    }
}
    