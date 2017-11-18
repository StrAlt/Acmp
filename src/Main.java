import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int v,t,x;
        Scanner sc= new Scanner(System.in);
        //  PrintWriter pw = new PrintWriter(new File("output.txt"));
        v=sc.nextInt(); t=sc.nextInt();
        if (v>0) {
            if (v*t>=109) x = Math.abs((v * t) + 1) % 109; else x=v*t+1;
            if (x==0) x=109;
             System.out.println(x);
        } else if (v==0 || t==0 ) System.out.println(1); else if (v<0) {
            if (Math.abs(v*t)>=109) {x=Math.abs((v * t) + 1) % 109; x=109-x;} else x=109+(v*t+1);
            System.out.println(x);}
        // pw.close();
    }

    }
