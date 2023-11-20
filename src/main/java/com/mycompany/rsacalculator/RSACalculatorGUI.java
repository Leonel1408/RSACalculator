package com.mycompany.rsacalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RSACalculatorGUI extends JFrame {
    private JTextField txtInput;
    private JTextArea txtOutput;

    public RSACalculatorGUI() {
        setTitle("RSA Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initComponents();
    }

    private void initComponents() {
        // Layout
        setLayout(new BorderLayout());

        // Panel superior con entrada
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel lblInput = new JLabel("Ingrese número:");
        txtInput = new JTextField(10);
        JButton btnCalculate = new JButton("Calcular");
        btnCalculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateRSA();
            }
        });

        inputPanel.add(lblInput);
        inputPanel.add(txtInput);
        inputPanel.add(btnCalculate);

        // Área de salida
        txtOutput = new JTextArea();
        txtOutput.setEditable(false);

        // Agregar componentes al frame
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(txtOutput), BorderLayout.CENTER);
    }

    private void calculateRSA() {
        // Obtener el número ingresado
        String inputStr = txtInput.getText();
        if (inputStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            int number = Integer.parseInt(inputStr);
            // Realizar cálculos RSA aquí (esto es un ejemplo, debes adaptarlo según tus necesidades)
            int result = performRSACalculation(number);
            // Mostrar el resultado en el área de salida
            txtOutput.setText("El resultado de RSA para " + number + " es: " + result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private int performRSACalculation(int number) {
        // Aquí iría la lógica de cálculo RSA utilizando métodos privados según tus necesidades
        // Este es un ejemplo básico, debes adaptarlo según tus necesidades
        return number * 2;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RSACalculatorGUI().setVisible(true);
            }
        });
    }
}
