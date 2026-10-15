import java.util.Scanner;

public class sumaigual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = sc.nextInt();
        int[] numeros1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numeros1.length; i++) {
            for (int j = i + 1; j < numeros1.length; j++) {
                if (numeros1[i] + numeros1[j] == num) {
                    System.out.println(numeros1[i] + " + " + numeros1[j] + " = " + num);
                }
            }
        }
    }
}
