import java.util.Arrays;

public class StringFormater {
    public String format(String input){
        String[] words = input.split("\\s");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            // capitalize the first letter, append the rest of the word, and add a space
            result.append(Character.toTitleCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }
        return result.toString().trim();

    }
    public String format(String input, int repeat){
        String result = "";
        for(int i=0; i<repeat; i++){
            result = result + input;
        }
        return result;
    }
    public String format(String input, String prefix, String suffix){
        String result = prefix + input + suffix ;
        return result;
    }
    public static void main(String[] args){
        StringFormater S = new StringFormater();
        System.out.println(S.format("hello world"));
        System.out.println(S.format("Hello", 3));
        System.out.println(S.format("Ben", "<-", "->"));

    }
}
