import java.util.*;
public class Programa{
public static void main (String [] args){
    int arreglo [];
    arreglo= new int [5];
    int numeros=0;
	int suma=0;

	for (int i =0; i<5; i++){
      System.out.println("Ingrese un numero");
      Scanner Leer=new Scanner (System.in);
      arreglo[i]= Leer.nextInt () ;
	  }
	  
	  
	  for (int i=0; i<5; i++){
	  suma=suma+ arreglo [i];
	  }
	  System.out.println ("Suma=" + suma);
	  
	  for (int i=0; i<5; i++){
	  System.out.println ("Numeros=" + arreglo [i]);
	  }
	  
	  }
	  }
	  
	 
