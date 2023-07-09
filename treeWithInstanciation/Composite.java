public abstract class  Composite {
    protected String nom;
    public Composite ( String nom){
      this.nom = nom;
      
    }
    public abstract void afficher (int deep);
}