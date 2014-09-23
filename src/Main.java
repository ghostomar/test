public class Main {

	public static void main(String[] args) {
		//test github gui 4
		
		//Instanciation
		Annuaire MonAnnuaire = new Annuaire();
		
		Contact LeContact1 = new Contact("William", 3615);	
		Contact LeContact2 = new Contact("Omar", 1099);
		
		System.out.println(Contact.getCpt());

		/*
		MonAnnuaire.AddContact(LeContact1);
		MonAnnuaire.AddContact(LeContact2);
		
		MonAnnuaire.presenter();
		MonAnnuaire.RemoveContact(LeContact1);
		MonAnnuaire.presenter();
		 */

	}

}
