import java.io.File;

public class Tree {
    public static void main(String[] args) {

        if(args.length != 1){
            System.out.println("pas d'arguments");
        }else{
            try {
                Composant arborescence = construireArborescence(args[0]);
                arborescence.afficher(0);
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }


    public static Composant construireArborescence(String cheminRacine) {
        File racine = new File(cheminRacine);
        if (!racine.exists() || !racine.isDirectory()) {
            throw new IllegalArgumentException("Jambaar ! Le chemin spécifié n'est pas un répertoire valide.");
        }

        return construireDossier(racine);
    }

    private static Dossier construireDossier(File dossier) {
        Dossier composantDossier = new Dossier(dossier.getName());

        File[] sousFichiers = dossier.listFiles();

        if (sousFichiers != null) {
            for (File sousFichier : sousFichiers) {
                if (sousFichier.isDirectory()) {
                    Dossier sousDossier = construireDossier(sousFichier);
                    composantDossier.ajouter(sousDossier);
                } else {
                    if(!sousFichier.isHidden()){
                        Fichier fichier = new Fichier(sousFichier.getName());
                        composantDossier.ajouter(fichier);
                    }
                }
            }
        }

        return composantDossier;
    }
}

 // Composant racine = new Dossier("racine");
        
        // Dossier dJava = new Dossier("java", (Dossier) racine);
        // Dossier dDataStructure = new Dossier("Structure de données", (Dossier) racine);
        // Dossier dDesignPattern = new Dossier("Design Pattern", (Dossier) racine);
        // Dossier dBaseTelecom = new Dossier("Base des télécommunications", (Dossier) racine);


        // Composant fnote = new Fichier("note.txt", (Dossier) racine);
        
        // Composant fcoursJava = new Fichier("java.pdf", (Dossier) dJava);
        // Composant teste = new Fichier("teste.txt", (Dossier) dJava);
        // Composant teste2 = new Fichier("teste.txt", (Dossier) dJava);

        // Composant fDataStructure = new Fichier("TAD.pdf");
        // fDataStructure.setParent((Dossier) dDataStructure);

        // Composant fse = new Fichier("processus.pdf", (Dossier) dBaseTelecom);

        // racine.afficher(0);
