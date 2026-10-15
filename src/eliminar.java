import java.util.Arrays;
import java.util.Scanner;

public class eliminar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero");
        int num = sc.nextInt();
        int[] numeros = {10, 2, 3, 4, 50, 6, 7, 8, 9, 10};

        if (num>numeros.length){
            System.out.println("Ingrese el numero");
             num = sc.nextInt();

        }else {
            for (int i = num; i < numeros.length - 1; i++) {       //esto es lo que quita el numero y se queda sin el final

                numeros[i] = numeros[i + 1];         //el numero de atras pasa hacia delante

            }
            numeros[numeros.length - 1] = 0;      //el ultimo numero se convierte en 0

            System.out.println(Arrays.toString(numeros));
        }









    }


}
