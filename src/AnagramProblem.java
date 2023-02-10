import java.util.Arrays;

public class AnagramProblem {

    public boolean solve(char[] s1, char[] s2){
        if(s2.length != s1.length) return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0; i<s2.length; ++i)
            if(s1[i] != s2[i])
                return false;

        return true;
    }
}
