package numer0n;

import java.util.ArrayList;
import java.util.List;

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
}
