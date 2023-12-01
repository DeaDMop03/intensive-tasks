package com.walking.intensive.chapter1.task4;

/**
 * �������: <a href="https://geometry-math.ru/homework/Java-parameter.html">������</a>
 */
public class Task4 {
    public static void main(String[] args) {
//        ��� ����������� �������� ������ ������ ����� ��������� � ���� ������
        double a = 2;
        double b = -8;
        double c = 4;

        System.out.println(solveQuadraticEquation(a, b, c));

    } static String beautifier (double d) {
        int beautified;
        try {
            beautified = Integer.valueOf((int) d);
            return String.valueOf(beautified);
        }
        catch (Exception e) {
            return String.valueOf(d);
        }
    }

    /**
     * ��� ������������ ������, ����� ��������� ������ ����������� �� �����������.
     * <p>
     * ������� �������������� ������:
     * <p>
     * ���������� �������: 2. �����: -4;4
     * <p>
     * ���������� �������: 1. ������: 0
     * <p>
     * ���������� �������: 0.
     */
    static String solveQuadraticEquation(double a, double b, double c) {
        //        ����� ��� ������ ����
        if (a == 0 && b == 0 && c == 0) {
            return "������� ����������";
        } else if (a == 0 && b == 0 && c != 0) {
            return "���������� �������: 0.";
        } else if (a == 0 && b != 0) {
            return "���������� �������: 1. ������: " + beautifier(-c / b);
            //String.valueOf(-c / b);
        } else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant < 0) {
                return "���������� �������: 0.";
            } else if (discriminant == 0) {
                return "���������� �������: 1. ������: " + beautifier(-b / 2 * a);
                //String.valueOf(-b / 2 * a);
            } else {
                return "���������� �������: 2. �����: " + beautifier((-b - Math.sqrt(discriminant)) / (2 * a))  + ";" + beautifier((-b + Math.sqrt(discriminant)) / (2 * a));
                //String.valueOf(-b + Math.sqrt(discriminant) / 2 * a) + ";" + String.valueOf(-b - Math.sqrt(discriminant) / 2 * a);
            }
        }
    }
}