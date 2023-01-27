package com.alnicode.calculator.controller;

import com.alnicode.calculator.view.MainView;

public class CashController {
    private static CashController instance;
    private final MainView view;

    private CashController(final MainView view) {
        this.view = view;
    }

    public static CashController getInstance(final MainView view) {
        if (instance == null) {
            instance = new CashController(view);
        }

        return instance;
    }

    public void clean() {
        view.tfHundredThousand().setText("0");
        view.tfFiftyThousand().setText("0");
        view.tfTwentyThousand().setText("0");
        view.tfTenThousand().setText("0");
        view.tfFiveThousand().setText("0");
        view.tfTwoThousand().setText("0");
        view.tfOneThousand().setText("0");
        view.tfFiveHundred().setText("0");
        view.tfTwoHundred().setText("0");
        view.tfOneHundred().setText("0");
        view.tfFifty().setText("0");
    }

}
