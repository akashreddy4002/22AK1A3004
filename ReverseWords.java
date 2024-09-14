public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World";
        System.out.println(reverseWords(input));
    }

    public static String reverseWords(String str) {
        StringBuilder result = new StringBuilder();
        for (String word : str.split(" ")) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
    }
}