public class XO {
    public static boolean getXO (String str) {
        int xc = 0;
        int oc = 0;
        String myStr = str.toLowerCase();
        String[] strArr = myStr.split("");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equals("x")) {
                xc++;
            } else if (strArr[i].equals("o")) {
                oc++;
            }
        }

        if (xc != oc) {
            return false;
        } return true;


    }
}