package com.alnicode.calculator.view;

import com.alnicode.calculator.controller.CashController;

import javax.swing.*;
import java.util.function.Function;

public class MainView extends JFrame {

    private final JButton btCalculate;
    private final JLabel lbBillAmount, lbBillTitle, lbBillTotal, lbBillValue, lbFIveThousand, lbFifty, lbFiftyThousand,
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
        lbBillTitle = new JLabel();
        spBillTitle = new JSeparator();
        lbBillAmount = new JLabel();
        tfHundredThousand = new JTextField();
        tfFiftyThousand = new JTextField();
        tfTwentyThousand = new JTextField();
        tfTenThousand = new JTextField();
        tfFiveThousand = new JTextField();
        tfTwoThousand = new JTextField();
        lbBillValue = new JLabel();
        lbHundredThousand = new JLabel();
        lbFiftyThousand = new JLabel();
        lbTwentyThousand = new JLabel();
        lbTenThousand = new JLabel();
        lbFIveThousand = new JLabel();
        lbTwoThousand = new JLabel();
        lbBillTotal = new JLabel();
        lbTotalHundredThousand = new JLabel();
        lbTotalFiftyThousand = new JLabel();
        lbTotalTwentyThousand = new JLabel();
        lbTotalTenThousand = new JLabel();
        lbTotalFiveThousand = new JLabel();
        lbTotalTwoThousand = new JLabel();
        spVertical = new JSeparator();
        lbMoneyTitle = new JLabel();
        spMoneyTitle = new JSeparator();
        lbMoneyAmount = new JLabel();
        tfOneThousand = new JTextField();
        tfFiveHundred = new JTextField();
        tfTwoHundred = new JTextField();
        tfOneHundred = new JTextField();
        tfFifty = new JTextField();
        lbMoneyValue = new JLabel();
        lbOneThousand = new JLabel();
        lbFiveHundred = new JLabel();
        lbTwoHundred = new JLabel();
        lbOneHundred = new JLabel();
        lbFifty = new JLabel();
        lbMoneyTotal = new JLabel();
        lbTotalOneThousand = new JLabel();
        lbTotalFiveHundred = new JLabel();
        lbTotalTwoHundred = new JLabel();
        lbTotalOneHundred = new JLabel();
        lbTotalFifty = new JLabel();
        btCalculate = new JButton();
        lbTotal = new JLabel();
        spFinal = new JSeparator();
        controller = CashController.getInstance(this);

        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        lbBillTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbBillTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbBillTitle.setText("Billete");

        lbBillAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBillAmount.setHorizontalAlignment(SwingConstants.CENTER);
        lbBillAmount.setText("Cantidad");

        tfHundredThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfHundredThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfHundredThousand.setText("100");

        tfFiftyThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfFiftyThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfFiftyThousand.setText("50");

        tfTwentyThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTwentyThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfTwentyThousand.setText("20");

        tfTenThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTenThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfTenThousand.setText("10");

        tfFiveThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfFiveThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfFiveThousand.setText("5");

        tfTwoThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTwoThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfTwoThousand.setText("2");

        lbBillValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBillValue.setHorizontalAlignment(SwingConstants.CENTER);
        lbBillValue.setText("Valor");

        lbHundredThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbHundredThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbHundredThousand.setText("$100.000");

        lbFiftyThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFiftyThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbFiftyThousand.setText("$50.000");

        lbTwentyThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTwentyThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbTwentyThousand.setText("$20.000");

        lbTenThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTenThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbTenThousand.setText("$10.000");

        lbFIveThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFIveThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbFIveThousand.setText("$5.000");

        lbTwoThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTwoThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbTwoThousand.setText("$2.000");

        lbBillTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBillTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lbBillTotal.setText("Total");

        lbTotalHundredThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalHundredThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalHundredThousand.setText("$10.000.000");

        lbTotalFiftyThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalFiftyThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalFiftyThousand.setText("$2.500.000");

        lbTotalTwentyThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalTwentyThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalTwentyThousand.setText("$400.000");

        lbTotalTenThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalTenThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalTenThousand.setText("$100.000");

        lbTotalFiveThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalFiveThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalFiveThousand.setText("$25.000");

        lbTotalTwoThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalTwoThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalTwoThousand.setText("$4.000");

        spVertical.setOrientation(SwingConstants.VERTICAL);

        lbMoneyTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbMoneyTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbMoneyTitle.setText("Moneda");

        lbMoneyAmount.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMoneyAmount.setHorizontalAlignment(SwingConstants.CENTER);
        lbMoneyAmount.setText("Cantidad");

        tfOneThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfOneThousand.setHorizontalAlignment(JTextField.RIGHT);
        tfOneThousand.setText("100");

        tfFiveHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfFiveHundred.setHorizontalAlignment(JTextField.RIGHT);
        tfFiveHundred.setText("50");

        tfTwoHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfTwoHundred.setHorizontalAlignment(JTextField.RIGHT);
        tfTwoHundred.setText("20");

        tfOneHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfOneHundred.setHorizontalAlignment(JTextField.RIGHT);
        tfOneHundred.setText("10");

        tfFifty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfFifty.setHorizontalAlignment(JTextField.RIGHT);
        tfFifty.setText("5");

        lbMoneyValue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMoneyValue.setHorizontalAlignment(SwingConstants.CENTER);
        lbMoneyValue.setText("Valor");

        lbOneThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbOneThousand.setHorizontalAlignment(SwingConstants.LEFT);
        lbOneThousand.setText("$1.000");

        lbFiveHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFiveHundred.setHorizontalAlignment(SwingConstants.LEFT);
        lbFiveHundred.setText("$500");

        lbTwoHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTwoHundred.setHorizontalAlignment(SwingConstants.LEFT);
        lbTwoHundred.setText("$200");

        lbOneHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbOneHundred.setHorizontalAlignment(SwingConstants.LEFT);
        lbOneHundred.setText("$100");

        lbFifty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFifty.setHorizontalAlignment(SwingConstants.LEFT);
        lbFifty.setText("$50");

        lbMoneyTotal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbMoneyTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lbMoneyTotal.setText("Total");

        lbTotalOneThousand.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalOneThousand.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalOneThousand.setText("$100.000");

        lbTotalFiveHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalFiveHundred.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalFiveHundred.setText("$25.000");

        lbTotalTwoHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalTwoHundred.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalTwoHundred.setText("$4.000");

        lbTotalOneHundred.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalOneHundred.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalOneHundred.setText("$1.000");

        lbTotalFifty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTotalFifty.setHorizontalAlignment(SwingConstants.RIGHT);
        lbTotalFifty.setText("$250");

        btCalculate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btCalculate.setText("Calcular");
        btCalculate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btCalculate.addActionListener(l -> calculate());

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTotal.setHorizontalAlignment(SwingConstants.CENTER);
        lbTotal.setText("Total: $13.159.250");

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
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
                                                                        .addComponent(lbFIveThousand, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                                        .addComponent(lbFIveThousand)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        final var menuBar = new JMenuBar();
        final var menu = new JMenu("limpiar");
        final var cleaner = new JMenuItem("todo");

        cleaner.addActionListener(l -> controller.clean());

        menu.add(cleaner);
        menuBar.add(menu);

        setJMenuBar(menuBar);
        pack();
        setLocationRelativeTo(null);
    }

    private void calculate() {
        final var hundredThousandAmount = Integer.parseInt(tfHundredThousand.getText().strip());
        final var fiftyThousandAmount = Integer.parseInt(tfFiftyThousand.getText().strip());
        final var twentyThousandAmount = Integer.parseInt(tfTwentyThousand.getText().strip());
        final var tenThousandAmount = Integer.parseInt(tfTenThousand.getText().strip());
        final var fiveThousandAmount = Integer.parseInt(tfFiveThousand.getText().strip());
        final var twoThousandAmount = Integer.parseInt(tfTwoThousand.getText().strip());
        final var oneThousandAmount = Integer.parseInt(tfOneThousand.getText().strip());
        final var fiveHundredAmount = Integer.parseInt(tfFiveHundred.getText().strip());
        final var twoHundredAmount = Integer.parseInt(tfTwoHundred.getText().strip());
        final var oneHundredAmount = Integer.parseInt(tfOneHundred.getText().strip());
        final var fiftyAmount = Integer.parseInt(tfFifty.getText().strip());

        final var hundredThousand = hundredThousandAmount * 100000;
        final var fiftyThousand = fiftyThousandAmount * 50000;
        final var twentyThousand = twentyThousandAmount * 20000;
        final var tenThousand = tenThousandAmount * 10000;
        final var fiveThousand = fiveThousandAmount * 5000;
        final var twoThousand = twoThousandAmount * 2000;
        final var oneThousand = oneThousandAmount * 1000;
        final var fiveHundred = fiveHundredAmount * 500;
        final var twoHundred = twoHundredAmount * 200;
        final var oneHundred = oneHundredAmount * 100;
        final var fifty = fiftyAmount * 50;

        final var total = hundredThousand + fiftyThousand + twentyThousand + tenThousand + fiveThousand + twoThousand +
                oneThousand + fiveHundred + twoHundred + oneHundred + fifty;

        lbTotalHundredThousand.setText(toCurrency().apply(hundredThousand));
        lbTotalFiftyThousand.setText(toCurrency().apply(fiftyThousand));
        lbTotalTwentyThousand.setText(toCurrency().apply(twentyThousand));
        lbTotalTenThousand.setText(toCurrency().apply(tenThousand));
        lbTotalFiveThousand.setText(toCurrency().apply(fiveThousand));
        lbTotalTwoThousand.setText(toCurrency().apply(twoThousand));
        lbTotalOneThousand.setText(toCurrency().apply(oneThousand));
        lbTotalFiveHundred.setText(toCurrency().apply(fiveHundred));
        lbTotalTwoHundred.setText(toCurrency().apply(twoHundred));
        lbTotalOneHundred.setText(toCurrency().apply(oneHundred));
        lbTotalFifty.setText(toCurrency().apply(fifty));
        lbTotal.setText(toCurrency().apply(total));
    }

    private Function<Integer, String> toCurrency() {
        return text -> "$" + text;
    }

    public JTextField getTfFifty() {
        return tfFifty;
    }

    public JTextField getTfFiftyThousand() {
        return tfFiftyThousand;
    }

    public JTextField getTfFiveHundred() {
        return tfFiveHundred;
    }

    public JTextField getTfFiveThousand() {
        return tfFiveThousand;
    }

    public JTextField getTfHundredThousand() {
        return tfHundredThousand;
    }

    public JTextField getTfOneHundred() {
        return tfOneHundred;
    }

    public JTextField getTfOneThousand() {
        return tfOneThousand;
    }

    public JTextField getTfTenThousand() {
        return tfTenThousand;
    }

    public JTextField getTfTwentyThousand() {
        return tfTwentyThousand;
    }

    public JTextField getTfTwoHundred() {
        return tfTwoHundred;
    }

    public JTextField getTfTwoThousand() {
        return tfTwoThousand;
    }

}
