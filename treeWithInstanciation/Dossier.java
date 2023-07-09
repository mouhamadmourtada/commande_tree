import java.util.ArrayList;
import java.util.List;

public class Dossier extends Composite {

    private List<Composite> contenu;

    public Dossier(String nom){
        super(nom);
        this.contenu=new ArrayList<Composite>(0);
    
    }

    
    public void afficher(int deep){
        if(deep != 0){
            for (int i = 0; i < deep-1; i++) {
                
                System.out.print("\u2502");
                // 2502 c'est |
                System.out.print("   ");
            }
          
            System.out.print("\u2514");
    
            System.out.print("\u2500\u2500\u2500");
        }
        System.out.println(nom);
        for (int i = 0; i < this.contenu.size(); i++) {
            this.contenu.get(i).afficher(deep + 1);      
        
        }
        
        
    }

    public void ajouter(Composite composite){
        this.contenu.add (composite);
    }

    public void enlever(Composite composite){
        this .contenu.remove(composite);

    }
}