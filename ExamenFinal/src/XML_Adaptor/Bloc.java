//Simon Lafrenière
//LAFS05017508

package XML_Adaptor;

import java.util.ArrayList;
import java.util.List;

public class Bloc extends Balise implements IOperationsBalise {
    private List<Balise> Enfants;

    public Bloc(String nom) {
        super(nom);
        Enfants = new ArrayList<>();
    }


    @Override
    public String getXMLString() {
        String result = String.format("<%s", Nom);
        for (Attribut attribut : Attributs) {
            result += String.format(" %s", attribut.toString());
        }
        result += ">\n";
        for (Balise enfant : Enfants) {
            result += enfant.getXMLString();
        }
        result += String.format("</%s>\n", Nom);
        return result;
    }

    @Override
    public void addEnfant(Balise balise) {
        Enfants.add(balise);
    }

    @Override
    public void removeEnfant(Balise balise) {
        Enfants.remove(balise);
    }
}
