package laba8;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;


public class Tests {
    private String generateString(int length){
        String conclusion;
        Random random = new Random();
        char [] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = (char) (random.nextInt(127) + 1);
        }
        conclusion = new String(result);
        return  conclusion;
    }

    @Test
    void check1() {
        Lines_to_check lines_to_check = new Lines_to_check();
        int result = -1;
        String the_first_string = "qwe";
        String second_string = "rty";
        assertEquals(result, lines_to_check.check(the_first_string, second_string));
    }


    @Test
    void check3(){
        Random random = new Random();
        Lines_to_check lines_to_check = new Lines_to_check();
        for(int i = 0; i < 10000; i ++){
            int the_first_stringI = random.nextInt(77);
            int second_stringI = random.nextInt(7);
            String the_first_string = generateString(the_first_stringI);
            String second_string = generateString(second_stringI);
            int Res = the_first_string.indexOf(second_string);
            assertEquals(Res, lines_to_check.check(the_first_string, second_string));
        }
    }

}
