public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        int termCount = Integer.parseInt(args[0]);
        for (int i = 0; i < termCount; i++) {
            double termSign = i % 2 == 0 ? 1.0 : -1.0;
            double termDenominator = 2.0 * i + 1.0;
            approxPi += termSign / termDenominator;
        }
        approxPi *= 4.0;

        System.out.println(approxPi + " " + actualPi);
    }
}
