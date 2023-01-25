package com.alnicode.calculator;

import com.alnicode.calculator.view.MainView;

import javax.swing.*;

/**
 *
 * @author user
 */
public class Calculator {

    public static void main(String[] args) {
        try {
            JFrame.setDefaultLookAndFeelDecorated(true);
            JDialog.setDefaultLookAndFeelDecorated(true);
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException |
                 UnsupportedLookAndFeelException ignored) {
        }

        SwingUtilities.invokeLater(() -> new MainView().setVisible(true));
    }
}
