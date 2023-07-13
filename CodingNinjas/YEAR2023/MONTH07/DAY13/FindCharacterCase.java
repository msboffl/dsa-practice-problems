package CodingNinjas.YEAR2023.MONTH07.DAY13;

import java.util.Scanner;

public class FindCharacterCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);

        if(ch >= 'A' && ch <= 'Z') {
            System.out.println("1");
        } else if (ch>='a' && ch<='z') {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}
