package recursividad;

public class ContarDigitos {

	public static void main(String[] args) {
		
		int numero = 50;
		System.out.println("La cantidad de digitos de " + numero + " es: " + contarCifras(numero));
	}
	
	public static int contarCifras (int numero ) 
    {
        if (numero < 10) {
            return 1;
        }else {
            return contarCifras(numero / 10 ) + 1;
        }
    }
	
}
