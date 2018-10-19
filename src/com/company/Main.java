package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (Integer i = 1; i <= n; i++) {
            if (i < 10) System.out.println(i);
            else {
                Integer temp = SumaCifara(i);
                if (temp != 0 && i % temp == 0) System.out.println(i);
            }
        }
    }

    public static Integer SumaCifara(Integer broj) {
        Integer rez = 0;
        Integer temp = broj;
        while (temp != 0) {
            Integer temp1 = temp;
            temp1 %= 10;
            rez += temp1;
            temp /= 10;
        }
        return rez;
    }
}
