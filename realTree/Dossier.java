import java.util.ArrayList;
import java.util.List;

public class Dossier extends Composant{

    private List<Composant> sousComposants = null;


    public Dossier(String nom, Dossier parent ) {
        super(nom, parent);
        this.sousComposants = new ArrayList<Composant>(0);
    }

    public Dossier(String nom) {
        super(nom);
        this.sousComposants = new ArrayList<Composant>(0);

    }

    @Override
    public void afficher(int deep) {
        // for (int i = 0; i < deep; i++) {
        //     System.out.println("\u2502");
        //     // 2502 c'est |
        //     if(i == deep - 1){
        //         System.out.print("\u251C");
        //         // 251C c'est |--
                
        //     }else
        //         System.out.print("\u2514");
        //     // 2514 c'est |_
        //     System.out.print("\u2500\u2500\u2500");
        // }
        // System.out.println(this.getNom());
        for (int i = 0; i < deep-1; i++) {
            
            System.out.print("\u2502");
            // 2502 c'est |
            System.out.print("   ");
        }
        if(!(this.getParent() == null)){

            List<Composant> maListe = this.getParent().getSousComposants();
            int lastIndex = maListe.size() - 1;
            if(maListe.get(lastIndex).equals(this)){
                System.out.print("\u2514");
                // 2514 c'est |_
            }else
                System.out.print("\u251C");
            // 251C c'est |--

        }else{
            System.out.print("\u2514");

        }

        System.out.print("\u2500\u2500\u2500");
        System.out.println(this.getNom());
        for (int i = 0; i < this.sousComposants.size(); i++) {
            this.sousComposants.get(i).afficher(deep + 1);      
        
        }
        // for (Composant composant : this.sousComposants) {
        // }
    }


    public boolean ajouter(Composant toAdd){
        // faire une vérificatin d'abord sur les nom
        if(hasAsonWithName(toAdd)){
            System.out.println("Il y a déjà un composant de même nom");
            return false;
        }
        this.sousComposants.add(toAdd);
        toAdd.setParent(this);
        return true;
    }
    public void enlever(Composant toDelete){
        this.sousComposants.remove(toDelete);
    }

    private boolean hasAsonWithName(Composant toAdd){
        if(toAdd instanceof Dossier){
            for (Composant composant : this.sousComposants) {
                if (composant instanceof Dossier && composant.getNom().equals(toAdd.getNom())) {
                    return true;
                }
            }
        }else{
            for (Composant composant : this.sousComposants) {
                if (composant instanceof Fichier && composant.getNom().equals(toAdd.getNom())) {
                    return true;
                }
            }
        }

        return false;

    }
    
    public List<Composant> getSousComposants() {
        return this.sousComposants;
    }

}
