package pk_Oiseaux;

public class clPlage {
    private int valeur_inf, valeur_sup;

    public clPlage(int valeur_inf, int valeur_sup) {
        this.valeur_inf = valeur_inf;
        this.valeur_sup = valeur_sup;
    }

    public int getValeur_inf() {
        return valeur_inf;
    }

    public void setValeur_inf(int valeur_inf) {
        this.valeur_inf = valeur_inf;
    }

    public int getValeur_sup() {
        return valeur_sup;
    }

    public void setValeur_sup(int valeur_sup) {
        this.valeur_sup = valeur_sup;
    }
}
