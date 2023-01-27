package com.alnicode.calculator.model;

public record CashReq(int hundredThousandAmount, int fiftyThousandAmount, int twentyThousandAmount,
                      int tenThousandAmount,
                      int fiveThousandAmount, int twoThousandAmount, int oneThousandAmount, int fiveHundredAmount,
                      int twoHundredAmount, int oneHundredAmount, int fiftyAmount) {
}
