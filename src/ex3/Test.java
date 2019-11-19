package ex3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Valeur Myval = new Valeur(5);
		Ajob job1 = new Ajob(Myval, 1);
		
		Ajob job2 = new Ajob(Myval, -1);
		System.out.println(" "+ job1.myVal.getVal());
		
	}

}
// 3-elle devrait stocker le meme valeur dans le debut
//4-