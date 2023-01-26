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
        view.getTfHundredThousand().setText("0");
        view.getTfFiftyThousand().setText("0");
        view.getTfTwentyThousand().setText("0");
        view.getTfTenThousand().setText("0");
        view.getTfFiveThousand().setText("0");
        view.getTfTwoThousand().setText("0");
        view.getTfOneThousand().setText("0");
        view.getTfFiveHundred().setText("0");
        view.getTfTwoHundred().setText("0");
        view.getTfOneHundred().setText("0");
        view.getTfFifty().setText("0");
    }

}
