public class ejercicio9 {
    public static void main(String[] args) {
        int [] numeros = {5,5,4,5,5,6,4,2,6,8};
        int pares=0;
        int impares=0;
        for (int i=0;i<numeros.length;i++) {
            if (numeros[i]%2==0) {
                pares++;
            }else  {
                impares++;
            }
        }
        System.out.println("Los numeros pares son :" + pares);
        System.out.println("Los numeros impares son :" + impares);

    }

    }

