package com.kh.variable.practice;

import java.util.Scanner;

public class VariablePractice {
    public void method1() {

        Scanner sc = new Scanner(System.in);

        System.out.println("숫자 입력 (1)");
        int num1 = 0;
        num1 = sc.nextInt();
        System.out.println("숫자 입력 (2)");
        int num2 = 0;
        int sum1;
        int sum2;
        num2 = sc.nextInt();

        sum1 = num1 * num2;
        sum2 = (num1 + num2) * 2;

        System.out.println("면적: " + sum1 + " 둘레: " + sum2);
        sc.close();
    }
}
