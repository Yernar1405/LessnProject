package nulls;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) throws IOException {
         FileReader fileReader = new FileReader ("src\\nulls\\input.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line [];
        line = bufferedReader.readLine().split("1");
int res = 0;
        for (int i = 0; i <line.length-1 ; i++) {
if (line[i].length() >= line[i+1].length()){res = line[i].length();}
        }
        System.out.println(res);
    }
}
