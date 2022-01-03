public class JadenCase {
    public static void main(String[] args) {
        System.out.println(toJadenCase(null));
    }

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        } else if (phrase.length() != 0) {
            String[] phrArr = phrase.split(" ");
            StringBuilder resArr = new StringBuilder();

            for (int i = 0; i < phrArr.length; i++) {
                String[] elArr = phrArr[i].split("");
                StringBuilder finalEl = new StringBuilder();
                for (int j = 0; j < elArr.length; j++) {
                    if (j == 0) {
                        finalEl.append(elArr[j].toUpperCase());
                        j++;
                    }
                    finalEl.append(elArr[j]);
                }

                resArr.append(finalEl.toString());
                if (i != phrArr.length - 1) {
                    resArr.append(" ");
                }
            }
            return resArr.toString();
        }
        return null;
    }

}