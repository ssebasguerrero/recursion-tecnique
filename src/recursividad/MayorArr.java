package recursividad;

public class MayorArr {

	public static void main(String[] args) {
		
		int[] arr = {3, 7, 25, 13};
		System.out.println("El numero mayor es: " + numeroMayor(arr, arr.length - 1, 0));
	}
	
	public static int numeroMayor(int[] arr , int posicion , int mayor)
    {
        if(arr[posicion] > mayor) {
            mayor = arr[posicion];
        }else {
            if(posicion==0) { 
            	return mayor; 
            	}
        }
        return  numeroMayor(arr , posicion - 1 , mayor);
    }
	
}
