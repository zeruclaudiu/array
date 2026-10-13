public class ejercicio8 {
    public static void main(String[] args) {

        int positivos =0;
        int negativos = 0;

        int [] numeros =  {5, 5, 8, 5, 6, 7, 10, -6, 8, -3 };

        for(int i=0;i<numeros.length;i++){

            if(numeros[i]>=0){
                positivos+=numeros[i];
            }else {
                negativos+=numeros[i];
            }

        }
        System.out.println("La suma de positivos es: " + positivos);
        System.out.println("La suma de negativos es: " + negativos);

    }
}
