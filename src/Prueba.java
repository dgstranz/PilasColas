
public class Prueba {
	public static void main(String []args){
		int i;
		Pila p=new Pila();
		for(i=1;i<=10;i++){
			p.add(i*i);
		}
		while(!p.isEmpty()){
			System.out.println(p.delete());
		}
		

		Cola c=new Cola();
		for(i=1;i<=10;i++){
			c.add(3*i);
		}
		while(!c.isEmpty()){
			System.out.println(c.delete());
		}
	}
}
