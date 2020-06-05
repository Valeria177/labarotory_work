package laba8;

public class Correctness {
    public static void main(String[] args){
        Lines_to_check lines_to_check = new Lines_to_check();
        String the_first_string = lines_to_check.first_srt();
        String second_string = lines_to_check.second_str();
        int inside = lines_to_check.check(the_first_string,second_string );

        if (inside == -1){
            System.out.println("Not successful");
        }
        else
        {
            System.out.format("Successful", inside);
        }

    }
}

