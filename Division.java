public class Division {
    public static double divide(double dividend, double divisor) {
        int quotient = 0;

        double reminder = 0;

        if (divisor == 0) {
            System.err.println("Exception : divisor cannot be zero ");
        }

        //In this code snippet, we use a while loop to repeatedly subtract the divisor from the dividend until the dividend becomes smaller than the divisor. This process is essentially performing long division manually.

        while (dividend >= divisor) { // The while loop condition dividend >= divisor checks whether the dividend is still greater than or equal to the divisor. If it is, the loop continues; otherwise, it exits.

            dividend -= divisor; // Inside the loop, we subtract the divisor from the dividend using the compound assignment operator -=. This operation reduces the value of dividend by the value of divisor.

            quotient++; // We increment the quotient variable by 1 using the ++ operator. The quotient keeps track of the number of times we subtracted the divisor from the dividend.
        }
        return quotient; // Once the loop exits, we return the quotient, which represents the result of the division



        // By repeatedly subtracting the divisor from the dividend until the dividend becomes smaller than the divisor, we effectively simulate the process of division without using the division operator. The number of times we subtracted the divisor from the dividend gives us the quotient.



    }



    public static void main(String[] args) {
        double dividend = 10;
        double divisor = 2;
        double  result = divide(dividend, divisor);
        System.out.println("Result: " + result);

    }
}
