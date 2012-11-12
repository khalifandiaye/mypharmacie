package lesmedicament;

public class AntiInflammatoire extends Medicament {
	protected String molcule  ;
	protected int acidite ;

public AntiInflammatoire(){
super();
}
public AntiInflammatoire(String l,int r,float p,String d,String m,int a){
	super(l,r,p,d);
	this.molcule=m;
	this.acidite=a;
}
public float calculTaxeAppliquee() {
	
	float p;
	if(this.molcule == "st�ro�dien")
		p=prix*(float)(0.10);
	else
		p=prix*(float)(0.15);
	return p;
	
}
public String toString(){
	return super.toString()+"  molcule: "+molcule+" acidite  :"+acidite+" "+"le tax : "+calculTaxeAppliquee();
}
	


}
