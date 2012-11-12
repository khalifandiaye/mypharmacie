package lesmedicament;

public class Homeopatique extends Medicament {
	protected String  plante;
public Homeopatique(){
	super();
}

public Homeopatique(String l,int r,float p,String d,String pl){
	
	super(l,r,p,d);
	this.plante=pl;

}

public float calculTaxeAppliquee(){
	float p;
p=prix*(float)(0.15);
	return p;
	
}
public String toString(){
	return super.toString()+" plante:"+plante;
}

}
