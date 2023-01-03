import javax.swing.*;

public class Calc {

    public static void main(String[] args) {

    double a = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o primeiro numero"));
    double b = Double.parseDouble(JOptionPane.showInputDialog(null, "digite o segundo numero"));

    double soma = a + b;
    double div = a / b;
    double mult = a * b;
    double sub = a - b;

    JOptionPane.showMessageDialog(null,
            "Soma: "+soma + "\n"+
                    "Div: " +div + "\n"+
                    "Mult: "+mult + "\n"+
                    "Sub: " +sub );


    }
}

