package pk_Oiseaux;

public class clMesure {
    private double valeur;
    private String unite;

    public clMesure(double valeur, String unite) {
        this.valeur = valeur;
        this.unite = unite;
    }

    public double getValeur() {
        return valeur;
    }

    public void setValeur(double valeur) {
        this.valeur = valeur;
    }

    public String getUnite() {
        return unite;
    }

    public void setUnite(String unite) {
        this.unite = unite;
    }
}
