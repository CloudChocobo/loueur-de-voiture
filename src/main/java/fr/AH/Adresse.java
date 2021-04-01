package fr.AH;

public class Adresse {
  public String rue;
  public int codePostal;
  public String ville;

  public Adresse(String rue, String ville, int codePostal) {
    this.rue = rue;
    this.ville = ville;
    this.codePostal=codePostal;
}
}