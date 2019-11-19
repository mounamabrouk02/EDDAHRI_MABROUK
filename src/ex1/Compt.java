package ex1;

public class Compt  implements Runnable{
    String nom;
    int maxIter= 1000 ;
    int nb=0;
    public Compt(String  nom, int nombre)    {
	this.nom=nom;
    this.nb=nombre;
    }
    public void run()
    {
	   if(nb==0) {
		   for(int i=0;i<maxIter;i++)
		   System.out.println(nom +" :"+  i);
	   }
	   else if(nb==1000) {
		   for(int i=1000;i>0;i--)
			   System.out.println(nom +" :"+  i);
	   }
	   
    }
    public static void main(String[] args)  throws  Exception {
	Compt   objetA  = new Compt("TA",1000);
	Thread TA = new Thread(objetA);
    Compt   objetB  = new Compt("TB",0);
        Thread TB = new Thread(objetB);
	TA.start();
	TB.start();
    }
}