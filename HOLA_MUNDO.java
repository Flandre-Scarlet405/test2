package PAQUETE;

public class HOLA_MUNDO {

	
	
	//COMENTARIO
/*	comentarios compuestos
*/	
	
	//script?
	public static void main (String[] args){
		
		//variable
		int aciertos=0;
		int numeros=0;
		
		
		//while true do de java
		while (true) {
			
			//wait(2s/aciertos+1)
			 try {     
		            Thread.sleep(2000/(aciertos+1)); 
		        } catch (InterruptedException e) {
		            break; 
		        }
			
			 //math.random(0-9)  y mas cosas
		int numero = (int) (Math.random() * 10)+1;
		double hola = Math.random();
		
		
		// System.out.println("Hoa......");
		// System.out.println(hola);
		System.out.println(numero);
		numeros+=1;
		System.out.println("Cantidad de numeros:"+numeros);
		
		
		//if
		if (numero==10)  {
			System.out.println("Acierto");
			aciertos+=1;
			System.out.println("Aciertos:"+aciertos);
			
			//wait(2)
			 try {     
		            Thread.sleep(2000); 
		        } catch (InterruptedException e) {
		            break; 
		        }
			
		}
		
		
		} 
	}
	
	
	
	
	
	
	
	
	
}
