public class TitreBoursier {
    private String Mnemonique;
    private String nom;
    private double valeur;
    private String Unitevaleur;

    public TitreBoursier(String Mnemonique, String nom, double valeur, String Unitevaleur) {
        this.Mnemonique = Mnemonique;
        this.nom = nom;
        this.valeur = valeur;
        this.Unitevaleur = Unitevaleur;
    }

    public String getMnemonique() {
        return Mnemonique;
    }

    public String getNom() {
        return nom;
    }

    public double getValeur() {
        return valeur;
    }

    public String getUnitevaleur() {
        return Unitevaleur;
    }
}
