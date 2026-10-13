public class ejercio4 {
    public static void main(String[] args) {

        int[] numeros = {5,5,5,5,10,10,10,10};

            double suma =0;


        for (int i = 0; i < numeros.length; i++) {
            suma = suma +numeros[i];

        }
        System.out.println("La media es: " + (suma /numeros.length));
    }
}
