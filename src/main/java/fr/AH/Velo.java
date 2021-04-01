package fr.AH;

public class Velo extends Vehicule {
    public String typeDeVelo;
    public int charge;
    String taille;

    public Velo(String marque, String couleur, int niveauEnergie, int niveauEnergieMax, String typeDeVelo, String taille) {
        super(marque, couleur, niveauEnergie, niveauEnergieMax);
        this.typeDeVelo = typeDeVelo;
        this.niveauEnergieMax= 10;
        this.taille = taille;
    }

}
