package recursividad;

public class PalindromoArr {

	public static void main(String[] args) 
	{
		int[] arr = {5, 8, 8, 6, 5};
		int x = palindromoArr(arr , arr.length - 1 , 0);
		
		if (x == 1) {
			System.out.println("El arreglo es palindromo");
		}else {
			System.out.println("El arreglo NO es palindromo");
		}
	}

	public static int palindromoArr(int arr[] , int principio, int ultimo) 
    {
        if (arr[principio] == arr[ultimo]) {
            if (principio == arr.length - 1 && ultimo == 0){
                  return 1;
            }
                return palindromoArr(arr , principio++, ultimo--);
        }
           return 0;
    }
	
}
