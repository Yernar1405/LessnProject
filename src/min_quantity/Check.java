package min_quantity;

import java.io.*;

public class Check {
    public static void main(String[] args) {
        File file = new File("src\\min_quantity\\input.txt");
        BufferedReader bufferedReader = null;
        String input = "";
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            input = bufferedReader.readLine();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        int res = 0;
        String result="";
        int max = 0;
        int count = 0;
        String countTemp = "";
        int resultcount=0;
        for (int i = 1; i < input.length(); i++) {
            count = 0;
            String tempStr = input.substring(0, i);
            for (int j = 0; j < input.length(); j += i) {
                if (j + i < input.length()) {
                    countTemp = input.substring(j, j + i);
                    if (tempStr.equals(countTemp)) {
                        count++;
                        if (count > 1 && count>max) {
                            max = count;
                            resultcount=i;
                        }
                    }
                    else{break;}

                }
            }
        }
        System.out.println("countmax=" + max +", result="+resultcount);
        result=""+resultcount;
    }
}
