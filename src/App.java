// import java.time.LocalDate;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BilRegister register = new BilRegister();
        Bil Theodors_vackraBil = new Bil("Porsche", "9/11 (arab edition)", "ABC911", 2001, 0);
        Bil Vincents_snyggareBil = new Bil("Lamborghini", "Aventador", "ABC123", 2000, 0);
        Bil Johan_SnyggasteBil = new Bil("Volvo", "Sport P1900", "JHN356", 1956, 0);

        register.läggTillBil(Theodors_vackraBil);
        register.läggTillBil(Vincents_snyggareBil);
        register.läggTillBil(Johan_SnyggasteBil);

        System.out.println("Alla bilar i registret:");
        System.out.println(register);


        register.taBortBil("ABC911");
        System.out.println("\nEfter borttagning:");
        System.out.println(register);

        try{
            Bil kopia = new Bil("Saab", "95", "ABC999", 1990, 0 );
            register.läggTillBil(kopia);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Något gick fel, dvs alltså detta: " + e.getMessage());
        }
        
    }
}
