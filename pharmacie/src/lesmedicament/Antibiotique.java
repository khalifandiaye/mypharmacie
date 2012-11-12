package lesmedicament;

public class Antibiotique extends Medicament {

	protected String bacterie;
	
	public Antibiotique(){
		super();
	}
	
	public Antibiotique(String l,int r,float p ,String d,String b){
		super(l, r, p,d);
		this.bacterie=b;
	}
	public float calculTaxeAppliquee() {
		float b=0;
		if(this.bacterie=="thermophyle"){
			
			 b= prix*(float)(0.10);}
		else{
		if(this.bacterie == "mésophyle"){
			 b= prix*(float)(0.12);}
		
		else{b=prix*(float)(0.12);}}
		return b;
	}
	
public String toString(){
	return super.toString()+"bacterie : "+bacterie+"le tax : "+calculTaxeAppliquee();
}
	

}