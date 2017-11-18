
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //FileReader fr = new FileReader("input.txt");
      //  FileWriter fw = new FileWriter(new File("output.txt"));



        }

       // fw.close();


    }

class JavaArraySort {

    public static void main(String[] args) throws IOException {
        int R, N, i;


        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        N = sc.nextInt();
        int arr[] = new int[N];
        for (i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        //сортируем массив чисел
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

    }
}