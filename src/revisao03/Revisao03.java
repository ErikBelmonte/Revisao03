package revisao03;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Revisao03 {
    public static void main(String[] args) {
        /* Alguns países medem temperaturas em graus Celsius, e outros em graus Fahrenheit. 
        Faça um algoritmo para ler uma temperatura Celsius e imprimi-Ia em Fahrenheit 
        (pesquise como fazer este tipo de conversão). */
        
        double Cels, Fahr;
        DecimalFormat f = new DecimalFormat ("0.0");
        
        Cels = Double.parseDouble(JOptionPane.showInputDialog("Informe o grau em Celsius:"));
        Fahr = ((Cels * 9)/5) + 32;
            JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é de: "+f.format(Fahr));
    }
    
}
