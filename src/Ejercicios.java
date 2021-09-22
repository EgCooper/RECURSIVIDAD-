import java.util.Scanner;

public class Ejercicios {
    //Recursividad Clase 1
    /*public static int factorial(int n){
        int factorial;
        if (n==1){
            factorial=n;
        }else {
            factorial = n * factorial(n-1);
        }

        return factorial;
    }
    */
    /*Maximo Comun Divisor mcd con algoritmo de Euclides Clase 2
    a=412 ; b=184;
     */
    /*public static int mcd(int a , int b){
        int mcd;
        if (a==b){
        mcd= b;

        }else {
            if (a>b){
                a = a-b;
            }else {
                b= b-a;
            }
            mcd = mcd(a, b);
        }
        return mcd;
    }
    */
    //SUMA DE ELEMENTOS DE UN VECTOR
    public static int sumavector(int[]vector,int indice){
        int suma;
        if(indice==vector.length -1){
            suma = vector[indice];
        }else{
            suma = vector[indice]+sumavector(vector,indice+1);

        }
        return suma;
        //Invertir cadena con recursividad
    }
    public static String InvertirPalabra(String palabra, int longitud){
        if( longitud==0){
            return palabra.charAt(longitud)+"";


        }else
            return palabra.charAt(longitud)+InvertirPalabra(palabra,longitud -1);

    }
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        String palabra;
        int longitud;
        System.out.println("ingrese una palabra");
        palabra=teclado.next();
        longitud = palabra.length();
        String palabra_invertida = InvertirPalabra(palabra,longitud-1);
        System.out.println("La palabra invertida es "+palabra_invertida);
    }

}
