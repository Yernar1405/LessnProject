package arrows;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Check {
    public static void main(String[] args) throws IOException {
        File file = new File("src\\arrows\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String arrows = bufferedReader.readLine();
        int res = 0;
        char arrow[] = arrows.toCharArray();
        for (int i = 0; i <= arrow.length - 5; i++) {
            if (arrow[i] == '>' && arrow[i + 1] == '>' && arrow[i + 2] == '-' && arrow[i + 3] == '-' && arrow[i + 4] == '>'
                    || arrow[i] == '<' && arrow[i + 1] == '-' && arrow[i + 2] == '-' && arrow[i + 3] == '<' && arrow[i + 4] == '<') {
                res++;
            }
        }
        System.out.println(res);

        int res2 = 0;


        for (int i = 0; i <= arrows.length() - 5; i++) {
            String o = arrows.substring(i, i + 5);
            String a = ">>-->";
            String b = "<--<<";
            if (o.equals(a) || o.equals(b)) {
                res2++;
            }
        }
        System.out.println(res2);
    }
    }

