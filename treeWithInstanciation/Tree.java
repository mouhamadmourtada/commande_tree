public class Tree {
    public static void main(String[] args){
     
        Dossier racine = new Dossier("racine");

        Dossier java = new Dossier("Java");
        Dossier se = new Dossier("SE");
        Dossier dataStructure = new Dossier("Structure de donnée");
        Dossier designPattern = new Dossier("design pattern");

        Dossier tp_java = new Dossier("TP java");
        Dossier td_java = new Dossier("TD java");
        java.ajouter(tp_java);
        java.ajouter(td_java);
        Fichier cJava= new Fichier("programmer en java.pdf");
        java.ajouter(cJava);
        Fichier jtp1 = new Fichier("tp1.docx");
        tp_java.ajouter(jtp1);
        Fichier jtp2 = new Fichier("tp2.pdf");
        tp_java.ajouter(jtp2);
        Fichier jtp3 = new Fichier("tp3.txt");
        tp_java.ajouter(jtp3);

        Fichier jtd1 = new Fichier("td1.docx");
        td_java.ajouter(jtd1);
        Fichier jtd2 = new Fichier("td2.pdf");
        td_java.ajouter(jtd2);
        Fichier jtd3 = new Fichier("td3.txt");
        td_java.ajouter(jtd3);


        Dossier tpDesignPattern = new Dossier("TP design pattern");
        Dossier tdDesignPattern = new Dossier("TD design pattern");
        designPattern.ajouter(tpDesignPattern);
        designPattern.ajouter(tdDesignPattern);
        Fichier cdesignPatter= new Fichier("Singleton");
        designPattern.ajouter(cdesignPatter);
        Fichier designPattertp1 = new Fichier("tp1.docx");
        tpDesignPattern.ajouter(designPattertp1);
        Fichier designPatternttp2 = new Fichier("tp2.pdf");
        tpDesignPattern.ajouter(designPatternttp2);
        Fichier designPatterntp3 = new Fichier("tp3.txt");
        tpDesignPattern.ajouter(designPatterntp3);


        Dossier tp_se = new Dossier("TP SE");
        Dossier td_se = new Dossier("TD SE");
        se.ajouter(tp_se);
        se.ajouter(td_se);
        Fichier cse1= new Fichier("processus.pdf");
        se.ajouter(cse1);
        Fichier cse2= new Fichier("ordonnancement.pdf");
        se.ajouter(cse2);
        Fichier setp1 = new Fichier("tp1.docx");
        tp_se.ajouter(setp1);
        Fichier setp2 = new Fichier("tp2.pdf");
        tp_se.ajouter(setp2);
        Fichier setp3 = new Fichier("tp3.txt");
        tp_se.ajouter(setp3);
        Fichier setd1 = new Fichier("td1.docx");
        td_se.ajouter(setd1);
        Fichier setd2 = new Fichier("td2.pdf");
        td_se.ajouter(setd2);
        Fichier setd3 = new Fichier("td3.txt");
        td_se.ajouter(setd3);
        

        Dossier tp_dataStructure = new Dossier("TP structure de donnée");
        Dossier td_dataStructure = new Dossier("TD structure de donnée");
        dataStructure.ajouter(tp_dataStructure);
        dataStructure.ajouter(td_dataStructure);
        Fichier cdataStructure1= new Fichier("TAD.pdf");
        dataStructure.ajouter(cdataStructure1);
        Fichier cdataStructure2= new Fichier("liste chainée.pdf");
        dataStructure.ajouter(cdataStructure2);
        Fichier dataStructuretp1 = new Fichier("tp1.docx");
        tp_dataStructure.ajouter(dataStructuretp1);
        Fichier dataStructuretp2 = new Fichier("tp2.pdf");
        tp_dataStructure.ajouter(dataStructuretp2);
        Fichier dataStructuretp3 = new Fichier("tp3.txt");
        tp_dataStructure.ajouter(dataStructuretp3);
        Fichier dataStructuretd1 = new Fichier("td1.docx");
        td_dataStructure.ajouter(dataStructuretd1);
        Fichier dataStructuretd2 = new Fichier("td2.pdf");
        td_dataStructure.ajouter(dataStructuretd2);
        Fichier dataStructuretd3 = new Fichier("td3.txt");
        td_dataStructure.ajouter(dataStructuretd3);
        

        racine.ajouter(dataStructure);
        racine.ajouter(java);
        racine.ajouter(se);
        racine.ajouter(designPattern);

        racine.afficher(0) ; 
    }
}