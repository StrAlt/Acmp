
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        int l,w,h,x;
        //FileReader fr = new FileReader("input.txt");
      //  FileWriter fw = new FileWriter(new File("output.txt"));
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt(); w=sc.nextInt(); h=sc.nextInt();
        x=2*(l*h+w*h);
        if (x>=16) {
            x=x/16;
        } else if (x<16 && x>0) x=1;
        System.out.println(Math.(x));
       // fw.close();


    }
}
