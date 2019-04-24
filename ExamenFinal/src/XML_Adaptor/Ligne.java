//Simon Lafrenière
//LAFS05017508

package XML_Adaptor;

public class Ligne extends Balise {
    private String Content;

    public Ligne(String nom) {
        super(nom);
    }

    @Override
    public String getXMLString() {
        String result = String.format("<%s", Nom);
        for (Attribut attribut : Attributs) {
            result += String.format(" %s", attribut.toString());
        }
        result += String.format(">%s</%s>\n", Content, Nom);
        return result;
    }

    public void setContent(String content) {
        Content = content;
    }

    public String getContent() {
        return Content;
    }

}
