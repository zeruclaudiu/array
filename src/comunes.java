public class comunes {
    public static void main(String[] args) {
        int [] numeros1 = {5, 4, 7, 44, 22, 9, 4, 8};
        int [] numeros2 = {1, 22, 3, 5, 10, 9, 2, 8};
        for (int i = 0; i < numeros1.length; i++){
            for (int j = 0; j < numeros2.length; j++){
                if (numeros1[i] == numeros2[j]){
                    System.out.println("El numero " + numeros1[i] + " es comun");
                }
            }
        }
    }
}
