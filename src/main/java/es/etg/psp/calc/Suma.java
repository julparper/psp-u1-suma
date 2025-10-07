package es.etg.psp.calc;

import java.io.IOException;

import es.etg.psp.calc.util.Fichero;

public class Suma {

    public final static int OPERADOR_1 = 0;
    public final static int OPERADOR_2 = 1;


    /** 
     * Suma a b : Suma los números del intervalo [a,b]donde a <b
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {

        String numero1 = args[OPERADOR_1];
        String numero2 = args[OPERADOR_2];

        int operador1 = convertir(numero1);
        int operador2 = convertir(numero2);

        //System.out.println(sumar(operador1, operador2));
        Fichero.guardar(String.valueOf(sumar(operador1, operador2)));
        
    }

    private static int convertir(String numero){
        return Integer.parseInt(numero);
    }

    private static int sumar (int op1, int op2){
        int suma = 0;

        for(int i=op1; i<=op2; i++){
            suma += i;
        }

        return suma;
    }

    
}
