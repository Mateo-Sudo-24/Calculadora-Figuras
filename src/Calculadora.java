import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField textField2;
    private JButton BotonCirculo;
    private JButton BotonCuadrado;
    private JTextField textField4;
    private JTextField textField5;
    private JButton BotonRectangulo;
    private JTextField textField6;
    private JTextField textField7;
    private JButton BotonPentagono;
    private JTextField textField3;
    private JTextField textField8;
    private JTextField textField9;
    private JTextField textField10;
    private JTextField textField11;
    private JButton BotonTriangulo;
    private JTextField textField1;
    private JTextArea ResultadoPerimetro;
    private JTextArea ResultadoArea;
    private JLabel titulo;
    private JLabel circulo;
    private JLabel radio;
    private JLabel cuadrado;
    private JLabel lado;
    private JLabel rectangulo;
    private JLabel base;
    private JLabel altura;
    private JLabel pentagono;
    private JLabel ladop;
    private JLabel apotema;
    private JLabel triangulo;
    private JLabel lado1t;
    private JLabel lado2t;
    private JLabel lado3t;
    private JLabel baset;
    private JLabel alturat;
    private JPanel rootPanel; // Definimos el campo JPanel

    public Calculadora() {
        BotonCirculo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double radio = Double.parseDouble(textField2.getText());
                Figuras circulo = new Circulo(radio);
                mostrarResultados(circulo);
            }
        });

        BotonCuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado = Double.parseDouble(textField4.getText());
                Figuras cuadrado = new Cuadrado(lado);
                mostrarResultados(cuadrado);
            }
        });

        BotonRectangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double largo = Double.parseDouble(textField5.getText());
                double ancho = Double.parseDouble(textField6.getText());
                Figuras rectangulo = new Rectangulo(largo, ancho);
                mostrarResultados(rectangulo);
            }
        });

        BotonTriangulo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double base = Double.parseDouble(textField8.getText());
                double altura = Double.parseDouble(textField9.getText());
                double lado1 = Double.parseDouble(textField10.getText());
                double lado2 = Double.parseDouble(textField11.getText());
                double lado3 = Double.parseDouble(textField3.getText());
                Figuras triangulo = new Triangulo(base, altura, lado1, lado2, lado3);
                mostrarResultados(triangulo);
            }
        });

        BotonPentagono.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double lado = Double.parseDouble(textField7.getText());
                double apotema = Double.parseDouble(textField1.getText());
                Figuras pentagono = new Pentagono(lado, apotema);
                mostrarResultados(pentagono);
            }
        });
    }

    private void mostrarResultados(Figuras figura) {
        ResultadoArea.setText("Área: " + figura.calcularArea());
        ResultadoPerimetro.setText("Perímetro: " + figura.calcularPerimetro());
    }

    public JPanel getRootPanel() {
        return rootPanel; // Método para obtener el JPanel raíz
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Figuras");
        frame.setContentPane(new Calculadora().getRootPanel()); // Usamos el método getRootPanel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}