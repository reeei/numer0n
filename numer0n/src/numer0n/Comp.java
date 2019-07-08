package numer0n;

import java.util.ArrayList;
import java.util.List;

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
}
