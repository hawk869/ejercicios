import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int nums[] = {2,1,0,2,2,1,0};
        ReverseArrayProblem problem = new ReverseArrayProblem();
//        System.out.println(Arrays.toString(problem.solve(nums)));

        AnagramProblem problem1 = new AnagramProblem();
//        System.out.println(problem1.solve("restful".toCharArray(), "fluster".toCharArray()));

        PalindromeProblem problem2 = new PalindromeProblem();
//        System.out.println(problem2.solve("madam"));

        IntegerReverseProblem problem3 = new IntegerReverseProblem();
//        System.out.println(problem3.solve(100));

        DutchFlagProblem problem4 = new DutchFlagProblem(nums);
        problem4.solve();
        problem4.showResult();

//        reverse an array


//        arraylist
//        List<String> names = new ArrayList<>();
//        names.add("Daniel");
//        names.add("Kevin");
//        names.add("Ana");
//        names.add("Adam");

//        System.out.println(names.remove(0));
//        System.out.println(names.get(0));
//        System.out.println(names.size());
//
//        for(String name: names)
//            System.out.println(name);

//      arrays se tiene que asignar el tamano del array
//        int[] nums = new int[10];
//        for(int i=0; i<10; i++)
//            nums[i] = i;

//        for(int i=0; i<10; i++)
//            if(nums[i]==6);
//                System.out.println("we have found the item at index: "+i);
    }
}