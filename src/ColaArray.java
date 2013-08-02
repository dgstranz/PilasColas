
public class ColaArray implements Encolable {
	private int TAM=100000;
	private int [] cola=new int[TAM];
	private int cabecera;
	private int fin;
	
	/**
	 * Utilizo un array circular.
	 * TAM: El tamaño máximo del array.
	 * Fin: Posición del fin de la cola, por donde se añaden elementos.
	 * Cabecera: Posición de la cabecera de la cola, por donde se eliminan elementos.
	 * (En realidad no se eliminan, simplemente se suma 1 a cabecera.)
	 * Aquí se utiliza mucho la aritmética modular. La posición que va después de TAM-1 es 0.
	 */
	
	public ColaArray(){
		cabecera=0;
		fin=0;
	}
	
	/**
	 * Cuando (fin==cabecera) es que el array está vacío.
	 * Se considera lleno cuando (((fin+1)%TAM == cabecera), es decir,
	 * cuando el elemento en la posición inmediatamente posterior a fin en el array circular
	 * sea el elemento de la cabecera.
	 */
	
	public void add(int dato){
		if(((fin+1)%TAM)!=cabecera){
			cola[fin]=dato;
			fin=(fin+1)%TAM;
		}
	}
	
	public int delete(){
		int dato;
		if(!isEmpty()){
			dato=cola[cabecera];
			cabecera=(cabecera+1)%TAM;
			return dato;
		}
		else return -1;
	}
	
	public boolean isEmpty(){
		return(fin==cabecera);
	}
}
