import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        int line=1;
        while(scan.hasNextLine()){
            String s= scan.nextLine();
            System.out.println(line + " " + s);
            line++;
        }
    }
}
