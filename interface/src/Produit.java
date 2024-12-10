public class Produit implements vendablePiece,solde{
        private double prixVente;
        private int stock;

    public Produit(double prixVente, int stock) {
            this.prixVente = prixVente;
            this.stock = stock;
        }

        @Override
        public double vendre(int qte) {
            if (qte <= stock) {
                stock -= qte;
                return qte * prixVente;
            } else {
                System.out.println("Stock insuffisant.");
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

