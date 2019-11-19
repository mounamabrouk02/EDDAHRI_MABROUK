package ex2;


public class Compteur extends Thread {
	String nomC;
	int maxValeur;
	
	public Compteur (String nom, int maxValue){
		nomC = nom;
		maxValeur = maxValue;
	}
	
	public void run() {
			// 3- Oui il est deterministe
			//5- 
			   try {
				   for(int i=1;i<=maxValeur;i++)
					   System.out.println(nomC +" :"+  i);
				   		
				   		int s = (int) Math.round(Math.random()*100);
				   		System.out.println(s);
				   		sleep(s);
				   		sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		   
		
	}
	
	}

