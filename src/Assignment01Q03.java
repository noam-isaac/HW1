public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        long previousNumber = 0;
        long currentNumber = 1;
        int numOdd = 0;
        for (int i = 0; i < x; i++) {
            System.out.print(currentNumber);
            if (i < x - 1)
                System.out.print(" "); // Make sure we don't print a trailing space
            if (currentNumber % 2 != 0) {
                numOdd++;
            }
            long nextNumber = previousNumber + currentNumber;
            previousNumber = currentNumber;
            currentNumber = nextNumber;
        }
        System.out.println();

        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
