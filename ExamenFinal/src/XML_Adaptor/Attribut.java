package XML_Adaptor;

public class Attribut {
    private String Nom;
    private String Valeur;

    public Attribut(String nom, String valeur){
        Nom=nom;
        Valeur=valeur;
    }

    public String getNom(){
        return Nom;
    }

    public String getValeur(){
        return Valeur;
    }

    public void setValeur(String valeur){
        Valeur=valeur;
    }

    @Override
    public String toString(){
        return Nom+"=\""+Valeur+"\"";
    }
}
