package ex4;

import java.util.*;
public class Parking {
    int PlacesOccupees; 
    int Capacite ; 
    public HashSet<Voiture> infoVoitures = new HashSet<Voiture>();
    Parking(int size){ this.Capacite = size;} 
    int places(){ return (this.Capacite - this.PlacesOccupees); }  
	
    synchronized boolean  enter(Voiture myVoit) {
	if  (this.places() >0 )
	    { 
		this.PlacesOccupees ++ ;
		infoVoitures.add(myVoit); 
		System.out.format("[Parking] :%s entere, il reste %d places \n", myVoit.nom, this.places());
		System.out.format("Voiture Garees\n");
		System.out.println(infoVoitures);
		return (true) ; 
	    }
	else {
	    System.out.format("Parking : %s refuse, il reste  %d places \n", myVoit.nom,this.places());
	    return(false) ;
	}
    }
    synchronized void quitter(Voiture myVoit) {
	PlacesOccupees --; 
	infoVoitures.remove(myVoit);
	System.out.format("Parking :[%s] est sortie, reste  %d places\n", myVoit.nom, places());
    }}
