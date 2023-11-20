package com.mycompany.rsacalculator;

import javax.swing.SwingUtilities;

public class RSACalculator {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                RSACalculatorGUI calculator = new RSACalculatorGUI();
                calculator.setVisible(true);
            }
        });
    }    
}

