package com.alnicode.calculator.model;

public record Cash(int hundredThousand, int fiftyThousand, int twentyThousand, int tenThousand, int fiveThousand,
                   int twoThousand, int oneThousand, int fiveHundred, int twoHundred, int oneHundred, int fifty) {

    public int result() {
        return hundredThousand + fiftyThousand + twentyThousand + tenThousand + fiveThousand +
                twoThousand + oneThousand + fiveHundred + twoHundred + oneHundred + fifty;
    }

}
