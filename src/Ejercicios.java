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
    /*public static int sumavector(int[]vector,int indice){
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
    }*/
    /*private static int compararVectores(int[]vector1,int[]vector2,int indice){
        int sumaDiferencias;
        if (indice==vector1.length-1){
            sumaDiferencias =Math.abs(vector1[indice]-vector2[indice]);
        }else {
            sumaDiferencias =Math.abs(vector1[indice]-vector2[indice]) + compararVectores(vector1,vector2,indice + 1);
        }
        return sumaDiferencias;
    }
    public static boolean compararVectores(int[]vector1,int[]vector2){
        return compararVectores(vector1,vector2, 0)==0;
    }*/


    //Comparando dos vectores con recursividad
    /*private static int compararVectores(int[] v1,int[] v2,int indice){
        int sumaDiferencia;
        if (indice==v1.length-1){
            sumaDiferencia=Math.abs(v1[indice]-v2[indice]);

        }else {
            sumaDiferencia=Math.abs(v1[indice]-v2[indice])+compararVectores(v1,v2,indice+1);

        }
        return sumaDiferencia;
    }
    public static boolean compararVectores(int[] v1,int[] v2){
        return compararVectores(v1,v2,0)==0;
    }*/
    //Serie Fibonacci Diseñar e implementar un método recursivo para calcular el enésimo término de
    //la sucesión.
    /*
    public static void main(String[]args){
        //para que el usuario pueda insertar un numero que se guarde utilizamos scanner
        Scanner teclado = new Scanner(System.in);
        //la sucesion de la serie fibonnacci esta definida por los siguientes valores f(a)=0 y f1(b)=1
        int a = 0, b = 1, c, n,d;
        //Usamos un sout para pedir al usuario que ingrese el numero de cual requiere calcular la sucesion
        System.out.println("Ingrese un numero para calcular la sucesion:" );
        //llamamos a la variable donde se insertara el numero ingresado
        n = teclado.nextInt();
        //utilizamos el ciclo fori para realizar la operacion
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a+b;
            a = b;
            b = c;


        }

    }*/
    //MAXIMO VECTOR CON RECURSIVIDAD
    private static int MaximoVector(int[]vector, int indice, int maximo){
        if (indice== vector.length-1){
            if (vector[indice]>maximo) {
                maximo = vector[indice];
            }
        }else{
            if (vector[indice]>maximo){
                maximo=vector[indice];

            }
            maximo=MaximoVector(vector,indice + 1,maximo);
        }
            return maximo;
    }
        public static int MaximoVector(int[]vector){
        return MaximoVector(vector,0,0);


    }


}
