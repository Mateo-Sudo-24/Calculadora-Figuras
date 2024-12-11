import javax.swing.*;

public static void main(String[] args) {
    JFrame frame = new JFrame("Calculadora de Figuras");
    frame.setContentPane(new Calculadora().getRootPanel());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setVisible(true);
}