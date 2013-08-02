public class ColaLista implements Encolable {
	private Nodo cabecera;
	private Nodo fin;
	
	public ColaLista(){
		cabecera=null;
		fin=null;
	}
	
	public boolean isEmpty(){
		return(cabecera==null);
	}
		
	public void add(int dato){
		Nodo nodo=new Nodo(dato);
		if(isEmpty()){
			cabecera=nodo;
		}
		else {
			fin.setSig(nodo);
		}
		fin=nodo;
	}
	
	public int delete(){
		int dato;
		if(!isEmpty()){
			dato=cabecera.getDato();;
			cabecera=cabecera.getSig();
			return dato;
		}
		else{
			return -1;
		}
	}
}
