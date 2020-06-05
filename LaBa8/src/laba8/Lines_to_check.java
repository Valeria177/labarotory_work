package laba8;

import java.util.Random;

public class Lines_to_check {
    public int check(String the_first_string, String second_string) {
        int inside = the_first_string.indexOf(second_string);
        return inside;
    }

    public String first_srt() {
        String conclusion;
        Random random = new Random();
        int length = random.nextInt(77);
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = (char) (random.nextInt(128));
        }
        conclusion = new String(result);
        return conclusion;
    }

    public String second_str() {
        String conclusion;
        Random random = new Random();
        int length = random.nextInt(37);
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = (char) (random.nextInt(128));
        }
        conclusion = new String(result);
        return conclusion;
    }

}
