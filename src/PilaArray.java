public class PilaArray implements Apilable {
	private int TAM=100000;
	private int [] pila=new int[TAM];
	private int pos;
	
	public PilaArray(){
		pos=0;
	}
	
	public void add(int dato){
		if(pos<TAM){
			pila[pos]=dato;
			pos++;
		}
	}
	
	
	public int delete(){
		int dato;
		if(!isEmpty()){
			pos--;
			dato=pila[pos];
			return dato;
		}
		else return -1;
	}
	
	public boolean isEmpty(){
		return(pos<=0);
	}
}
