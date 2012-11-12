package lesmedicament;

public class Hauptprgramme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Medicament m = new Antibiotique("Clamoxyl 500",4432,5910,"18/02/2010","thermophyle");
		Medicament m1=new Antibiotique("Augmentin",4433,7850,"14/11/2010","thermophyle");
		Medicament m2=new AntiInflammatoire("Maxilase",4434,3880,"28/04/2010","steroidien ",8);
		
		Medicament [] med=new Medicament[200];
		Pharmacie p = new Pharmacie(med);
		
		p.ajout(m);
		p.ajout(m1);
		p.ajout(m2);
		
		
		int x=p.recherche(10);
		System.out.println(x);
		System.out.println("");
		
	p.affiche("Antibiotique");
    p.affiche(" AntiInflammatoire");
    p.sup(4433);
    System.out.println("");
    
    p.affiche("Antibiotique");
    p.affiche(" AntiInflammatoire");
		
	}

}
