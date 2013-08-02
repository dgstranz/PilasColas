import java.util.Scanner;

public class Cola {
	private Encolable cola;
	
	/**
	 * Encolable se refiere a la interfaz.
	 */
	
	public Cola() {
		int opcion=0;
		System.out.println("Menú de colas\nElige opción (1 = Lista, 2 = Array): ");
		Scanner s=new Scanner(System.in);
		opcion=s.nextInt();
		if(opcion==1) {
			cola=new ColaLista();
		}
		else if(opcion==2){
			cola=new ColaArray();
		}
	}
	
	public Encolable getCola() {
		return cola;
	}
	
	public void setPila(Encolable cola) {
		this.cola=cola;
	}
	
	public void add(int dato) {
		cola.add(dato);
	}
	
	public int delete() {
		return cola.delete();
	}
	
	public boolean isEmpty() {
		return cola.isEmpty();
	}
}