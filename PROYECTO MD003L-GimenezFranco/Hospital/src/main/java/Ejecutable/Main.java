package Ejecutable;
import Hospital1.*;
import java.util.ArrayList;
import Hospital1.Person;
import java.util.Date;
import Hospital1.Staff;
import Hospital1.Hospital;

/**
 * @author franc
 */
public class Main {
    
 
    public static void main(String[] args) throws ErrorObjeto{
     
try{  //Crear hospitales pero solo se puede hasta 3 hospitales
    Hospital h1 = new Hospital("Hospital del carmen", "Godoy cruz", 31432451);
      System.out.println("-------------------------------");
    Hospital h2 = new Hospital("Español", "Godoy cruz", 43212451);
      System.out.println("-------------------------------");
    Hospital h3 = new Hospital("Central", "Ciudad", 123451);
      System.out.println("-------------------------------");
Hospital h4 = new Hospital("Hospital del carmen", "Godoy cruz", 432451);

} catch (ErrorObjeto e){ 
    System.out.println("Error:  "+ e.getMessage());
}
  
System.out.println("-------------------------------");
  Date aceppted = new Date ();
  Date birthDate = new Date (19, 04, 1999);
 //Crear Pacientes
  Patient p1= new Patient ("12AF", 40, aceppted, "Covid", "No contiene", "Mani", "Hacer reposo por dos dias", 
       "Adolescente", "Franco", "Jesus", "Gimenez", "Franco Jesus Gimenez", birthDate, 33513456, "Masculino", "Luja de cuyo 109");
  System.out.println("Paciente p1");
  System.out.println("-------------------------------");
  aceppted = new Date (30, 02, 2013);
  birthDate = new Date (02, 01, 2013);
  Patient p2 = new Patient ("103RE", 12, aceppted, "Varicela", "No contiene", "No contiene", "Tomar paracetamol por 12 dias", 
          "Niño", "Tomas", "Enzo", "Cervi","Tomas Enzo Cervi", birthDate, 34278953, "Masculino", "Godoy cruz");
    System.out.println("Paciente p2");
      System.out.println("-------------------------------");
    birthDate = new Date (03, 04, 1999);
    aceppted = new Date ();
  Patient p3 = new Patient ("FR21", 21, aceppted, "Cancer", "No contiene", "Abejas", "Reposo 24hs", "Adolescente", 
          "Anabella", "Giuliana", "Gimenez", "Anabella Giuliana Gimenez", birthDate, 26420413, "Femenino", "Ciudad");
   System.out.println("Paciente p3");
     System.out.println("-------------------------------");
// crear personas del Staff
  birthDate = new Date (20, 01, 2020);
Date joined = new Date (12, 12, 2021);
Staff s1 = new Staff (joined, "Universitario completo", "Cirujano", "Ingles", "Medico", "Franco", "Nicolas", "Suarez", 
        "Franco Nicolas Suarez", birthDate,45111, "Masculino", "Lujan de cuyo 109");
  System.out.println("Staff s1");
    System.out.println("-------------------------------");

birthDate = new Date (31, 06, 2001);
joined = new Date (21, 02, 2002);
Staff s2 = new Staff (joined, "Universitario completo", "Pediatra", "Frances e Ingles", 
        "Doctora", "Marcela", "Ana", "Ochoa", "Marcela Ana Ochoa", birthDate, 2031942, "Femenino", "Maipu");
  System.out.println("Staff s2");
    System.out.println("-------------------------------");

joined = new Date (25, 03, 2002);

Staff s3 = new Staff (joined, "Estudis completos", "Cirujano estetico", "Ingles y Aleman", "Cirujano Plastico", 
        "Federico", "Jorge", "Galdeano", "Federico Jorge Galdeano", birthDate, 3943104, "Masculino", "Ciudad");

  System.out.println("Staff s3");

}
 }

