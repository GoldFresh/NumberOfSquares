package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int min, int max) {
        int numberOfSquares = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= min) {
                if (i * i <= max) {
                    numberOfSquares = numberOfSquares + 1;
                }
            }
        }
        return numberOfSquares;
    }

}
