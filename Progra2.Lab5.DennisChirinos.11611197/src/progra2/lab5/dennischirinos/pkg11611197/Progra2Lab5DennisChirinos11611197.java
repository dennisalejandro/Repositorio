/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2.lab5.dennischirinos.pkg11611197;
/**
 *
 * @author denni
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static progra2.lab5.dennischirinos.pkg11611197.VenderBoletos.factorial;

public class Progra2Lab5DennisChirinos11611197 {
    /**
     * @param args the command line arguments
     */
    ArrayList<Persona> ListaPersonas = new ArrayList();
    public static void main(String[] args) {
        //pascal3();
        System.out.println("/A");
        ArrayList<Persona> ListaPersonas = new ArrayList();
        String IngContraseña = JOptionPane.showInputDialog("Cree la Contraseña");
        char[] array = IngContraseña.toCharArray();
        String ConBinary = StringToBinary(IngContraseña);
        Grafico1 G1 = new Grafico1(ConBinary);
        VenderBoletos G2 = new VenderBoletos(G1);
        Rifa G3 = new Rifa();
        MenuPrincipal MP = new MenuPrincipal(G1, G2, ConBinary);
        MP.setVisible(true);
    }

    public static int az(char c) {
        switch (c) {
        case 'a':
            return 1;
        case 'b':
            return 2;
        case 'c':
            return 3;
        case 'd':
            return 4;
        case 'e':
            return 5;
        case 'f':
            return 6;
        case 'g':
            return 7;
        case 'h':
            return 8;
        case 'i':
            return 9;
        case 'j':
            return 10;
        case 'k':
            return 11;
        case 'l':
            return 12;
        case 'm':
            return 13;
        case 'n':
            return 14;
        case 'o':
            return 15;
        case 'p':
            return 16;
        case 'q':
            return 17;
        case 'r':
            return 18;
        case 's':
            return 19;
        case 't':
            return 20;
        case 'u':
            return 21;
        case 'v':
            return 22;
        case 'w':
            return 23;
        case 'x':
            return 24;
        case 'y':
            return 25;
        case 'z':
            return 26;
        }
        return 0;
    }
    public static int IntToBinary(int c) {
    String binary = "";
        while (c>0) {
        binary = (c%2) + binary;
        c /= 2;
        }
        return Integer.parseInt(binary);
    }
    public static String StringToBinary(String c) {
    char[] array = c.toCharArray();
        String ConBinary = "";
        for (int i = 0; i < c.length(); i++) {
            int c1 = az(array[i]);
            int c2 =(IntToBinary(c1));
            ConBinary = ConBinary + (c2 + " ");
        }
        return ConBinary;
    }
    public static void pascal3() {
        int[][] tri = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            tri[i][j] = factorial(i) / (factorial(i-j)*factorial(j));
                System.out.print(tri[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
