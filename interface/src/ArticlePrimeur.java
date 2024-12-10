public  class ArticlePrimeur extends Article implements vendablePiece {
    private double stock;


    public ArticlePrimeur(double pA, double pV, String n, String f) {
        super(pA, pV, n, f);
        this.stock = 0;
    }


    public double RemplirStock(double qte) {
        stock += qte;
        return prixAchat * qte;
    }


    @Override
    public void info() {
        super.info();
        System.out.println("Stock : " + stock + " kg.");
    }


    @Override
    public double vendre(int qte) {
        if (qte <= stock) {
            stock -= qte;
            return qte * prixVente;
        } else {
            System.out.println("Stock insuffisant pour " + qte + " kg.");
            return 0;
        }
    }
}






