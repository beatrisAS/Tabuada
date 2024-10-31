
package tabuada;

/**
 *
 * @author beatris
 */
public class Tabuada {
    public static void main(String[] args) {
        int numero = 6; // Inicia a tabuada no número 6

        while (numero <= 10) { // Continua até o número 10
            System.out.println("Tabuada do " + numero + ":");
            int i = 1;

            while (i <= 10) { // Multiplicadores de 1 até 10
                System.out.println(numero + " x " + i + " = " + (numero * i));
                i++; // Incrementa o multiplicador
            }

            System.out.println(); // Linha em branco para separar as tabuadas
            numero++; // Incrementa o número da tabuada
        }
    }
}

