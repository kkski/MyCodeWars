import java.util.Arrays;

public class TwoToOne {

    public static void main(String[] args) {

        System.out.println(longest("aretheyhere", "yestheyarehere"));
    }

    public static String longest (String s1, String s2) {
                String str = s1.concat(s2);
                int index1 = 1;
                int index2 = 1;
                char arr[] = str.toCharArray();
                Arrays.sort(arr);
                while (index1 != arr.length)
                {
                    if(arr[index1] != arr[index1-1])
                    {
                        arr[index2] = arr[index1];
                        index2++;
                    }
                    index1++;

                }

                str = new String(arr);
                return str.substring(0, index2);
            }
        }




