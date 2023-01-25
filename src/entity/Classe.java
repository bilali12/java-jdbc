package entity;

public class Classe {
    private int id;
    private String nom;
    private int effectif;

    public Classe() {
    }

    public Classe(int id, String nom, int effectif) {
        this.id = id;
        this.nom = nom;
        this.effectif = effectif;
    }

    public Classe(String nom, int effectif) {
        this.nom = nom;
        this.effectif = effectif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEffectif() {
        return effectif;
    }

    public void setEffectif(int effectif) {
        this.effectif = effectif;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "nom='" + nom + '\'' +
                ", effectif=" + effectif +
                '}';
    }
}
