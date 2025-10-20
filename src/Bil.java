// import java.security.PublicKey;

public class Bil {

    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    private int hastighet;

    public String getMärke() {
        return märke;
    }

    public String getModell() {
        return modell;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }

    public int getHastighet() {
        return hastighet;
    }

    public void setHastighet(int hastighet) {
        this.hastighet = hastighet;
    }

    public void ökaHastighet(int ökning){
        if (ökning <= 0){
            throw new IllegalArgumentException("Du kan inte öka hastighet som är 0 eller mindre än 0 lol :P");
        }
        else{
            hastighet += ökning;
        }

    }

    public void bromsa(int bromsa){
        if (bromsa <= 0 ){
            throw new IllegalArgumentException("Går inte att bromsa om du har mindre fart än 0 eller värdet 0 lol");
        }
        if (bromsa >= hastighet)
        hastighet = 0; 
        else {
            hastighet -= bromsa;
        }
    }

    public String toString() {
        return "Märke: " + märke + ", Modell: " + modell +  ", registreringsnummer" + registreringsnummer 
        + ", årsmodell" + årsmodell + ", hastighet:" + hastighet;
    }

    public Bil(String märke, String modell, String registreringsnummer, int årsmodell, int hastighet) {

        if (märke == null || märke.trim().isEmpty()) {
            throw new IllegalArgumentException("Märket är null");
        }

        if (modell == null || modell.trim().isEmpty()) {
            throw new IllegalArgumentException("modellen är null");
        }

        if (registreringsnummer == null || registreringsnummer.trim().isEmpty()) {
            throw new IllegalArgumentException("registreringsnummret är null");
        }

        if (årsmodell < 1860 || årsmodell > 2025) {
            throw new IllegalArgumentException("Årsmodellen existerar inte");
        }

        this.märke = märke;
        this.modell = modell;
        this.registreringsnummer = registreringsnummer;
        this.årsmodell = årsmodell;
        this.hastighet = hastighet;
    }

}