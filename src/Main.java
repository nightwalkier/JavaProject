import java.util.Scanner;
import java.time.Instant;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while30();
    }
    static void while30(){
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        System.out.print("C = ");
        int C = scanner.nextInt();

        int a = 0;
        while (A >= C){
            a++;
            A = A - C;
        }

       int b = 0;
        while(B >= C){
            b++;
            B = B - C;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int K = 0;
        while(a > 0){
            K = K + b;
            a--;
        }
        System.out.println("K = " + K);
    }
    static void while28(){
        System.out.print("eps = ");
        double eps = scanner.nextDouble();

        double A = 2;
        int K = 1;
        while(true){
            double prev = A;
            System.out.println("A"+K+" = " + A);
            A = 2 + 1/A;
            K++;
            double dA = Math.abs(A - prev);
            if (dA < eps){
                break;
            }
        }
        System.out.println("A"+K+" = " + A);
    }
    static void while27(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        int F1 = 1;
        int F2 = 1;
        int F = 0;
        int counter = 2;
        System.out.println(1 + " " + F1);
        System.out.println(2 + " " + F2);
        while(F < N){
            F = F1 + F2;
            counter ++;
            System.out.println(counter + " " +F);
            F2 = F1;
            F1 = F;
        }
        System.out.println("counter = " + counter);
    }
    static void while26(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        int F1 = 1;
        int F2 = 1;
        int F = 0;
        while(F < N){
            F = F1 + F2;
            System.out.println(F);
            F2 = F1;
            F1 = F;
        }
        int prev = F2;
        int next = F1 + F2;
        System.out.println("prev = " + prev);
        System.out.println("F = " + F);
        System.out.println("next = " + next);
    }
    static void while25(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        int F1 = 1;
        int F2 = 1;
        int F = 0;
        while(F <= N){
            F = F1 + F2;
            System.out.println(F);
            F2 = F1;
            F1 = F;
        }

        System.out.println("F = " + F);
    }

    static void while24(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        int F1 = 1;
        int F2 = 1;
        int F = 0;
        while(F < N){
            F = F1 + F2;
            System.out.println(F);
            F2 = F1;
            F1 = F;
        }

//        boolean ok = false;
//        if (F == N) {
//             ok = true;
//        }
        boolean ok = F == N;
        System.out.println("ok = " + ok);
    }

    static void while23a(){
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();
        A = Math.abs(A);
        B = Math.abs(B);

        int nod = 0;
        if(A == 0 && B == 0){
            nod = 1;
        }
        else if (A == 0 && B != 0){
            nod = B;
        }
        else if(A != 0 && B == 0){
            nod = A;
        }
        else {
            while(A != B){
                if (A>B){
                    A = A - B;
                }
                else {
                    B = B - A;
                }
            }
            nod = A;
        }
        System.out.println("nod = " + nod);
    }
    static void while23(){
        System.out.print("A = ");
        int A = scanner.nextInt();
        System.out.print("B = ");
        int B = scanner.nextInt();


        while (A != B){
            if (A>B){
                A = A - B;
            }
            else {
                B = B - A;
            }
        }
        System.out.println("NOD = " + A);
    }
    static void while22a(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        boolean ok = true;
        int i = 2;
        while(i < N){
            if(N %i == 0){
                ok = false;
                break;
            }
            i++;
        }
        System.out.println("ok = " + ok);
    }
    static void while22(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        boolean ok = true;
        for(int i = 2; i < Math.sqrt(N)+1; i++){
            if(N %i == 0){
                ok = false;
                break;
            }
        }
        System.out.println("ok = " + ok);
    }

    static void while21() {
        System.out.print("N = ");
        int N = scanner.nextInt();

        boolean ok = false;
        while(N > 0) {
            int dig = N%10;
            //System.out.print("dig = " + dig);
            if(dig%2 != 0){
                ok = true;
                break;
            }
            N=N/10;
        }
        System.out.println("   ok = " + ok);
    }
    static void while20(){
        System.out.print("N = ");
        int N = scanner.nextInt();

        boolean ok = false;
        while(N>0) {
            int dig = N%10;
            System.out.println(dig);
            N = N /10;
            if (dig ==2){
                ok = true;
                break;
            }
        }
        System.out.println(ok);
    }
    static void while19(){
        System.out.print("N =");
        int N = scanner.nextInt();

        int sum = 0;
        while(N>0){
            int dig = N%10;
            N = N/10;
            sum = sum * 10 + dig;
            System.out.println(dig);
        }
        System.out.println("sum = " + sum);
    }

    static void while18(){
        System.out.print("N =");
        int N = scanner.nextInt();

        int sum = 0;
        int K = 0;
        while(N>0){
            K++;
            int dig = N%10;
            N = N/10;
            sum = sum + dig;
            System.out.println(dig);
        }
        System.out.println("K = " + K);
        System.out.println("sum = " + sum);
    }
    static void while17(){
        System.out.print("N =");
        int N = scanner.nextInt();

        while(N>0){
            int dig = N%10;
            N = N/10;
            System.out.println(dig+" N = " + N);
        }
    }

    static void while16(){
        System.out.print("day =");
        double day = scanner.nextDouble();
        System.out.print("P =");
        double P = scanner.nextDouble();
        System.out.print("aim =");
        double aim = scanner.nextDouble();

        double dist = 0;
        int K = 0;
        while(dist<aim){
            K++;
            dist = dist + day;
            System.out.println(K+" dist = " + dist + "  day = "+day);
            day = day + day*P/100;
        }
    }

    static void while15(){
        System.out.print("money =");
        double money = scanner.nextDouble();
        System.out.print("P =");
        double P = scanner.nextDouble();

        System.out.print("wish =");
        double wish = scanner.nextDouble();
        int K = 0;
        while(money<wish){
            money=money+money*P/100;
            K++;
            System.out.println(K+" money = " + money);
        }
        System.out.println("K = " + K);
    }

    static void while11() {
        System.out.print(" N = ");
        int N = scanner.nextInt();

        int sum = 0;
        int K = 0;
        while(sum <= N){
            K = K + 1;
            sum = sum + K;
            System.out.println("K = " + K);
        }
        System.out.println("sum = " + sum);
    }
    static void while9(){
        System.out.print(" N = ");
        int N = scanner.nextInt();

        int K = 0;
        int x = 1;
        while(x <= N){
            x = x * 3;
            K = K + 1;
        }
        System.out.println("K = " + K);
    }
    static void while8() {
        System.out.print(" N = ");
        int N = scanner.nextInt();

        int K = 0;
        while(K*K<=N){
            K++;//K=K+1
        }
        K--;
        System.out.println("K = " + K);
    }
    static void while7() {
        System.out.print(" N = ");
        int N = scanner.nextInt();

        int K = 0;
        while(K*K<=N){
            K++;//K=K+1
        }
        System.out.println("K = " + K);
    }
    static void while6(){
        System.out.print(" N = ");
        int N = scanner.nextInt();

        int K = 0;
        double prod = 1;
        while(K<N){
            prod = prod*(N-K);
            K = K+2;
        }
        System.out.println("prod = " + prod);
    }
    //64 = 1*2*2*2*2*2*2
    static void while5(){
        System.out.print(" N = ");
        int N = scanner.nextInt();

        int cnt = 0;
        while(N>1){
            N = N/2;
            cnt++;
        }
        System.out.println("cnt = " + cnt);
    }
    static void while4(){
        System.out.print(" N = ");
        int N = scanner.nextInt();

        double x = 1;//1 = 3^0
        while (x<N){
            x*=3;
        }
        boolean ok = x == N;
        System.out.println("ok = " + ok);
    }
    static void while3(){
        System.out.print(" N = ");
        int N = scanner.nextInt();
        System.out.print(" K = ");
        int K = scanner.nextInt();

        int counter = 0;
        while ( N >= K ){
            N = N-K;
            counter = counter +1;
        }
        System.out.println(" N= " + N);
        System.out.println("counter= " + counter);
    }

    //1 1 2 3 5 8 13 21 ...
    static void for33(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int F1 = 1;
        int F2 = 1;
        int F = 0;
        System.out.println(F1);
        System.out.println(F2);
        for(int i = 3; i<=N; i++){
            F = F1 + F2;
            System.out.println(F);
            F1 = F2;
            F2 = F;
        }
    }
    static void for31(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double A = 0.5;
        for(int i = 0; i < N; i++){
            double x = 11 * A + Math.PI;
            A = x - (int)x;

            System.out.println(A);
        }

    }
}