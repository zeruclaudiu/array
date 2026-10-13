import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numeros = {1,10,4,3,7,6,5,2,8,9};
        int posicion = -1;
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        for (int i=0;i<numeros.length;i++){
            if (numero==numeros[i]){
                posicion = i;

            }
        }
        System.out.println("La posicion es: " +  posicion);
    }
}
