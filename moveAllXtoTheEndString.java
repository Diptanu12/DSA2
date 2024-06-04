public class moveAllXtoTheEndString {
    public static void main(String[] args) {
        String str = "abxcdxxf";
        moveAllX(str, 0, 0, "");
    }

    public static void moveAllX(String str, int idx, int count, String newStr) {

        if (idx == str.length()) {
            StringBuilder newStrBuilder = new StringBuilder(newStr);
            for (int i = 0; i<count; i++){
                newStrBuilder.append('x');
            }
            newStr = newStrBuilder.toString();
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newStr);

        } else {
            newStr += currChar;
            moveAllX(str, idx + 1, count, newStr);
        }
    }
}
