public class Assignment {
    static class MethodTracer {
        public int calculate(int score) {
            score = score * 2;
            return score + 5;
        }

        public void displayResult(int finalValue) {
            System.out.println("Result: " + finalValue);
        }

        public int process(int points) {
            // Corrected version:
            points = calculate(points);
            return points;
        }
    }

    public static void main(String[] args) {
        MethodTracer tracer = new MethodTracer();

        // Section 1, Task 1
        int initial = 10;
        int outcome = tracer.process(initial);
        tracer.displayResult(outcome);

        int a = 5;
        int b = 2;
        double outcome1 = a / b;
        System.out.println("Line 1: " + outcome1);

        double precise = (double) a / b;
        System.out.println("Line 2: " + precise);

        int mystery = 'A' + 3;
        System.out.println("Line 3: " + mystery);

        char letter = (char) ('A' + 3);
        System.out.println("Line 4: " + letter);

        int offset = 3;

        char result1 = (char) ('A' + offset);
        System.out.println("Example 1 fixed: " + result1);

        final int finalOffset = 3;

        char result2 = 'A' + finalOffset;
        System.out.println("Example 2: " + result2);

        char letter3 = 'B';
        int step = 2;

        letter3 += step;
        System.out.println("Example 3: " + letter3);

        char low = 'a';

        int distance = 100 - low;
        System.out.println("Example 4: " + distance);

        int multiplier = 2;

        char result5 = (char) ('A' * multiplier + 1);
        System.out.println("Example 5 fixed: " + result5);
    }
}
