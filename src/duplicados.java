public class duplicados {
    public static void main(String[] args) {
        int [] numeros = {5, 4, 7, 5, 8, 9, 4, 8};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    System.out.println("El numero " + numeros[i] + " esta duplicado");
                }
            }
        }
    }
}
