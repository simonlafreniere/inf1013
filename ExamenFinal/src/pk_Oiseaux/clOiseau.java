package pk_Oiseaux;

import java.util.ArrayList;

public class clOiseau {
    private String nom, latin, anglais;
    private clMesure taille;
    private ArrayList<String> alimentation;
    private clPlage oeufs;
    private ArrayList<String> habitat;
    private ArrayList<clReleve> protection;

    public clOiseau(String nom, String latin, String anglais, clMesure taille, ArrayList<String> alimentation,
                    clPlage oeufs, ArrayList<String> habitat, ArrayList<clReleve> protection) {
        this.nom = nom;
        this.latin = latin;
        this.anglais = anglais;
        this.taille = taille;
        this.alimentation = alimentation;
        this.oeufs = oeufs;
        this.habitat = habitat;
        this.protection = protection;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getAnglais() {
        return anglais;
    }

    public void setAnglais(String anglais) {
        this.anglais = anglais;
    }

    public clMesure getTaille() {
        return taille;
    }

    public void setTaille(clMesure taille) {
        this.taille = taille;
    }

    public ArrayList<String> getAlimentation() {
        return alimentation;
    }

    public void setAlimentation(ArrayList<String> alimentation) {
        this.alimentation = alimentation;
    }

    public clPlage getOeufs() {
        return oeufs;
    }

    public void setOeufs(clPlage oeufs) {
        this.oeufs = oeufs;
    }

    public ArrayList<String> getHabitat() {
        return habitat;
    }

    public void setHabitat(ArrayList<String> habitat) {
        this.habitat = habitat;
    }

    public ArrayList<clReleve> getProtection() {
        return protection;
    }

    public void setProtection(ArrayList<clReleve> protection) {
        this.protection = protection;
    }
}
