import java.util.*;
import java.util.stream.Collectors;

public class findUnique {
    public static double findUniq(double arr[]) {

        ArrayList<Double> list = new ArrayList<Double>();
        for (double d : arr) {
            list.add(d);
        }
        ;
        ArrayList<Double> reps = new ArrayList<Double>();
        for (int i = 0; i < list.size() - 1; i++) {
            for (int k = i + 1; k < list.size(); k++) {
                double a = list.get(i);
                double b = list.get(k);
                if (a == b) {
                    reps.add(list.get(i));
                }
            }
        }

        List<Double> source = list.stream().distinct().collect(Collectors.toList());


        double result = 0.0;

        for (int i = 0; i < source.size(); i++) {
            double a = source.get(i);
            for (int k = 0; k < reps.size(); k++) {
                double b = reps.get(k);
                if (a != b) {
                    result = a;
                }
            }
        }
        return result;


    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1})); // => 2
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0})); // => 2
        System.out.println(findUniq(new double[]{0, 1, 0}));
    }
}
