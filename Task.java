import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Task {
    public static void pingFun(String input){
        try{
            Process pr = Runtime.getRuntime().exec(input);
            BufferedReader stream = new BufferedReader(new InputStreamReader(pr.getInputStream()));
            String str = "";

            while((str = stream.readLine()) != null) System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        pingFun("ping " + input);
    }
}