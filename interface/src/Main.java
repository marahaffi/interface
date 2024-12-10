// Classe principale
public class Main {
    public static void main(String[] args) {
        Magasin CBA1 = new Magasin();

        // Initialisation des articles
        CBA1.Ae[0] = new ArticleElectromenager(27000, 35000, "télé", "Samsung");
        CBA1.Ae[1] = new ArticleElectromenager(5000, 15000, "radio", "Sony");
        CBA1.Ap[0] = new ArticlePrimeur(100, 200, "tomate", "Elore MgTsz");
        CBA1.Ap[1] = new ArticlePrimeur(50, 500, "tomate", "Avanti Sarl, Espagne");

        // Remplir le stock et calculer les dépenses
        for (int i = 0; i < CBA1.choixE; i++) {
            CBA1.Depense += CBA1.Ae[i].RemplirStock(50);
        }
        for (int i = 0; i < CBA1.choixP; i++) {
            CBA1.Depense += CBA1.Ap[i].RemplirStock(100);
        }

        // Afficher les informations
        CBA1.info();
    }
}


