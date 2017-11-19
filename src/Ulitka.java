import java.io.IOException;
import java.util.Scanner;

public class Ulitka {
    public static void main(String[] args) throws IOException {
        int h,a,b,x=0;
        Scanner sc= new Scanner(System.in);
        //  PrintWriter pw = new PrintWriter(new File("output.txt"));
       h=sc.nextInt(); a=sc.nextInt(); b=sc.nextInt();

       for (int i=0;i<1000;i++){
           x+=a;
           if (x>=h) {
               System.out.println(i+1);
               break;
           }
           x-=b;
       }

        // pw.close();
    }
}
