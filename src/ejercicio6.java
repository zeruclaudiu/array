public class ejercicio6 {
    public static void main(String[] args) {
        int [] numeros = {5,5,4,5,-1,6,4,2,6,8};
        int minimo = numeros [0];
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]<minimo){
                minimo=numeros[i];
            }
        }
        System.out.println("El numero mas pequeño es : " +minimo);
    }
}
