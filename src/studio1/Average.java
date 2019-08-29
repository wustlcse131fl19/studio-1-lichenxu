package studio1;
import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args) {
        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("Value for the first num to be averaged:");
        int n2 = ap.nextInt("Value for the second num to be averaged:");

        double ave = ((double)(n1) + (double)(n2))/2.0;
        System.out.println("The average of these 2 nums is :" + ave);
    }

}
