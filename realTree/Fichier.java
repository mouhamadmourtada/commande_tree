import java.util.List;

public class Fichier extends Composant{

    public Fichier(String nom, Dossier parent) {
        super(nom, parent);
    }

    public Fichier(String nom) {
        super(nom);
    }


    @Override
    public void afficher(int deep) {
        for (int i = 0; i < deep-1; i++) {
            
            System.out.print("\u2502");
            // 2502 c'est |
            System.out.print("   ");
        }
        
        List<Composant> maListe = this.getParent().getSousComposants();
        int lastIndex = maListe.size() - 1;
        if(maListe.get(lastIndex).equals(this)){
            System.out.print("\u2514");
            // 2514 c'est |_
        }else
            System.out.print("\u251C");
        // 251C c'est |--

        System.out.print("\u2500\u2500\u2500");
        System.out.println(this.getNom());
    }
    
}
