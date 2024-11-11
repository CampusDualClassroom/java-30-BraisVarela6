package com.campusdual.classroom;

public class Exercise30 {

    public static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {

        if (divisor == 0) {
            throw new DivisionByZeroException("PETARDAZO: No se puede dividir entre 0");
        }
        return dividend/divisor;

    }

    public static void main(String[] args){
        int dividend = 0;
        int divisor = 0;

        try {
            int result = divisionWithCustomException(dividend,divisor);
            System.out.println("Petardazo" + result);
        } catch (DivisionByZeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
