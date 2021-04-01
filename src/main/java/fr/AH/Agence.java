package fr.AH;

import java.util.ArrayList;


public class Agence {
    
    static Agence agenceNantes;
    static Agence agenceRennes;
    static Agence agenceBrest;
    
  public String nom;  
  public String nomCommercial;
  public Adresse adresse;
  ArrayList<Vehicule>stockDeVehicules;

  public Agence(String nom, String nomCommercial) {
      this.nom = nom;
      this.nomCommercial = nomCommercial;
      this.stockDeVehicules = new ArrayList<Vehicule>();
  }

 void ajouterAdresse(Adresse adresse){
this.adresse =adresse;
 } 
void ajouterClient(Client client){
    this.ajouterClient(client);
}
void ajouterVehicule(Vehicule vehicule){
this.stockDeVehicules.add(vehicule);
}

void afficherStock(){
    System.out.println("Stock");
    for (Vehicule vehicule : stockDeVehicules)
    {System.out.println(vehicule);
    vehicule.disponible = true;
    }
}

public String toString() {
    return "agence:" + this.nom + "-" + this.nomCommercial + " - " + this.adresse.ville;
}

static void creerAgenceNantes(){
    Adresse adresseNantes = new Adresse("rue des ânes", "Nantes", 44000);
     Agence agenceNantes = new Agence("Agence de Nantes", "Roger");
     agenceNantes.ajouterAdresse(adresseNantes);
     
     

     Voiture voitPetitPrix = new Voiture("citroën", "grise", 4, 100, "ess", 100, 5);
     Voiture voitureChere = new Voiture("ford", "vert", 4, 100, "ess", 100, 5);
     agenceNantes.ajouterVehicule(voitPetitPrix);
     agenceNantes.ajouterVehicule(voitureChere);
     // System.out.println(voitPetitPrix);


     agenceNantes.afficherStock(); 
    


}

static void creerAgenceRennes(){
    
     Adresse adresseRennes = new Adresse("rue du caribou", "Rennes", 35000);
     Agence agenceRennes = new Agence("Agence de Rennes", "Père Nöel");
     agenceRennes.ajouterAdresse(adresseRennes);
     
    Client client = new Client("Mamie Nova", 8);
     Voiture voitPetitPrix = new Voiture("peugeot", "bleu", 4, 100, "ess", 100, 5);
     Voiture voitureChere = new Voiture("audi", "noir", 4, 100, "ess", 100, 5);
     Velo veloElectrique =new Velo("decathlon", "noir", 3, 10, "vtv", "adulte");
     agenceRennes.ajouterVehicule(voitPetitPrix);
     agenceRennes.ajouterVehicule(voitureChere);
     agenceRennes.ajouterVehicule(veloElectrique);
     agenceRennes.ajouterClient(client);
     // System.out.println(voitPetitPrix);


     agenceRennes.afficherStock(); 
    




}


static void creerAgenceBrest(){
    
    Adresse adresseBrest = new Adresse("rue des braises", "Brest", 29000);
    Agence agenceBrest = new Agence("Agence de Brest", "Rammstein");
    agenceBrest.ajouterAdresse(adresseBrest);
    

    Voiture voitPetitPrix = new Voiture("ford", "violet", 4, 100, "ess", 100, 5);
    Voiture voitureChere = new Voiture("cooper", "rouge", 4, 100, "ess", 100, 5);
    Velo veloElectrique =new Velo("chameau", "camel", 3, 10, "vtt", "adulte");
    agenceBrest.ajouterVehicule(voitPetitPrix);
    agenceBrest.ajouterVehicule(voitureChere);
    agenceBrest.ajouterVehicule(veloElectrique);
    // System.out.println(voitPetitPrix);


    agenceBrest.afficherStock(); 

}
     static void reserverPremierVehicule(Client client) {
        Vehicule voiture = agenceNantes.stockDeVehicules.get(0);
        client.reservation = voiture;
        voiture.disponible = false;
        agenceNantes.afficherStock();  
}

}      



