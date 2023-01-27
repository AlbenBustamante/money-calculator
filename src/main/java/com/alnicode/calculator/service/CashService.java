package com.alnicode.calculator.service;

import com.alnicode.calculator.model.Cash;
import com.alnicode.calculator.model.CashReq;

public class CashService {
    private static CashService instance;

    private CashService() { }

    public static CashService instance() {
        if (instance == null) {
            instance = new CashService();
        }

        return instance;
    }

    public Cash createCash(CashReq req) {
        return new Cash(
                req.hundredThousandAmount() * 100000,
                req.fiftyThousandAmount() * 50000,
                req.twentyThousandAmount() * 20000,
                req.tenThousandAmount() * 10000,
                req.fiveThousandAmount() * 5000,
                req.twoThousandAmount() * 2000,
                req.oneThousandAmount() * 1000,
                req.fiveHundredAmount() * 500,
                req.twoHundredAmount() * 200,
                req.oneHundredAmount() * 100,
                req.fiftyAmount() * 50
        );
    }
}
