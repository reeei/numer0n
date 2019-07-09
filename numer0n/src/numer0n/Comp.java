package numer0n;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Computerが保持する情報
 * num = 3桁の数字（被りなし）
 */
public class Comp {

    private List<Integer> numbers;

    public Comp() {
        this.numbers = new ArrayList<>();
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setUp() {
        //コンピュータの数字を決める処理（重複なし）
        java.util.Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(10);
            numbers.add(randomNumber);
            for (int j = 0; j < i; j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    numbers.remove(i);
                    i--;
                    break;
                }
            }
        }
    }
}
