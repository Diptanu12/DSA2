public class PrintAllPermutations {
    public static void main(String[] args) {
String str="abc";
allPermutations(str, "");
    }
    public static void allPermutations(String str, String permu){
       if(str.isEmpty()){
           System.out.println(permu);
           return;
       }

        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            allPermutations(newStr,permu+currChar);
        }
    }
}

