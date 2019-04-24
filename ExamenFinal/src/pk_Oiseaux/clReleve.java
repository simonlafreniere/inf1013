package pk_Oiseaux;

public class clReleve {
    private String nom, region;
    private int etat; // -2 Diminution importante, -1 Diminution mineure,
    // 0 Stable, 1 Augmentation mineure, 2, Augmentation importante


    public clReleve(String nom, String region, int etat) {
        this.nom = nom;
        this.region = region;
        this.etat = etat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
