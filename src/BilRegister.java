import java.util.ArrayList;

public class BilRegister{

    private ArrayList<Bil> register;

    public BilRegister(){
        register = new ArrayList<>();
    } 

    public Bil hittaBil(String regNr){
        for (Bil bil: register) {
            if (bil.getRegistreringsnummer().equalsIgnoreCase(regNr)){
                return bil;
            }
        }
        return null;
    }

    public void läggTillBil(Bil bil){
        if (hittaBil(bil.getRegistreringsnummer())!= null) {
            throw new IllegalArgumentException("Bilen med registreringsnummer " + bil.getRegistreringsnummer() + " finns redan! Idiot");
        }
        register.add(bil);
    }

    public void taBortBil(String regNr){
        Bil bil = hittaBil(regNr);
        if (bil == null){
            throw new IllegalArgumentException("Bilen med registreringsnummer " + regNr + " finns inte dumbass");
        }
        register.remove(bil);
    }

    public String toString(){
        if (register.isEmpty()) {
            return "Det är ju fan tomt här inne i registret";
        }
            String resultat = "Här är bilarna i registret >:D \n";
            for(Bil bil: register){
                resultat += bil.toString() + "\n";
            }
            return resultat;
    }
}

