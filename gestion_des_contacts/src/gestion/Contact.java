package gestion;

import java.util.Scanner;

public class Contact extends Personne{
	
	public Coordonnees[] lesCoordonnees;
	public int nbCoordonnees = 3;
	
	public Contact(){
		super(null,null);
		lesCoordonnees = new Coordonnees[nbCoordonnees];
	}
	
	public Coordonnees[] getLesCoordonnees() {
		return lesCoordonnees;
	}

	public void setLesCoordonnees(Coordonnees[] lesCoordonnees) {
		this.lesCoordonnees = lesCoordonnees;
	}

	public int getNbCoordonnees() {
		return nbCoordonnees;
	}
	
	public void setNbCoordonnees(int nb) {
			this.nbCoordonnees = nb;
	}
	
	public void addTo(Coordonnees coord){
		int i=0;
		for(Coordonnees coord1:lesCoordonnees){
			if(lesCoordonnees[i] != null){
				i++;
			}
			else{
				lesCoordonnees[i]=coord;
				return;
			}
		}
	}
	
	public Boolean ajouter(Coordonnees coord){
		boolean flag = false;
		for(int i=0; i<lesCoordonnees.length; i++){
			if(lesCoordonnees[i].equals(coord) == true){
				flag = true;
			}
		}
		return flag;
	}
	
	public String toString(){
		return (""+lesCoordonnees);
	}
	
	public static void main(String[] args){
		
		System.out.println("Vos options sont: ");
		Command.allCommand();
		System.out.println("");
		
		Repertoire repertoire = new Repertoire();
		Contact contact = new Contact();
		AdrPostale adr = new AdrPostale();
		Courriel co = new Courriel();
		NumTel num = new NumTel();
		
		Scanner sc = new Scanner(System.in);
		boolean finish = false;
		
		while(finish!=true){
			System.out.println("Options:");
			Command cmd = Command.getCommand(sc.next());
			if(cmd == null){
				System.out.println("Erreur de saisie !");
			}
			else{
				switch(cmd){
				case AJOUTER:
					System.out.println("Nom ?");
					String nom = sc.next();
					contact.setNom(nom);
				
					System.out.println("Prénom ?");
					String prenom = sc.next();
					contact.setPrenom(prenom);
					
					System.out.println("Les coordonnées ?");
					System.out.println("email ?");
					String email = sc.next();
					co.setEmail(email);
					contact.addTo(co);
					
					System.out.println("n° de rue ?");
					String numero = sc.next();
					adr.setNumero(numero);
					
					System.out.println("la rue ?");
					String rue = sc.next();
					adr.setRue(rue);
			
					System.out.println("la ville ?");
					String ville = sc.next();
					adr.setVille(ville);
			
					System.out.println("le code postal ?");
					String codeP = sc.next();
					adr.setCodePostal(codeP);
			
					contact.addTo(adr);
			
					System.out.println("n°de téléphone ?");
					String numTel = sc.next();
					num.setNumero(numTel);
			
					System.out.println("l'indicatif de la ville ?");
					String iL = sc.next();
					num.setIndicatifLocal(iL);
			
					System.out.println("l'indicatif du pays ?");
					String iP = sc.next();
					num.setIndicatifPays(iP);
			
					contact.addTo(num);
					repertoire.ajouter(contact);
					finish=false;
					break;
				case SUPPRIMER:
					System.out.println("Nom ?");
					String nom1 = sc.next();
					
					System.out.println("Prénom ?");
					String prenom1 = sc.next();
			
					repertoire.supprimer(nom1, prenom1);
					finish=false;
					break;
				case REPERTOIRE:
					System.out.println("Répertoire :");
					repertoire.affiche2();
					finish=false;
					break;	
				case QUITTER:
					System.out.println("Au revoir !");
					finish = true;
					break;
				}
			}
		}
	}
}