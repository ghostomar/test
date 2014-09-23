
public class Contact {
	
	private String nom;
	private int num;
	private static int cpt;

	//Constructeur
	
	public Contact(String nom, int num) {
		this.nom = nom;
		this.num = num;
		this.cpt = cpt+1;
	}
	
	//Afficher la variable cpt
	//le nombre de contact créer
	public static int getCpt(){
		return cpt;
	}
	
	// Afficher numero
	private String getNom() {
		return nom;
	}
	
	// Modifier numero
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	// Afficher numero
	private int getNum() {
		return num;
	}
	
	// Modifier numero
	public void setNum(int num) {
		this.num = num;
	}
	
	// Affiche Contact
	public String Affiche()
	{
		return(this.getNom() + " " + this.getNum());
	}
}
