import java.util.Random;
import java.util.Scanner;

public class MyLib {
    static Scanner scanner = new Scanner(System.in);
    static Random r = new Random();
    static int getSign(double x){
        if (x<0) return -1;
        if (x>0) return  1;
        return 0;
    }

    static int getRootsCount(double a, double b, double c){
        double d = b*b - 4*a*c;
        if (d<0) return 0;
        if (d==0) return 1;
        return 2;
    }

    static double getRndDbl(double rangeMin, double rangeMax){
        double randomValue = rangeMin + (rangeMax - rangeMin) * r.nextDouble();
        return randomValue;
    }

    static int getRndInt(int rangeMin, int rangeMax){
        int randomValue = rangeMin + r.nextInt(rangeMax - rangeMin);
        return randomValue;
    }

    static void kubic(){
        while (true){
            int randomValue = 1 + r.nextInt(6);
            System.out.print("random Value = " + randomValue);
            scanner.nextLine();
        }
    }

    static double getCircleArea(double R){
        return Math.PI * R * R;
    }

    static double calc(double a, double b, char op){
        switch (op){
            case '-': return a - b;
            case '*': return a * b;
            case '/': return a / b;
            case '+': return a + b;
            default: return 0;
        }
    }
    static int getQuarter(double x, double y){
        if (x>0 && y>0) return 1;
        if (x<0 && y>0) return 2;
        if (x<0 && y<0) return 3;
        if (x>0 && y<0) return 4;
        return 0;
    }

//    static boolean isEven(int k){
//        if (k % 2 == 0){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }

//    static boolean isEven(int k){
//        boolean even = false;
//        if (k % 2 == 0){
//            even = true;
//        }
//        else{
//            even = false;
//        }
//        return even;
//    }

//    static boolean isEven(int k){
//        if (k % 2 == 0) return true;
//        return false;
//    }

    static boolean isEven(int k){
        return k % 2 == 0;
    }

    static boolean IsSquare(int k) {
       if(k < 0)return false ;
       int p = 0;
        while(p * p < k){
            p++;
        }
        return p * p == k;
    }

    static double calcTax(double payment){
        if(payment <= 1000) return 0;
        if(payment <= 2000) return payment * 0.1;
        if(payment <= 4000) return payment * 0.2;
        if(payment <= 10000) return payment * 0.3;
        return payment * 0.4;
    }
    static boolean IsBloodFit(int rec,int donor){
        if(rec == 4) return true;
        if (rec == 3 && (donor == 3 || donor == 1)) return true;
        if (rec == 2 && (donor == 2 || donor == 1)) return true;
        if (rec == 1 && donor == 1 ) return true;
        return false;
    }

    static boolean IsPower5(int k){
        return true ;
    }

    static int getReverseNumber(int k){//123 =>321
        int sum = 0;
        while (k != 0){
            int d = k%10;
            sum = sum * 10 + d;
            k = k/10;
        }
        return sum;
    }
    static int getDigitsSum(int k){//123
        int sum = 0;
        while (k != 0){
            int d = k%10;//3 2 1
            //System.out.println("k = " + k + "d = " + d);
            sum = sum + d;
            k = k/10;//12 1 0
            //System.out.println("k = " + k);
        }
        return sum;
    }
    static boolean IsPalindrom(int K){
        if(K < 0) return false ;
        int k = getReverseNumber(K);
        return k == K ;
    }
    static double degToRad(double deg){
        return deg * Math.PI / 180;
    }

    static double radToDag(double rad){
        return rad /Math.PI * 180;
    }

    static double fact(int N){
        if(N <0)return 0;
        int K = 1;
        for(int i = 1; i <= N; i++){
            K = K * i;
        }
        return K;
    }

    static double fact2(double N) {
        if(N <0)return 0;
        int K = 1;
        if (N % 2 == 0) {
            for (int i = 2; i <= N; i+=2) {
                K = K * i;
            }
        }else{
            for (int i = 1; i <= N; i+=2) {
                K = K * i;
            }
        }
        return K;
    }

    static int getFib(int N){
        if(N <=0)return 0;
        if(N == 1 || N == 2)return 1;

        int F1 = 1;
        int F2 = 1;
        int F = 0;
        for(int i = 3; i <= N; i++){
            F = F1 + F2;
            F1 = F2;
            F2 = F;
        }
        return F;
    }

    static void fillIntArrayRnd(int[] A){
        int N = A.length;
        for(int i =0; i < N; i++){
            A[i] = getRndInt(-5,11);
        }
    }

    static void fillDblArrayRnd(double[] A){
        int N = A.length;
        for(int i =0; i < N; i++){
            A[i] = getRndDbl(-5,11);
        }
    }

    static void showDblArray(double [] A){
        int N = A.length;
        for(int i = 0; i < N; i++){
            System.out.printf("%.2f ",A[i] );
        }
        System.out.println();
    }

    static void showIntArray(int [] A){
        int N = A.length;
        for(int i = 0; i < N; i++){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static void showIntArrayReverse(int [] A){
        int N = A.length;
        for(int i = N - 1; i >= 0; i--){
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    static int[] cloneIntArray(int [] A) {
        int N = A.length;
        int[] B = new int[N];
        for (int i = 0; i < N; i++) {
            B[i] = A[i];
        }
        return B;
    }
    static void reverseIntArray(int[] A){
        int N = A.length;
        int i = 0;
        int j = N-1;
        while(i < j){
            int tmp = A[i];
            A[i]=A[j];
            A[j]=tmp;
            i++;
            j--;
        }
    }

}









