import java.util.Scanner;

public class Pila {
	private Apilable pila;
	
	public Pila() {
		int opcion=0;
		System.out.println("Menú de pilas\nElige opción (1 = Lista, 2 = Array): ");
		Scanner s=new Scanner(System.in);
		opcion=s.nextInt();
		if(opcion==1) {
			pila=new PilaLista();
		}
		else if(opcion==2){
			pila=new PilaArray();
		}
	}
	
	public Apilable getPila() {
		return pila;
	}
	
	public void setPila(Apilable pila) {
		this.pila=pila;
	}
	
	public void add(int dato) {
		pila.add(dato);
	}
	
	public int delete() {
		return pila.delete();
	}
	
	public boolean isEmpty() {
		return pila.isEmpty();
	}
}
