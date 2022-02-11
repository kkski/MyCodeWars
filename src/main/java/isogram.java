import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class isogram {

    public static void main(String[] args) {
        System.out.println(isIsogram("thumbscrewjapingly"));

      //  System.out.println(fixedTests());
    }

    public static boolean isIsogram(String str) {
        String mystr = str.replaceAll(" ", "")
                            .toLowerCase();

        String[] arr = mystr.split("");

        Arrays.sort(arr);
        int index1 = 1;
        int index2 = 1;
        while (index1 != arr.length)
        {
            if(arr[index1] != arr[index1-1])
            {
                arr[index2] = arr[index1];
                index2++;
            }
            index1++;

        }
        return mystr.length() == arr.length;
    }

    public void FixedTests() {
        assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));
    }
}
