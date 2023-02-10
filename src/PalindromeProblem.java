public class PalindromeProblem {

    public boolean solve(String string){

        String stringR = string.replace(" ", "");
        int forward = 0;
        int backward = stringR.length() - 1;
//        System.out.println(stringR.getClass());

        while (forward < backward){
            if (stringR.charAt(forward) != stringR.charAt(backward))
                return false;
            forward++;
            backward--;
        }
        return true;
    }
}
