import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class reverse {
    public static void main(String[] args) throws IOException, NumberFormatException {
        String input, reverse = "";
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a word: ");
        input = BR.readLine().toLowerCase();
        System.out.println(input);
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        System.out.println(reverse);
    }
}
