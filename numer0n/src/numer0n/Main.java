package numer0n;

import java.util.Random;
import java.util.Scanner;

/*
 * 主処理を行う
 * 
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Comp comp = new Comp();

        Scanner scanner = new Scanner(System.in);

        System.out.println("数字を決めてね");

        //プレーヤーの数字を決める処理（重複なし）
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "けた目の数字を入力してね");
            int inputNumber = scanner.nextInt();
            if (inputNumber < 0 || 9 < inputNumber) {
                System.out.println("0~9の間で入力しろ");
                i--;
                continue;
            }
            player.getNumbers().add(inputNumber);
            for (int j = 0; j < i; j++) {
                if (player.getNumbers().get(i).equals(player.getNumbers().get(j))) {
                    System.out.println("重複してるから数字を入力しなおしてね");
                    player.getNumbers().remove(i);
                    i--;
                    break;
                }
            }
        }

        //コンピュータの数字を決める処理（重複なし）
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(10);
            comp.getNumbers().add(randomNumber);
            for (int j = 0; j < i; j++) {
                if (comp.getNumbers().get(i).equals(comp.getNumbers().get(j))) {
                    comp.getNumbers().remove(i);
                    i--;
                    break;
                }
            }
        }

        for (int i = player.getNumbers().size() - 1; 0 <= i; i--) {
            System.out.print(player.getNumbers().get(i));
        }
        System.out.println();
        for (int i = comp.getNumbers().size() - 1; 0 <= i; i--) {
            System.out.print(comp.getNumbers().get(i));
        }
    }
}
