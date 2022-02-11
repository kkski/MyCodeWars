import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java
public class findUnique {
    public static double findUniq(double arr[]) {
        arr = Arrays.stream(arr).sorted().toArray();
        double[] source2 = Arrays.stream(arr).distinct().toArray();
        List<Double> source = new ArrayList<>();
        for (double d : source2) {source.add(d);}
        List<Double> reps = new ArrayList<Double>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int k = i + 1; k < arr.length; k++) {
                double a = arr[i];
                double b = arr[k];
                if (a == b) {
                    reps.add(arr[i]);
                }
            }
        }
        reps = reps.stream().distinct().collect(Collectors.toList());

        source.removeAll(reps);

        return source.get(0);
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1})); // => 2
        System.out.println(findUniq(new double[]{0, 0, 0.55, 0, 0})); // => 2
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3, 1, 1}));
    }
}
