public class ReverseArrayProblem {

    public int[] solve(int[] nums){
        int lowIndex = 0;
        int highIndex = nums.length - 1;
        while(lowIndex < highIndex){
            swap(nums, lowIndex, highIndex);
            highIndex--;
            lowIndex++;
        }
        return nums;
    }
    private void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
