package lang.print.gaps.finalModuleTask;

import java.util.stream.Stream;

public class NumberReverter {
    public void revert(int number) {
        String numberString = Integer.toString(number);
        StringBuilder stringBuilder = new StringBuilder(numberString);
        stringBuilder.reverse();
        numberString = String.valueOf(stringBuilder);
        number = Integer.parseInt(numberString);
        System.out.println(number);
    }

    public static void main(String[] args) {
        NumberReverter numberReverter = new NumberReverter();
        numberReverter.revert(456);
    }
}
