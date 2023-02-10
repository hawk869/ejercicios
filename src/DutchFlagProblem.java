import java.util.Arrays;

public class DutchFlagProblem {

    private int[] nums;

    public DutchFlagProblem(int[] nums) { this.nums = nums; }

    public void solve() {
        int i = 0;
        int j = 0;
        int pivot = 1;
        int k = nums.length - 1;

        while (j<=k){
            if (nums[j] < pivot){
                swap(i,j);
                i++;
                j++;
            }else if(nums[j] > pivot){
                swap(j,k);
                k--;
            }else j++;
        }
    }
    private void swap(int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public void showResult(){
        System.out.println(Arrays.toString(nums));
    }
}
