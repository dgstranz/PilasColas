public class Nodo {
	private int dato;
	private Nodo sig;
	
	public Nodo() {
		this.sig=null;
	}
	
	public Nodo(int dato) {
		this.dato=dato;
		this.sig=null;
	}
	
	public Nodo(int dato,Nodo sig) {
		this.dato=dato;
		this.sig=sig;
	}
	
	public int getDato() {
		return dato;
	}
	public void setDato(int dato) {
		this.dato = dato;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
	
	public String toString() {
		String s=""+this.dato;
		return s;
	}
	
	public boolean equals(Nodo n) {
		if (this.dato==n.dato && this.sig==n.sig) return true;
		else return false;
	}
	
	public int compareTo(Object o){
		Nodo p=(Nodo) o;
		if(dato<p.dato){
			return -1;
		}else{
			if(dato>p.getDato()){
				return 1;
			}else{
				return 0;
			}
		}
	}
}
