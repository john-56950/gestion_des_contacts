package gestion;

public class Repertoire {

	protected Contact[] lesContacts;
	protected int nbContact = 10;
	
	public Repertoire(){
		lesContacts = new Contact[nbContact];
	}
	
	public void ajouter(Contact cont){
		int i=0;
		for(Contact cont1:lesContacts){
			if(lesContacts[i]!=null){
				i++;
			}
			else{
				lesContacts[i]=cont;
				return;
			}
		}
	}
	
	public void supprimer(String nom, String prenom){
		int i=0;
		for(Contact c:lesContacts){
			if(lesContacts[i].getNom().equals(nom) && lesContacts[i].getPrenom().equals(prenom)){
				lesContacts[i] = null;
				return;
			}
			else{
				i++;
			}
		}
	}
	
	public void affiche1(String nom, String prenom){
		for(int i=0; i<lesContacts.length; i++){
			if(lesContacts[i] != null && lesContacts[i].getNom().equals(nom) && lesContacts[i].getPrenom().equals(prenom)){
				System.out.println("Nom: "+lesContacts[i].getNom()+" Prénom: "+lesContacts[i].getPrenom());
				System.out.println("Les coordonnées:");
				for(Coordonnees coord:lesContacts[i].getLesCoordonnees()){
					System.out.println(coord.getValue());
				}
			}
		}
	}
	
	public void affiche2(){
		for(int i=0; i<lesContacts.length; i++){
			if(lesContacts[i] != null && lesContacts[i].getLesCoordonnees()[i] instanceof Courriel){
				Courriel c = (Courriel) lesContacts[i].getLesCoordonnees()[i];
				if(c.getValue() != null){
					System.out.println("Nom: "+lesContacts[i].getNom()+" Prénom: "+lesContacts[i].getPrenom()+" "+c.getValue());
				}
			}
		}
	}
}
