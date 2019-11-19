package ex1;


public class ComptT extends Thread{
	int nb;
	String nom;
		ComptT(int nombre,String name){
		nom = name;
		nb = nombre;
	}
		public void run() {
		
			 if(nb==0) {
				   for(int i=0;i<1000;i++)
				   System.out.println(nom +" :"+  i);
			   }
			   else if(nb==1000) {
				   for(int i=1000;i>0;i--)
					   System.out.println(nom +" :"+  i);
			   
			
		}}
		
		public static void main(String[] args) {
			new ComptT(0,"T1").start();
			new ComptT(1000,"T2").start();
		}
}
