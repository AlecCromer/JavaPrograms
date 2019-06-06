public class LongestEvenWord {

    public static void main(String[] args){
        String[] array = {"hi","I'm","paul", "lets", "go", "have", "some", "fun"};
        String[] array2 = {};
        System.out.println(longestEven(array2));
    }

    /*
    Given a string array, print out the longest even string.
    If multiple are the same length, print the first longest
     */
    public static String longestEven(String[] array){
        if(array.length == 0) return null;

        String longestEvenWord = "";


        for(String item : array){
           if(item.length() %2 == 0 && item.length()>longestEvenWord.length()){
               longestEvenWord = item;
           }
        }
        return longestEvenWord;
    }
}
