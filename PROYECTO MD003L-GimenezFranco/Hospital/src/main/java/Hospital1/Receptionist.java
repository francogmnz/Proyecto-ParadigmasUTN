
package Hospital1;
import Ejecutable.ErrorObjeto;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author franc
 */
public class Receptionist extends FrontDeskStaff {
public static int iCount = 0;
    public Receptionist(Date joined, String education, String certification, String lenguages, String title, String givenName, 
            String middleName, String familyName, String name, Date birthDate, int phone, 
           String gender, String homeaddress) {
        super(joined, education, certification, lenguages, title, givenName, 
             middleName, familyName, name, birthDate, phone, gender, homeaddress);
    }
  
}
