package ex3;

public class Valeur
{
	int val;
public Valeur(int vleur) {
           val = vleur;}
public int getVal() { 
	return val;
}
public synchronized void add(int i) {
	val+=i;
}
public String toString() {
 return "la valeur : "+val;
}
}
