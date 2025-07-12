public class nazarbekov_hw_3 {
    public static void main(String[] args) {
        double[] numbers = {5.3,4.5,-6.6,7.2,-1.9,-3.7,7.8,-13.5,-10.4,4.1,9.3,-17.4,-23.5,16.3,7.7};
        double result = 0;
        for (double i: numbers)
        if (i > 0){
            result += i;
        }
        System.out.println("Средние арифметическое равно:" + result / numbers.length);
    }
}