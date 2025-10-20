// import java.time.LocalDate;
// import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BilRegister register = new BilRegister();
        Bil Theodors_vackraBil = new Bil("Porsche", "9/11 (arab edition)", "ABC 911", 2001, 0);
        Bil Vincents_snyggareBil = new Bil("Lamborghini", "Aventador", "ABC123", 2000, 0);


        register.läggTillBil(Theodors_vackraBil);
        register.läggTillBil(Vincents_snyggareBil);

        System.out.println(register);
        register.taBortBil("ABC123");
        System.out.println("\nEfter borttagning:");
        System.out.println(register);
    }
}
