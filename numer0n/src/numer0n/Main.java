package numer0n;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 主処理を行う
 * 
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Comp comp = new Comp();

        /**
         * BITE数を表す
         */
        int numberOfBite = 0;

        /**
         * EAT数を表す
         */
        int numberOfEat = 0;

        System.out.println("数字を決めてね");

        //プレーヤーの数字を決める
        player.setUp();
        //相手の数字を決める
        comp.setUp();

        //順番関係なしに確かめる（とりあえず作った）
        /**
         * callする3桁の数字を表す
         */
        ArrayList<Integer> callNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("相手の数字を当ててね");
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "けた目の数字を入力してね");
            int inputNumber = scanner.nextInt();

            if (inputNumber < 0 || 9 < inputNumber) {
                System.out.println("0~9の間で入力しろ");
                i--;
                continue;
            }

            callNumbers.add(inputNumber);
            for (int j = 0; j < i; j++) {
                if (callNumbers.get(i).equals(callNumbers.get(j))) {
                    System.out.println("重複してるから数字を入力しなおしてね");
                    callNumbers.remove(i);
                    i--;
                    break;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            if (comp.getNumbers().contains(callNumbers.get(i))) {
                numberOfBite++;
            }
            if (comp.getNumbers().get(i).equals(callNumbers.get(i))) {
                numberOfBite--;
                numberOfEat++;
            }
        }


        //確認用プレーヤーの数字表示
        for (int i = player.getNumbers().size() - 1; 0 <= i; i--) {
            System.out.print("自分の数字" + player.getNumbers().get(i));
        }
        System.out.println();
        //確認用相手の数字表示
        for (int i = comp.getNumbers().size() - 1; 0 <= i; i--) {
            System.out.print("相手の数字" + comp.getNumbers().get(i));
        }
        System.out.println();

        System.out.println(numberOfEat + "EAT " + numberOfBite + "BITE");
    }
}
