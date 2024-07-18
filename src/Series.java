import javax.xml.transform.OutputKeys;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

public class Series {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        series23();
    }

    static void series23(){
        int from = -5;
        int to = 10;
        System.out.print("N= ");
        int N = scanner.nextInt();

        double a = 0;
        double b = 0;
        int pos = -1;
        for(int i = 0; i < N; i++){
            double x = from + random.nextDouble() * (to - from);
            System.out.printf("%.2f " , x);
            if (i == 0){
                a = x;
            }
            if (i == 1){
                b = x;
            }
            if (i > 1){
                double c = x;
                if (a < b && b < c || a > b && b > c){
                    if(pos == -1) pos = i - 1;
                }
                a = b;
                b = c;
            }
        }
        System.out.println();
        System.out.println("pos = " + pos);
    }
    static void series19(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int K = 0;
        int prev = -100;
        for(int i = 1; i < N; i++){
            int x = random.nextInt(-10,11);
            System.out.print(" " + x);
            if (prev > x){
                System.out.print("*");
                K = K + 1;
            }
            prev = x;
        }
        System.out.println();
        System.out.println("K = " + K);
    }
    static void series18(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int x = 1;
        boolean first = true;
        int prev = 0;
        for (int i =0; i<N; i++){
            x = x + random.nextInt(2);
            if (x!=prev) {
                System.out.printf(" %d", x);
            }
            prev = x;
        }
        System.out.println();
    }

    static void series17(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("B= ");
        int B = scanner.nextInt();

        double x = -5;
        boolean first = true;
        for (int i =0; i<N; i++){
            x = x + random.nextDouble() * 3 ;
            if(x > B && first){
                first = false;
                System.out.printf(" %d" , B);
            }
            System.out.printf(" %.2f" , x);
        }
        if (first){
            System.out.printf(" %d" , B);
        }
        System.out.println();
    }

    static void series15a() {
        System.out.print("K= ");
        int K = scanner.nextInt();

        int counter = 0;
        int pos = -1;
        boolean first = true;
        while(true){
            int x = random.nextInt(-5, 11);
            if (x == 0){
                break;
            }
            System.out.println(counter + ". x = " + x);
            if (x > K && first){
                pos = counter;
                first = false;
            }
            counter++;
        }
        System.out.println("pos = " + pos);
    }

    static void series15() {
        System.out.print("K= ");
        int K = scanner.nextInt();

        int counter = 0;
        int pos = -1;
        while(true){
            int x = random.nextInt(-5, 11);
            if (x == 0){
                break;
            }
            System.out.println(counter + ". x = " + x);
            if (x > K && pos == -1){
                pos = counter;
            }
            counter++;
        }
        System.out.println("pos = " + pos);
    }


    static void series16() {
        System.out.print("K= ");
        int K = scanner.nextInt();

        int counter = 0;
        int pos = -1;
        while(true){
            int x = random.nextInt(-5, 11);
            if (x == 0){
                break;
            }
            System.out.println(counter + ". x = " + x);
            if (x > K){
                pos = counter;
            }
            counter++;
        }
        System.out.println("pos = " + pos);
    }


    static void series11(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("K= ");
        int K = scanner.nextInt();

        boolean Ok = false;
        for (int i =1; i<N; i++){
            int x = random.nextInt(-5, 11);
            System.out.printf(" x = %3d" , x);
            if (x < K){
                Ok = true;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Ok = " + Ok);
    }
    static void series10(){
        System.out.print("N= ");
        int N = scanner.nextInt();


        boolean Ok = false;
        for (int i =0; i<N; i++){
            int x = random.nextInt(-15, 6);
            System.out.printf(" x = %3d" , x);
            if (x > 0){
                 Ok = true;
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print(" Ok = " + Ok);
    }

    static void series8(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int counter = 0;
        for (int i =0; i<N; i++){
            int x = random.nextInt(-5, 11);
            System.out.printf(" x = %3d" , x);
            if (x%2 == 0){
                System.out.print("*");
                counter = counter + 1;
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("counter = %d\n" , counter);
    }
    static void series5(){//округление
        System.out.print("N= ");
        int N = scanner.nextInt();

        double sum = 0;
        double prod = 1;
        for (int i =0; i<N; i++){

            double x = -5 + random.nextDouble() * 15 ;
            int y = (int)x;
            int z = (int)Math.round(x);
            int v = (int)Math.floor(x);
            int w = (int)Math.ceil(x);
            double frac = x - y;
            System.out.printf(" %7.2f  %2d  %2d  %2d  %2d  %5.2f\n" , x, y, z, v, w, frac);
            sum = sum + y;
            prod = prod * frac;
        }
        System.out.println();
        System.out.printf("sum = %8.2f\n" , sum);
        System.out.printf("prod = %8.15f\n" , prod);
    }
    static void series4(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double sum = 0;
        double prod = 1;
        for (int i =0; i<N; i++){

            double x = -5 + random.nextDouble() * 15 ;
            //System.out.print(" " + x);
            System.out.printf(" %.2f" , x);
            sum = sum + x;
            prod = prod * x;
        }
        System.out.println();
        System.out.printf("sum = %-+8.2f|\n" , sum);
        System.out.printf("prod = %-+8.2f|\n" , prod);
    }
    static void series3(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double sum = 0;
        for (int i = 0; i<N; i++){
            double x = 1 + random.nextDouble() * 10 ;
            System.out.printf(" %.2f" , x);
            sum = sum + x;
        }

        double average = sum / N;

        System.out.println();
        System.out.printf("average = %-+8.2f|\n" , average);
        System.out.printf("sum = %-+8.2f|\n" , sum);
    }

    static void series2(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double prod = 1;
        for (int i = 0; i<N; i++){
            double x = 1 * random.nextDouble() * 15 ;
            System.out.printf(" %.2f" , x);
            prod = prod * x;
        }
        System.out.println();
        System.out.printf("prod = %-+8.2f|\n" , prod);
    }

    static void series1a(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double sum = 0;
        for (int i =0; i<N; i++){

            double x = -5 + random.nextDouble() * 15 ;
            //System.out.print(" " + x);
            System.out.printf(" %.2f" , x);
            sum = sum + x;
        }
        System.out.println();
        System.out.printf("sum = %-+8.2f|\n" , sum);
    }

    static void series1(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double sum = 0;
        for (int i =0; i<N; i++){
            System.out.print("x= ");
            double x = scanner.nextDouble();
            sum = sum + x;
        }
        System.out.println("sum = " + sum);
    }

}