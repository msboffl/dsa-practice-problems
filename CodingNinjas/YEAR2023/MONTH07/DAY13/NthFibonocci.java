package CodingNinjas.YEAR2023.MONTH07.DAY13;

import java.util.Scanner;

public class NthFibonocci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num1 = 1;
        int num2 = 0;
        int res = 0;
        for(int i = 0; i<n; i++) {
            res = num1 + num2;
            num1 = num2;
            num2 = res;
        }
        System.out.println(res);
    }
}

