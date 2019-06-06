import java.util.HashSet;

//Prints the first character that repeats
public class firstRepeatCharacter {

    public static void main(String[]args){
        String s = "ABCD EFGHIJKLM NOPA";
        System.out.println(characterPrint(s));

    }

    public static String characterPrint(String list){
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<list.length();i++){
            if(set.contains(list.charAt(i))){
                return String.valueOf(list.charAt(i));
            }else{
                set.add(list.charAt(i));
            }
        }
        return null;
    }
}
