import java.util.ArrayList;


public class Annuaire {

	private ArrayList<Contact> LesContacts;

	public Annuaire() {
		LesContacts = new ArrayList<Contact>(); 
	};
	
	// Ajout Contact
	public void AddContact(Contact UnContact){
		this.LesContacts.add(UnContact);
	}
	
	// Supprime Contact
	public void RemoveContact(Contact UnContact){
		this.LesContacts.remove(UnContact);
	}
	
	// Compte contacts
	private int getNombreContact(){
		return(this.LesContacts.size());
	}
	
	// Voir contacts
	public void presenter(){
		if(this.getNombreContact()==0){
			System.out.println("L'annuire ne contient aucun contact !");
		}
		else{
			for(int i = 0 ; i < this.LesContacts.size() ; i++){
				System.out.println("\n Je me présente : " + this.LesContacts.get(i).Affiche());
			}
			System.out.println("\n Il y a " + this.getNombreContact() + " contact(s)");
		}
	}
	
}
