package Hospital1;

import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author franc
 */
public class FrontDeskStaff extends AdministrativeStaff  {

    public FrontDeskStaff(Date joined, String education, String certification, String lenguages, String title, 
            String givenName, String middleName, String familyName, String name, Date birthDate, int phone, 
            String gender, String homeaddress) {
        super(joined, education, certification, lenguages, title, givenName, middleName, familyName, name, 
                birthDate, phone, gender, homeaddress);
   
        System.out.println("FrontDeskStaff");
    
    }    
}
