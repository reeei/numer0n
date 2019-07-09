package numer0n;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Userが保持する情報
 * num = 3桁の数字（被りなし）、
 * money = 持ち金、
 * bet = 掛け金、
 * etc...
 */
public class Player {

    /**
     * プレーヤーが任意に選択した数字を表す
     */
    private List<Integer> numbers;

    public Player() {
        this.numbers = new ArrayList<>();
    }

    /**
     * プレーヤーの数字を返すメソッド
     *
     * @return 3つの数字が格納されたリスト
     */
    public List<Integer> getNumbers() {
        return numbers;
    }

    /**
     * 数字を3桁決めるメソッド
     */
    public void setUp() {
        //プレーヤーの数字を決める処理（重複なし）
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "けた目の数字を入力してね");
            int inputNumber = scanner.nextInt();
            if (inputNumber < 0 || 9 < inputNumber) {
                System.out.println("0~9の間で入力しろ");
                i--;
                continue;
            }
            numbers.add(inputNumber);
            for (int j = 0; j < i; j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    System.out.println("重複してるから数字を入力しなおしてね");
                    numbers.remove(i);
                    i--;
                    break;
                }
            }
        }
    }

}
