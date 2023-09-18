package Hospital1;
import Hospital1.FullName;
import Hospital1.Gender;
import Hospital1.Phone;
import Hospital1.Hospital;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.lang.Integer;
/**
 *
 * @author franc
 */
public class Patient extends Person{
    private String id;
    private Integer age;
    private Date aceppted;
    private String sickness;
    private String prescriptions;
    private String allergies;
    private String specialReqs;
   
    /*public Patient(String id, Integer age, Date aceppted, String sickness, String prescriptions, String allergies, 
      //      String specialReqs, String title, String givenName, String middleName, String familyName, String name, 
           Date birthDate, int phone, String gender, String homeaddress) {
        
        this.id = id;
        this.age = age;
        this.aceppted = aceppted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
        super(title, givenName, middleName, familyName, name, birthDate, phone, gender, homeaddress);
    
       System.out.println("\n id:"+this.id +"\n Edad: "+this.age +"\n Fecha de ingreso: "+this.aceppted+
               "\n prescriptions: "+this.prescriptions+"\n Alergias: "+this.allergies+"\n Requirimientos: "+this.specialReqs);
        System.out.println("Patient");
        
}*/

    public Patient(String id, Integer age, Date aceppted, String sickness, String prescriptions, String allergies, String specialReqs, 
            String title, String givenName, String middleName, String familyName, String name, Date birthDate, int phone, 
            String gender, String homeaddress) {
        super(title, givenName, middleName, familyName, name, birthDate, phone, gender, homeaddress);
        this.id = id;
        this.age = age;
        this.aceppted = aceppted;
        this.sickness = sickness;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
        System.out.println("\n id:"+this.id +"\n Edad: "+this.age +"\n Fecha de ingreso: "+this.aceppted+
        "\n Prescripciones: "+this.prescriptions+"\n Alergias: "+this.allergies+"\n Requirimientos: "+this.specialReqs); //Imprime por pantalla
    }
    
}
