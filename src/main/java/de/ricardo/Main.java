package de.ricardo;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        StudentRecord  studentRecord = new StudentRecord("1a2", "Thomas", "Bauer", 26);

        studentRecord.age();
        studentRecord = new StudentRecord("1a2", "Thomas", "Müller", 26);

        System.out.println(studentRecord);

        studentRecord = studentRecord.withFirstName("Jan");

        System.out.println(studentRecord);

        double a = 0.1;
        double b = 0.2;
        System.out.println(a+b);

        BigDecimal number1 = new BigDecimal("0.1");
        BigDecimal number2 = new BigDecimal("0.2");
        System.out.println(number1.add(number2));

        BigDecimal sum = number1.add(number2);
        BigDecimal sub = number1.subtract(number2);
        BigDecimal mult = number1.multiply(number2);
        BigDecimal div = number1.divide(number2, 2, BigDecimal.ROUND_HALF_UP);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mult);
        System.out.println("Div Ergebnis: " + div);


    }
}