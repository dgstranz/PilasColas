public class PilaLista implements Apilable {
	private Nodo cima;
	
	public PilaLista(){
		cima=null;
	}
	
	public boolean isEmpty(){
		return(cima==null);
	}
	
	public void add(int dato){
		Nodo nodo=new Nodo(dato);
		nodo.setSig(cima);
		cima=nodo;
	}
	
	public int delete(){
		int dato;
		if(!isEmpty()){
			dato=cima.getDato();
			cima=cima.getSig();
			return dato;
		}
		else{
			return -1;
		}
	}
}
