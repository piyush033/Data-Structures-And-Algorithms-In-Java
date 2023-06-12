import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        
        ArrayList<String> res = ArrayList<String> gss(str);
        System.out.println(res);

    }

    public static ArrayList<String> gss(String str) {
        if(str.length == 0){
            ArrayList<String> bros = new ArrayList<>();
            System.out.println(bros);
        }
        char ch = str.charAt(0);
        String ros = str.substring();
        
        ArrayList<String> rres = ArrayList<String> gss(ros);
        
        ArrayList<String> mres = new ArrayList<>();
        
        for(String rnd : rres){
            mres.add("" +  rnd);
        }
        
        for(String rnd : rres){
            mres.add(ch + rnd);
        }
        return mres;
    }

}
