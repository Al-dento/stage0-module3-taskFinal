package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        if (number > 0) {
            System.out.println(true);
        } else if (number <0) {
            System.out.println(false);
        } else if (number == 0) {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {
        NumbersPrinter numbersPrinter = new NumbersPrinter();
        numbersPrinter.printIsPositive(10);
    }
}
