package com.alnicode.calculator.view;

import com.alnicode.calculator.controller.CashController;

import javax.swing.*;
import java.awt.*;

public class MainView extends JFrame {

    private final JButton btCalculate;
    private final JLabel lbBillAmount, lbBillTitle, lbBillTotal, lbBillValue, lbFiveThousand, lbFifty, lbFiftyThousand,
            lbFiveHundred, lbHundredThousand, lbMoneyAmount, lbMoneyTitle, lbMoneyTotal, lbMoneyValue, lbOneHundred,
            lbOneThousand, lbTenThousand, lbTotal, lbTotalFifty, lbTotalFiftyThousand, lbTotalFiveHundred, lbTotalFiveThousand,
            lbTotalHundredThousand, lbTotalOneHundred, lbTotalOneThousand, lbTotalTenThousand, lbTotalTwentyThousand,
            lbTotalTwoHundred, lbTotalTwoThousand, lbTwentyThousand, lbTwoHundred, lbTwoThousand;
    private final JPanel pCenter;
    private final JSeparator spBillTitle, spFinal, spMoneyTitle, spVertical;
    private final JTextField tfFifty, tfFiftyThousand, tfFiveHundred, tfFiveThousand, tfHundredThousand, tfOneHundred,
            tfOneThousand, tfTenThousand, tfTwentyThousand, tfTwoHundred, tfTwoThousand;
    private final CashController controller;

    public MainView() {
        pCenter = new JPanel();
        lbBillTitle = label("Billete", "title");
        spBillTitle = new JSeparator();
        lbBillAmount = label("Cantidad", "subtitle");
        tfHundredThousand = textField("100");
        tfFiftyThousand = textField("50");
        tfTwentyThousand = textField("20");
        tfTenThousand = textField("10");
        tfFiveThousand = textField("5");
        tfTwoThousand = textField("2");
        lbBillValue = label("Valor", "subtitle");
        lbHundredThousand = label("100.000", "left_plain");
        lbFiftyThousand = label("50.000", "left_plain");
        lbTwentyThousand = label("20.000", "left_plain");
        lbTenThousand = label("10.000", "left_plain");
        lbFiveThousand = label("5.000", "left_plain");
        lbTwoThousand = label("2.000", "left_plain");
        lbBillTotal = label("Total", "subtitle");
        lbTotalHundredThousand = label("10.000.000", "right_plain");
        lbTotalFiftyThousand = label("2.500.000", "right_plain");
        lbTotalTwentyThousand = label("400.000", "right_plain");
        lbTotalTenThousand = label("100.000", "right_plain");
        lbTotalFiveThousand = label("25.000", "right_plain");
        lbTotalTwoThousand = label("4.000", "right_plain");
        spVertical = new JSeparator(SwingConstants.VERTICAL);
        lbMoneyTitle = label("Moneda", "title");
        spMoneyTitle = new JSeparator();
        lbMoneyAmount = label("Cantidad", "subtitle");
        tfOneThousand = textField("100");
        tfFiveHundred = textField("50");
        tfTwoHundred = textField("20");
        tfOneHundred = textField("10");
        tfFifty = textField("5");
        lbMoneyValue = label("Valor", "subtitle");
        lbOneThousand = label("1.000", "left_plain");
        lbFiveHundred = label("500", "left_plain");
        lbTwoHundred = label("200", "left_plain");
        lbOneHundred = label("100", "left_plain");
        lbFifty = label("50", "left_plain");
        lbMoneyTotal = label("Total", "subtitle");
        lbTotalOneThousand = label("100.000", "right_plain");
        lbTotalFiveHundred = label("25.000", "right_plain");
        lbTotalTwoHundred = label("4.000", "right_plain");
        lbTotalOneHundred = label("1.000", "right_plain");
        lbTotalFifty = label("250", "right_plain");
        btCalculate = new JButton("Calcular");
        lbTotal = label("Total: $13.159.250", "total");
        spFinal = new JSeparator();
        controller = CashController.getInstance(this);

        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        btCalculate.setFont(new Font("Segoe UI", Font.PLAIN, 24));
        btCalculate.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btCalculate.addActionListener(l -> {
            try {
                controller.calculate();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        design();
        menuBar();
        pack();
        setLocationRelativeTo(null);
    }

    private void menuBar() {
        final var menuBar = new JMenuBar();
        final var menu = new JMenu("limpiar");
        final var cleaner = new JMenuItem("todo");

        cleaner.addActionListener(l -> controller.clean());

        menu.add(cleaner);
        menuBar.add(menu);

        setJMenuBar(menuBar);
    }

    private JTextField textField(final String text) {
        final var tf = new JTextField(text);

        tf.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        tf.setHorizontalAlignment(JTextField.RIGHT);

        return tf;
    }

    private JLabel label(final String text, final String style) {
        final var lb = new JLabel(style.contains("plain") ? "$" + text : text);

        lb.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        lb.setHorizontalAlignment(SwingConstants.CENTER);

        switch (style) {
            case "title" -> lb.setFont(new Font("Segoe UI", Font.BOLD, 24));
            case "subtitle" -> lb.setFont(new Font("Segoe UI", Font.BOLD, 18));
            case "total" -> lb.setFont(new Font("Segoe UI", Font.BOLD, 36));
            case "left_plain" -> lb.setHorizontalAlignment(SwingConstants.LEFT);
            case "right_plain" -> lb.setHorizontalAlignment(SwingConstants.RIGHT);
        }

        return lb;
    }

    // Code provided by Netbeans.
    private void design() {
        final var pCenterLayout = new GroupLayout(pCenter);

        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
                pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCenterLayout.createSequentialGroup()
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(pCenterLayout.createSequentialGroup()
                                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbBillValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbHundredThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbFiftyThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTwentyThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTenThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbFiveThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTwoThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                .addGap(53, 53, 53)
                                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(tfTenThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(tfTwentyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(tfFiftyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfTwoThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfFiveThousand, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(tfHundredThousand)
                                                                                .addComponent(lbBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(35, 35, 35)
                                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbTotalHundredThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbBillTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbTotalFiftyThousand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalTwentyThousand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalTenThousand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalTwoThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalFiveThousand, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(spBillTitle)
                                                        .addComponent(lbBillTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(41, 41, 41)
                                                .addComponent(spVertical, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(spMoneyTitle)
                                                        .addComponent(lbMoneyTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                                                        .addGroup(pCenterLayout.createSequentialGroup()
                                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbFiveHundred, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                                        .addComponent(lbTwoHundred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbOneHundred, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbFifty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbOneThousand)
                                                                        .addComponent(lbMoneyValue))
                                                                .addGap(53, 53, 53)
                                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(tfOneHundred, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(tfTwoHundred, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(tfFiveHundred, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(tfFifty, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(tfOneThousand)
                                                                                .addComponent(lbMoneyAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(32, 32, 32)
                                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(lbTotalOneThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbMoneyTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbTotalFiveHundred, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalTwoHundred, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalOneHundred, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(lbTotalFifty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(spFinal)))
                                        .addComponent(btCalculate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(39, 39, 39))
        );

        pCenterLayout.setVerticalGroup(
                pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pCenterLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pCenterLayout.createSequentialGroup()
                                                .addComponent(lbMoneyTitle)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spMoneyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbMoneyValue)
                                                        .addComponent(lbMoneyAmount)
                                                        .addComponent(lbMoneyTotal))
                                                .addGap(29, 29, 29)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfOneThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbTotalOneThousand)
                                                        .addComponent(lbOneThousand))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfFiveHundred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbFiveHundred)
                                                        .addComponent(lbTotalFiveHundred))
                                                .addGap(33, 33, 33)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfTwoHundred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbTwoHundred)
                                                        .addComponent(lbTotalTwoHundred))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfOneHundred, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbOneHundred)
                                                        .addComponent(lbTotalOneHundred))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfFifty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbFifty)
                                                        .addComponent(lbTotalFifty))
                                                .addGap(41, 41, 41)
                                                .addComponent(spFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(pCenterLayout.createSequentialGroup()
                                                .addComponent(lbBillTitle)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(spBillTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(26, 26, 26)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbBillValue)
                                                        .addComponent(lbBillAmount)
                                                        .addComponent(lbBillTotal))
                                                .addGap(29, 29, 29)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfHundredThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbTotalHundredThousand)
                                                        .addComponent(lbHundredThousand))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfFiftyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbFiftyThousand)
                                                        .addComponent(lbTotalFiftyThousand))
                                                .addGap(33, 33, 33)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfTwentyThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbTwentyThousand)
                                                        .addComponent(lbTotalTwentyThousand))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfTenThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbTenThousand)
                                                        .addComponent(lbTotalTenThousand))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfFiveThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbFiveThousand)
                                                        .addComponent(lbTotalFiveThousand))
                                                .addGap(31, 31, 31)
                                                .addGroup(pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(tfTwoThousand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(lbTwoThousand)
                                                        .addComponent(lbTotalTwoThousand)))
                                        .addComponent(spVertical, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lbTotal)
                                .addGap(18, 18, 18)
                                .addComponent(btCalculate)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        final var layout = new GroupLayout(getContentPane());

        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    } // End of code provided by Netbeans.

    public JTextField tfFifty() {
        return tfFifty;
    }

    public JTextField tfFiftyThousand() {
        return tfFiftyThousand;
    }

    public JTextField tfFiveHundred() {
        return tfFiveHundred;
    }

    public JTextField tfFiveThousand() {
        return tfFiveThousand;
    }

    public JTextField tfHundredThousand() {
        return tfHundredThousand;
    }

    public JTextField tfOneHundred() {
        return tfOneHundred;
    }

    public JTextField tfOneThousand() {
        return tfOneThousand;
    }

    public JTextField tfTenThousand() {
        return tfTenThousand;
    }

    public JTextField tfTwentyThousand() {
        return tfTwentyThousand;
    }

    public JTextField tfTwoHundred() {
        return tfTwoHundred;
    }

    public JTextField tfTwoThousand() {
        return tfTwoThousand;
    }

    public JLabel lbTotal() {
        return lbTotal;
    }

    public JLabel lbTotalFifty() {
        return lbTotalFifty;
    }

    public JLabel lbTotalFiftyThousand() {
        return lbTotalFiftyThousand;
    }

    public JLabel lbTotalFiveHundred() {
        return lbTotalFiveHundred;
    }

    public JLabel lbTotalFiveThousand() {
        return lbTotalFiveThousand;
    }

    public JLabel lbTotalHundredThousand() {
        return lbTotalHundredThousand;
    }

    public JLabel lbTotalOneHundred() {
        return lbTotalOneHundred;
    }

    public JLabel lbTotalOneThousand() {
        return lbTotalOneThousand;
    }

    public JLabel lbTotalTenThousand() {
        return lbTotalTenThousand;
    }

    public JLabel lbTotalTwentyThousand() {
        return lbTotalTwentyThousand;
    }

    public JLabel lbTotalTwoHundred() {
        return lbTotalTwoHundred;
    }

    public JLabel lbTotalTwoThousand() {
        return lbTotalTwoThousand;
    }

}
