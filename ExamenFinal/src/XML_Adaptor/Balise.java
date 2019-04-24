//Simon Lafrenière
//LAFS05017508

package XML_Adaptor;

import java.util.ArrayList;
import java.util.List;

public abstract class Balise {

    protected String Nom;
    protected List<Attribut> Attributs;

    public Balise(String nom) {
        Nom = nom;
        Attributs = new ArrayList<>();
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public List<Attribut> getAttributs() {
        return Attributs;
    }

    public void addAttribut(Attribut attribut) {
        Attributs.add(attribut);
    }

    public void RemoveAttribut(Attribut attribut) {
        Attributs.remove(attribut);
    }

    @Override
    public String toString() {
        return this.getXMLString();
    }

    public abstract String getXMLString();
}
