/*
OBJETIVO: Serie1 = (1+2+3+...+100).
DATA: 12/03/2026
 */

package recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author Caio Dias (d-caio).
 */
public class Recursividade01 {
    private static final int NUM_INICIAL = 1;
    private static final int NUM_LIMITE = 100;

    public static void main(String[] args) {
        int serie = serie1(NUM_INICIAL, NUM_LIMITE);
        
        JOptionPane.showMessageDialog(null, serie, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
    static int serie1(int numInicial, int numLimite) {
        if (numInicial < numLimite) {
            return numInicial + serie1(numInicial + 1, numLimite);
        }
        
        return numInicial;
    }
}