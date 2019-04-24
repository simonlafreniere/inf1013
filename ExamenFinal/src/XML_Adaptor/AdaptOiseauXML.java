//Simon Lafrenière
//LAFS05017508

package XML_Adaptor;

import pk_Oiseaux.clOiseau;
import pk_Oiseaux.clReleve;

public class AdaptOiseauXML {
    public static String getXML(clOiseau oiseau) {
        Bloc rootBloc = new Bloc("Root");
        Bloc mainBloc = new Bloc("Oiseau");
        if (!oiseau.getNom().equals("")) {
            mainBloc.addEnfant(new Ligne(oiseau.getNom()));
        }
        if (!oiseau.getLatin().equals("")) {
            Ligne latin = new Ligne("Latin");
            latin.setContent(oiseau.getLatin());
            mainBloc.addEnfant(latin);
        }
        if (!oiseau.getAnglais().equals("")) {
            Ligne anglais = new Ligne("Anglais");
            anglais.setContent(oiseau.getAnglais());
            mainBloc.addEnfant(anglais);
        }
        if (oiseau.getTaille() != null) {
            Ligne taille = new Ligne("Taille");
            Attribut unite = new Attribut("unite", oiseau.getTaille().getUnite());
            taille.addAttribut(unite);
            taille.setContent(Double.toString(oiseau.getTaille().getValeur()));
            mainBloc.addEnfant(taille);
        }
        if (!oiseau.getAlimentation().isEmpty()) {
            Bloc alimentation = new Bloc("Alimentation");
            for (String aliment : oiseau.getAlimentation()) {
                Ligne Aliment = new Ligne("Aliment");
                Aliment.setContent(aliment);
                alimentation.addEnfant(Aliment);
            }
            mainBloc.addEnfant(alimentation);
        }
        if (oiseau.getOeufs() != null) {
            Ligne oeuf = new Ligne("Oeufs");
            String content = String.format("%s..%s", Integer.toString(oiseau.getOeufs().getValeur_inf()), Integer.toString(oiseau.getOeufs().getValeur_sup()));
            oeuf.setContent(content);
        }
        if (!oiseau.getHabitat().isEmpty()) {
            Bloc habitat = new Bloc("Habitat");
            for (String zone : oiseau.getHabitat()) {
                Ligne Zone = new Ligne("Zone");
                Zone.setContent(zone);
                habitat.addEnfant(Zone);
            }
            mainBloc.addEnfant(habitat);
        }
        if (!oiseau.getProtection().isEmpty()) {
            Bloc protection = new Bloc("Protection");
            Bloc Releves = new Bloc("Releves");
            for (clReleve releve : oiseau.getProtection()) {
                Bloc uneProtection = new Bloc("Releve");
                Ligne titre = new Ligne("Titre");
                Attribut letitre = new Attribut("region", releve.getRegion());
                titre.addAttribut(letitre);
                titre.setContent(releve.getNom());
                uneProtection.addEnfant(titre);

                String etatStr = "";
                switch (releve.getEtat()) {
                    case -2:
                        etatStr = "Diminution importante";
                        break;
                    case -1:
                        etatStr = "Diminution mineure";
                        break;
                    case 0:
                        etatStr = "Stable";
                        break;
                    case 1:
                        etatStr = "Augmentation mineure";
                        break;
                    case 2:
                        etatStr = "Augmentation importante";
                }
                Ligne etat = new Ligne("Etat");
                etat.setContent(etatStr);
                uneProtection.addEnfant(etat);

                Releves.addEnfant(uneProtection);
            }

            protection.addEnfant(Releves);
            mainBloc.addEnfant(protection);
        }


        rootBloc.addEnfant(mainBloc);

        return "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" + rootBloc.getXMLString();
    }
}
