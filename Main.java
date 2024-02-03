public class Main {
    public static void main(String[] args) {

        System.out.println("Here is a list of all prime numbers between 1 and 100:");
        for(int i = 2; i < 100; i++){ // Loop going through all numbers between 2 and 100
            boolean prime = true; // Initialize boolean variable as true

            for (int j = 2; j < i; j++) { // Loop going through all numbers between 2 and current "i" value
                if (i % j == 0) { // Check if there are any other factors than 1 and current "i", if so the boolean becomes false
                    prime = false;
                    break;
                }
            }

            if (prime){ // Outputs current "i" if number is determined to be prime
                System.out.println(i);
            }
        }
    }
}