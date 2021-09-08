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
    public static int mcd(int a , int b){
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
}
