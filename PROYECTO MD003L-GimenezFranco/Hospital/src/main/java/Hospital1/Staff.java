package Hospital1;

import Hospital1.FullName;
import Hospital1.Gender;
import Hospital1.Phone;
import Hospital1.Departament;
import Hospital1.Hospital;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author franc
 */
public  class Staff extends Person {
    private Date joined;
    private String education;
    private String certification;
    private String lenguages;
    private ArrayList<Departament> pertenece;

    public Staff(Date joined, String education, String certification, String lenguages, String title, 
            String givenName, String middleName, String familyName, String name, Date birthDate, int phone, 
            String gender, String homeaddress) {
        super(title, givenName, middleName, familyName, name, birthDate, phone, gender, homeaddress);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.lenguages = lenguages;
        
        System.out.println("\n Fecha en que se unio:"+this.joined+"\n Educacion: "+this.education+"\n Certificado: "+this.certification
        +"\n Lenguajes: "+this.lenguages);
}
}
    

