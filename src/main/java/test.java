public class test {
    public static void main(String[] args) {
        System.out.println(match("witam", "asm"));


    }

    public static boolean match(String strr, String endingg) {
        int start = strr.length() - endingg.length();
        String[] str = strr.split("");
        String[] ending = endingg.split("");
        while (start < str.length) {
            for (int i = 0; i < ending.length; i++) {
                if (!str[start].equals(ending[i])) {
                    return false;
                }
                start++;


            }

        }


        return true;
    }
}
