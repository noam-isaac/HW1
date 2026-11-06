public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String argument : args) {
            if (argument.isEmpty()) {
                continue;
            }
            char firstCharacter = argument.charAt(0);
            if (firstCharacter % 5 == 0) {
                System.out.println(firstCharacter);
            }
        }
    }
}
