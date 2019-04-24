//Simon Lafrenière
//LAFS05017508

import XML_Adaptor.AdaptOiseauXML;
import pk_Oiseaux.clMesure;
import pk_Oiseaux.clOiseau;
import pk_Oiseaux.clPlage;
import pk_Oiseaux.clReleve;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        clOiseau objOiseau_A = new clOiseau("Grand Héron", "Ardea Jerodias",
                "Great blue heron", new clMesure(1.17, "m"),
                new ArrayList<String>() {{
                    add("Petits poissons");
                    add("Grenouille");
                    add("Oiseaux");
                    add("Insectes aquatiques");
                    add("Petits mammifères");
                }},
                new clPlage(3, 7),
                new ArrayList<String>() {{
                    add("Marais");
                    add("Marécages");
                    add("Rivières");
                    add("Rives de lacs");
                    add("Zones intertidales");
                    add("Mangroves");
                }},
                new ArrayList<clReleve>() {{
                    add(new clReleve("BBS", "Est", 2));
                    add(new clReleve("BBS", "Centre", 2));
                    add(new clReleve("CBC", "", 2));
                }});

        clOiseau objOiseau_B = new clOiseau("Pluvier Kildir", "Charadrius Vociferus",
                "Killdeer", new clMesure(25, "cm"),
                new ArrayList<String>() {{
                    add("Insectes");
                }},
                new clPlage(3, 4),
                new ArrayList<String>() {{
                    add("Terrains dégagés");
                    add("Milieux suburbains");
                    add("Milieux ruraux");
                }},
                new ArrayList<clReleve>() {{
                    add(new clReleve("BBS", "Est", 1));
                    add(new clReleve("BBS", "Centre", -1));
                    add(new clReleve("CBC", "", 0));
                }});

        clOiseau objOiseau_C = new clOiseau("Grand Pic", "Dryocopus pileatus",
                "Pleated woodpecker", new clMesure(18, "po"),
                new ArrayList<String>() {{
                    add("Fourmis charpentière");
                    add("Coléoptères");
                    add("Insectes");
                    add("Graines");
                    add("Fruits");
                }},
                new clPlage(3, 5),
                new ArrayList<String>() {{
                    add("Forêts à maturité");
                    add("Banlieues");
                }},
                new ArrayList<clReleve>() {{
                    add(new clReleve("BBS", "Est", 2));
                    add(new clReleve("BBS", "Centre", -1));
                    add(new clReleve("CBC", "", 1));
                }});

        System.out.println(AdaptOiseauXML.getXML(objOiseau_A));

    }

}
