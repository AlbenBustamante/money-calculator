package com.alnicode.calculator.controller;

import com.alnicode.calculator.model.Cash;
import com.alnicode.calculator.model.CashReq;
import com.alnicode.calculator.service.CashService;
import com.alnicode.calculator.view.MainView;

import java.util.function.Function;

public class CashController {
    private static CashController instance;
    private final MainView view;
    private final CashService service;

    private CashController(final MainView view) {
        this.view = view;
        this.service = CashService.instance();
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

    private Cash createCash() throws Exception {
        try {
            final var req = new CashReq(
                    Integer.parseInt(view.tfHundredThousand().getText().strip()),
                    Integer.parseInt(view.tfFiftyThousand().getText().strip()),
                    Integer.parseInt(view.tfTwentyThousand().getText().strip()),
                    Integer.parseInt(view.tfTenThousand().getText().strip()),
                    Integer.parseInt(view.tfFiveThousand().getText().strip()),
                    Integer.parseInt(view.tfTwoThousand().getText().strip()),
                    Integer.parseInt(view.tfOneThousand().getText().strip()),
                    Integer.parseInt(view.tfFiveHundred().getText().strip()),
                    Integer.parseInt(view.tfTwoHundred().getText().strip()),
                    Integer.parseInt(view.tfOneHundred().getText().strip()),
                    Integer.parseInt(view.tfFifty().getText().strip())
            );

            return service.createCash(req);
        } catch (NumberFormatException ex) {
            throw new Exception("\"" + ex.getMessage().split("\"")[1] + "\" no es un número...");
        }
    }

    public void calculate() throws Exception {
        final var cash = createCash();

        view.lbTotalHundredThousand().setText(toCurrency().apply(cash.hundredThousand()));
        view.lbTotalFiftyThousand().setText(toCurrency().apply(cash.fiftyThousand()));
        view.lbTotalTwentyThousand().setText(toCurrency().apply(cash.twentyThousand()));
        view.lbTotalTenThousand().setText(toCurrency().apply(cash.tenThousand()));
        view.lbTotalFiveThousand().setText(toCurrency().apply(cash.fiveThousand()));
        view.lbTotalTwoThousand().setText(toCurrency().apply(cash.twoThousand()));
        view.lbTotalOneThousand().setText(toCurrency().apply(cash.oneThousand()));
        view.lbTotalFiveHundred().setText(toCurrency().apply(cash.fiveHundred()));
        view.lbTotalTwoHundred().setText(toCurrency().apply(cash.twoHundred()));
        view.lbTotalOneHundred().setText(toCurrency().apply(cash.oneHundred()));
        view.lbTotalFifty().setText(toCurrency().apply(cash.fifty()));
        view.lbTotal().setText(toCurrency().apply(cash.result()));
    }

    private Function<Integer, String> toCurrency() {
        return value -> "$" + value;
    }

}
