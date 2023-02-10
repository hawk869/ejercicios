public class IntegerReverseProblem {

    public int solve(int num){
        int reversed = 0;
        int remainder = 0;

        while (num > 0){
            remainder = num % 10;
            num = num / 10;
            reversed = reversed * 10 + remainder;
        }

        return reversed;
    }
}
