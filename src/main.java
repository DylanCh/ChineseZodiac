/**
 * Created by Hanjun Chen on 2/15/18.
 */
import com.*;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("What's birth year?");
        try {
            System.out.println(new Handler().get_ChineseZodiac(Integer.parseInt(s.next())).name);
        }
        catch (NumberFormatException e){
            System.out.println("Your birth year's format is wrong");
        }
    }
}
