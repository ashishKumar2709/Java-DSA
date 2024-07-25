package components;

import java.util.Scanner;

public class UserInput{
    public int ReadNumInput(){
    int num=0;
       try (Scanner sc = new Scanner(System.in)) {
        num = sc.nextInt();
       } catch (NumberFormatException e) {
        e.printStackTrace();
       }
       return num;
    };
}