public abstract class Composant {
    private Dossier parent = null;
    private String nom;

    public Composant(String nom){
        this.nom = nom;
    }
    public Composant(String nom, Dossier parent){
        this.setParent(parent);
        this.nom = nom;
    }


    public Dossier getParent(){
        return this.parent;
    }
    public void setParent(Dossier parent){
        this.parent = parent;
    }

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public abstract void afficher(int deep);
}
