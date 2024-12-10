public class ArticleElectromenager extends Article implements vendablePiece, solde {
    public int stock;

    public ArticleElectromenager(double pA, double pV, String n, String f) {
        super(pA, pV, n, f);
        stock = 0;
    }

    public double RemplirStock(double qte) {
        stock += qte;
        return prixAchat * qte;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Stock : " + stock + " unités.");
    }

    @Override
    public double vendre(int qte) {
        if (qte <= stock) {
            stock -= qte;
            return qte * prixVente;
        } else {
            System.out.println("Stock insuffisant pour " + qte + " unités.");
            return 0;
        }
    }

    @Override
    public void startSolde(double pourcentage) {
        prixVente -= prixVente * (pourcentage / 100);
    }

    @Override
    public void endSolde(double pourcentage) {
        prixVente += prixVente * (pourcentage / 100);
    }
}