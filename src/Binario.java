public class Binario {

    public Pila TransformarBinario(int numero){
        Pila pila = new Pila();
        while(numero > 0){
            pila.apilar(numero%2);
            numero = numero/2;
        }
        return pila;
    }
}
