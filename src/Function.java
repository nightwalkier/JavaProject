import java.util.Random;
import java.util.Scanner;

public class Function {

static Scanner scanner = new Scanner(System.in);
static Random random = new Random();

public static void main(String[] args) {
    //testBloodCombinations();
    proc37();
}

    static void proc37(){
        System.out.print(" n = ");
        int n = scanner.nextInt();

        System.out.println("getIntegral("+n+") = " + getIntegral(n));
    }

    static double fun(double x){
        return x*x - 4*x + x*3/x;
    }

    static double getIntegral(int N){
        double from = 2;
        double to = 5;
        double step = (to - from)/ N;
        System.out.println("step = " + step);

        double S = 0;
        double x = from;
        for (int i=0; i<N; i++){
            S = S + step * fun(x);
            x = x + step;
        }
        return S;
    }

    static void proc36(){
        System.out.print( " N = ");
        int N = scanner.nextInt();

        int fact = MyLib.getFib(N);
        System.out.println("\nfact = " + fact);

    }

    static void proc35(){
        System.out.print( " N = ");
        double N = scanner.nextDouble();

        double fact = MyLib.fact2 (N);
        System.out.println("\nfact = " + fact);

    }
    static void proc34(){
        System.out.print( " N = ");
        int N = scanner.nextInt();

        double fact = MyLib.fact (N);
        System.out.println("\nfact = " + fact);

    }


    static void proc33(){
        System.out.print( " rad = ");
        double rad = scanner.nextDouble();
        double degree = MyLib.radToDag(rad);
        System.out.println("degree = " + degree);
    }

    static void proc32(){
        System.out.print( " degree = ");
        double degree = scanner.nextDouble();
        double rad = MyLib.degToRad(degree);
        System.out.println("rad = " + rad);
    }

    static void proc31(){
        System.out.print(" n = ");
        int n = scanner.nextInt();

        boolean palindrome = MyLib.IsPalindrom(n);
        System.out.println("palindrome = " + palindrome);
    }


    static void proc26(){
        System.out.print(" n = ");
        int n = scanner.nextInt();

        int cnt = 0;
        for(int k=0; k<=n; k++){
            boolean square = MyLib.IsPower5(k);
            if(square){
                System.out.print(" " + k);
                cnt++;
            }
        }
        System.out.println();
        System.out.println("\ncnt = " + cnt);
    }
    static void testBloodCombinations(){
        for(int r =1; r<=4; r++){
            for(int d =1; d<=4; d++){
                boolean ok =MyLib.IsBloodFit(r, d);
                if (ok){
                    System.out.println(" for "+ r + " fits "+d);
                }
            }
        }
    }
    static void proc25a(){
        System.out.print(" n = ");
        int n = scanner.nextInt();

        int sumTax = 0;
        for(int k=0; k<=n; k++){
            double payment = 500 + random.nextDouble()*50000;
            System.out.print("payment = " + payment);
            double tax = MyLib.calcTax(payment);
            System.out.println("  tax = " + tax);
            sumTax += tax;
        }
        System.out.println();
        System.out.println("\nsumTax = " + sumTax);
    }
    static void proc25(){
        System.out.print(" n = ");
        int n = scanner.nextInt();

        int cnt = 0;
        for(int k=0; k<=n; k++){
            boolean square = MyLib.IsSquare(k);
            //System.out.println("  square = " + square);
            if(square){
                System.out.print(" " + k);
                cnt++;
            }
        }
        System.out.println();
        System.out.println("\ncnt = " + cnt);
    }
    static void proc24(){
        System.out.print(" n = ");
        int n = scanner.nextInt();

        int cnt = 0;
        for (int i=0; i<n; i++){
            int x = MyLib.getRndInt(1, 100);
            System.out.print(" " + x);
            if (MyLib.isEven(x)){
                cnt++;
            }

        }

        System.out.println("\ncnt = " + cnt);
    }

    static void proc23(){
        System.out.print( " x = ");
        double x = scanner.nextDouble();
        System.out.print( " y = ");
        double y = scanner.nextDouble();

        int quarter = MyLib.getQuarter(x, y);

        System.out.println("quarter = " + quarter);
    }

    static void proc22(){
        System.out.print( " a = ");
        double a = scanner.nextDouble();
        System.out.print( " b = ");
        double b = scanner.nextDouble();
        System.out.print(" op (+, - ,* , /) = ");
        char op = scanner.next().charAt(0);

        double ans = MyLib.calc(a, b, op);

        System.out.println("ans = " + ans);
    }

static double getRingArea(double R , double r){
    double S = getCircleS(R);
    double s = getCircleS(r);
    return Math.abs(S - s);
}

static int getSumOfRange(int start, int finish){
    int sum = 0;
    for(int i = start; i <= finish; i++){
        sum = sum +i;
    }
    return sum;
}

static void proc21(){
    System.out.print("a=");
    int a = scanner.nextInt();
    System.out.print("b=");
    int b = scanner.nextInt();

    int sum = getSumOfRange(a, b);

    System.out.println("sum = " + sum);
}

static double getTrainglePerim(double a, double h){
    double b = Math.sqrt((a/2) * (a/2) + h*h);
    return a + b + b ;
}

static void proc_20(){
    System.out.print("a=");
    double a = scanner.nextDouble();
    System.out.print("h=");
    double h = scanner.nextDouble();

    double trainglePerim = getTrainglePerim(a, h);

    System.out.println("trainglePerim = " + trainglePerim);
}
static void proc_19(){
    System.out.print("R=");
    double R = scanner.nextDouble();
    System.out.print("r=");
    double r = scanner.nextDouble();

    double RingArea = getRingArea(R,r);

    System.out.println("RingArea = " + RingArea);
}

static double getCircleS(double R){
    return Math.PI * R*R;
}

static void proc_18() {
    System.out.print("R=");
    double R = scanner.nextDouble();
    double Circle_S = getCircleS(R);

    System.out.println("getCircleS = " + Circle_S);
}


static int getRootsCount(double a, double b, double c){
    double d = b*b - 4*a*c;
    if (d<0) return 0;
    if (d==0) return 1;
    return 2;
}

static void proc_17(){
    System.out.print( " a = ");
    double a = scanner.nextDouble();
    System.out.print( " b = ");
    double b = scanner.nextDouble();
    System.out.print( " c = ");
    double c = scanner.nextDouble();

    int roots_count = getRootsCount(a, b, c);

    System.out.println("roots_count = " + roots_count);
}

static int getSign(double x){
    if (x<0) return -1;
    if (x>0) return  1;
    return 0;
}

static void proc16a(){
    System.out.print( " a = ");
    double a = scanner.nextDouble();
    System.out.print( " b = ");
    double b = scanner.nextDouble();

    int sum = getSign(a) + getSign(b);

    System.out.println("sum = " + sum);
}

static void proc16(){
    System.out.print( " a = ");
    double a = scanner.nextDouble();
    System.out.print( " b = ");
    double b = scanner.nextDouble();

    int sign_a = getSign(a);
    int sign_b = getSign(b);
    int sum = sign_a + sign_b;

    System.out.println("sum = " + sum);
}

}




