import java.io.*;
import java.util.*;

public class JavaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)>0? "Yes": "No");
        System.out.println(combine(A)+ " " + combine(B));
    }
    public static String combine(String c){
    if(c==null || c.length()==0){
        return " ";
    }else{
        return c.substring(0,1).toUpperCase()+c.substring(1);
    }
}

}



