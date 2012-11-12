package lesmedicament;

public class Pharmacie {
public static int nb = 0;
private Medicament [] med ;

public Pharmacie(Medicament [] m){
	med=m;
}
public String toString(){
	
	return "la pharmacie contient:"+nb+" Medicaments"; 
}
public void ajout(Medicament m){
med[nb]=m;
nb++;
}

public int recherche(int ref) {
	boolean  k = false;
	int j=-1;
	for(int i=0;i< nb ;i++){
		if(med[i].reference== ref)
			{k = true ;
		     j=med[i].reference;
		     break;}
	}
		if( k == false)
			j=-1;
	
	return j;
}
public void sup(int ref){
	
	int j = 0;
	for(int i = 0;i < nb;i++){
		if(med[i].reference == ref){
			j = i;
		break;
			}
		}
		for( int k = j; k < (nb-j);k++)
		{med[k] = med[k+1];
	}
		nb--;

}


public void affiche (String s ){
	
	if(s=="Antibiotique"){
		for(int i=0;i<nb;i++){
			if (med[i] instanceof Antibiotique)
			System.out.println(	med[i].toString());
		}}
		if(s==" AntiInflammatoire"){
			for(int i=0;i<nb;i++){
				if (med[i] instanceof  AntiInflammatoire)
				System.out.println(	med[i].toString());
			}
		
	}
		if(s==" Homeopatique"){
			for(int i=0;i<nb;i++){
				if (med[i] instanceof Homeopatique)
				System.out.println(	med[i].toString());
			}
		
	}
}
}




