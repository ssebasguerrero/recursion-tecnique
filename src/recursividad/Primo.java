package recursividad;

public class Primo 
{
	public static void main (String [] args) 
    {
		int numero = 17;
        
        if (primo(numero, 2) == true) {
			System.out.println("El numero "+ numero + " es un numero primo");
		}else {
			System.out.println("El numero " + numero + " no es un numero primo");
		}
        
    }

    private static boolean primo(int numero, int aux)
    {
        if(numero == 1 || numero == aux) {
            return true; 
        }else {
            if(numero % aux == 0) {
                return false;
            }else {
                return primo(numero, aux + 1);
            }
        }
    }
	
}
