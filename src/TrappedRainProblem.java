public class TrappedRainProblem {

    public int solve(int[] heigts){
        if (heigts.length < 3) return 0;

        int[] leftMax = new int[heigts.length];
        int[] rightMax = new int[heigts.length];

        leftMax[0] = 0;
        rightMax[rightMax.length-1]=0;
        int trapped = 0;

        for (int i=1; i<leftMax.length; ++i){
            leftMax[i] = Math.max(leftMax[i-1], heigts[i-1]);
        }
        for (int i=rightMax.length-2; i>=0; --i){
            rightMax[i] = Math.max(rightMax[i+1], heigts[i+1]);
        }
        for (int i=1; i<heigts.length-1; i++){
            if (Math.min(leftMax[i], rightMax[i]) > heigts[i])
                trapped += Math.min(leftMax[i], rightMax[i]) - heigts[i];
        }
        return trapped;
    }
}
