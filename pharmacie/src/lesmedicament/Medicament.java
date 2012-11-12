package lesmedicament;

abstract public class Medicament {
protected String  libelle ;
protected int reference;
protected float prix;
protected String DateFabrication;

public Medicament() {};
public Medicament(String l,int r,float p,String d) {
	libelle=l;
	reference=r;
	prix=p;
	DateFabrication=d;}

public String toString(){
	return "le medicament a comme libelle :"+libelle+"  ,a comme reference: "+reference+" ,son prix est: "+prix+" et sa date de fabrciation:"+DateFabrication+" ";
}
abstract public float calculTaxeAppliquee();

}
