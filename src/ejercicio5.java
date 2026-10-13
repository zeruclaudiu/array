public class ejercicio5 {
    public static void main(String[] args) {
        int [] numeros = {5,5,4,5,9,6,4,2,6,8};
        int maximo = numeros [0];
        for(int i=0;i<numeros.length;i++){
            if(numeros[i]>maximo){
                maximo=numeros[i];
            }
        }
        System.out.println("El numero mas grande es : " +maximo);
    }
}
