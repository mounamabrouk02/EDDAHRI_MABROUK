package ex3;

public class Ajob implements Runnable{
	Valeur myVal;
	int i;
	
	public Ajob(Valeur val, int nb) {
		myVal=val;
		i=nb;
		
		}
	

	public void run() {
		for(int j=0;j<=1000000;i++) {
			myVal.add(i);}
		
	}}

