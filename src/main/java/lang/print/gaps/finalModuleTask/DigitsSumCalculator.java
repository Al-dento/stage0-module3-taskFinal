package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int firstNumber = number / 1000;
        int secondNumber = number / 100 % 10;
        int thirdNumber = number / 10 % 10;
        int fourNumber = number % 10;
        int sumOfNumbers = firstNumber + secondNumber + thirdNumber + fourNumber;
        System.out.println(sumOfNumbers);
    }

    public static void main(String[] args) {
        DigitsSumCalculator digitsSumCalculator = new DigitsSumCalculator();
        digitsSumCalculator.calculateSum(4567);
    }
}
