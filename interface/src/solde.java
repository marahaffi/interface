public interface solde {
    /**
     * Démarre une période de solde en appliquant un pourcentage de réduction.
     *
     * @param pourcentage Le pourcentage de réduction appliqué.
     */
    void startSolde(double pourcentage);

    /**
     * Termine une période de solde en annulant le pourcentage de réduction.
     *
     * @param pourcentage Le pourcentage de réduction à annuler.
     */
    void endSolde(double pourcentage);
}

