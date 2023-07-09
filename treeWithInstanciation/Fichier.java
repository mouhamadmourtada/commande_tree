
public class Fichier extends Composite{
    public Fichier(String nom){
        super(nom);
    }

    public void afficher(int deep){
        if(deep != 0){
            for (int i = 0; i < deep-1; i++) {
                
                System.out.print("\u2502");
                // 2502 c'est |
                System.out.print("   ");
            }
            
            System.out.print("\u251C");
            // 251C c'est |--
            System.out.print("\u2500\u2500\u2500");
        }
        System.out.println(nom);
    }
}