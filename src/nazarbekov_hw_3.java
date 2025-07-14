public class nazarbekov_hw_3 {
    public static void main(String[] args) {
        double[] numbers = {5.3, 4.5, -6.6, 7.2, -1.9, -3.7, 7.8,
                -13.5, -10.4, 4.1, 9.3, -17.4, -23.5, 16.3, 7.7};

        boolean foundNegative = false;
        double sum = 0;
        int count = 0;

        for (double num : numbers) {
            if (!foundNegative) {
                if (num < 0) {
                    foundNegative = true;
                }
                continue;
            }

            if (num > 0) {
                sum += num;
                count++;
            }
        }
        double average = sum / count;
        System.out.println("Среднее арифметическое чисел: " + average);
    }
}