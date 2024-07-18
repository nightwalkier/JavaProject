import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Array {
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    public static void main(String[] args){
       // while(true)testDoWhile1();
        z6_85();
    }

    static void z6_85(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        boolean is2 = false;
        boolean is5 = false;
        int n=N;
        int pos2 =-1;
        int pos5 =-1;
        int counter = 0;
        while (n !=0){
            int d = n%10;//взяли последнюю цифру с числа n
            if (d == 2){
                is2 = true;
                pos2 = counter;
            }
            if (d == 5){
                is5 = true;
                pos5 = counter;
            }
            counter++;
            n = n/10;
        }

        if (is2 && is5){
            if (pos2 > pos5){
                System.out.println("2 is more left");
            }else{
                System.out.println("5 is more left");
            }
        }
    }
    static void z6_84(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int Nn=N;
        int min = N%10;
        int minPos = 0;
        int i =0;
        while(N!=0){
            int d = N%10;
            N = N/10;
            if(d<min){
                min=d;
                minPos=i;
            }
            i++;
        }
        N=Nn;
        int max = N%10;
        int maxPos = 0;
        i =0;
        while(N!=0){
            int d = N%10;
            N = N/10;
            if(d>max){
                max=d;
                maxPos=i;
            }
            i++;
        }
        System.out.println("min = " + min);
        System.out.println("minPos = " + minPos);
        System.out.println("max = " + max);
        System.out.println("maxPos = " + maxPos);
        if(maxPos>minPos){
            System.out.println("max Is More Left");
        }else{
            System.out.println("min Is More Left");
        }
    }
static void task1(){
    System.out.print("N= ");
    int N = scanner.nextInt();

    int[]A = new int[N];
    MyLib.fillIntArrayRnd(A);
    MyLib.showIntArray(A);

    MyLib.reverseIntArray(A);

    MyLib.showIntArray(A);
}
    static int getMaxDigit(int N){
        // N: 714862
        int max = N%10;//2 временная
        while(N != 0){
            int digit = N%10;//копируем последнюю цифру из числа N
            N = N/10;// в числе N уничтожили последнюю цифру
            if(digit>max){
                max=digit;
            }
        }
        //тут число N = 0;
        //max уже равен наибольшей цифре из числ N
        return max;
    }
//17394826
    static int getMinDigit(int N){
        int min = N%10;// 2 первый кандидат в минимальную цифру
        while(N != 0){
            int digit = N%10;//копируем последнюю цифру из числа N
            N = N/10;// в числе N уничтожили последнюю цифру
            if(digit<min){
                min=digit;
            }
        }
        //тут число N = 0;
        //min уже равен наименьшей цифре из числ N
        return min;
    }
    static void z6_82(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        // N: 714862
        int max = getMaxDigit(N);
        int min = getMinDigit(N);

        int difference = max-min;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("difference = " + difference);
    }
    static void z6_81(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();

        int cnt1 = countDigit(N, a);
        int cnt2 = countDigit(N, b);

        boolean ans = cnt1<cnt2;

        System.out.println("ans = " + ans);
    }

    static void z7_13a(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        int n=N;
        for(int i= 2; i<=N/2; i++){
            while (n%i==0){
                System.out.println("i = " + i);
                n=n/i;
            }
        }
    }
    static void z7_12(){
        for(int i= 31; i<100; i++){
            int d0 = i%10;
            if(i%3==0 && (d0==2 || d0==4 || d0==8) ){
                System.out.println("i = " + i);
            }
        }

    }

    static void z7_11b(){
        for(int i = 100; i<=999; i++){
            int d0 = i/1%10;
            int d1 = i/10%10;
            int d2 = i/100%10;
            int sum = d0+d1+d2;
            if(i%7==0 && sum%7==0){
                System.out.println("i = " + i);
            }
        }
    }
    static void z7_11a(){
        for(int i = 100; i<=999; i++){
            int i2=i*i;
            if(i2%1000==i) {
                System.out.print("  i = " + i);
                System.out.println("    i2 = " + i2);
            }
        }
    }
    static void z7_10(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        int counter = 0;
        for(int i =10; i<=99; i++){
            if(i%N==0 || i%10==N || i/10==N){
                System.out.println("i= " + i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }

    static void z7_9b(){
        int counter = 0;
        for(int i =10; i<=99; i++){
            int d0 = i/1%10;
            int d1 = i/10%10;
            int sum = d0 + d1;
            sum = sum + sum*sum;
            if (sum == i){
                System.out.println("i= " + i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }
    static void z7_9a(){
        int counter = 0;
        for(int i =10; i<=99; i++){
            int d0 = i/1%10;
            int d1 = i/10%10;
            int sum = d0*d0 + d1*d1;
            if (sum%13==0){
                System.out.println("i= " + i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }
    static void z7_8(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int counter = 0;
        for(int i =100; i<=999; i++){
            int d0 = i/1%10;
            int d1 = i/10%10;
            int d2 = i/100%10;
            int sum = d0+d1+d2;
            if (sum == N){
                System.out.println("i= " + i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }
    static void z7_7(){
        int counter = 0;
        for(int i =100; i<=500; i++){
            int d0 = i/1%10;
            int d1 = i/10%10;
            int d2 = i/100%10;
            int sum = d0+d1+d2;
            if(sum == 15){
                System.out.println("i = " + i);
                counter++;
            }
        }
        System.out.println("counter = " + counter);
    }
    static void z7_1a(){

        for(int i = 102; i<=200; i+=3){
                System.out.print(" " +i);
        }
    }
    static void z7_1(){
        for(int i = 100; i<=200; i++){
            if(i%3==0){
                System.out.print(" " +i);
            }
        }
    }

    static void testDoWhile(){
        int age = 0;
        do{
            System.out.print("age= ");
            age = scanner.nextInt();
        }while (age<0 || age>120);
        System.out.println("age = " + age);
    }
    static void testDoWhile1(){
        int age ;
        while (true){
            System.out.print("age= ");
            age = scanner.nextInt();
            if(0<=age && age<=120)break;
            System.out.println("Wrong age. Try again.");
        }
        System.out.println("age = " + age);
        if(age<13){
            System.out.println("Kid");
        } else if (age<18) {
            System.out.println("Teenager");
        } else if (age<25) {
            System.out.println("Young man");
        } else if (age<=55) {
            System.out.println("Middle age");
        }else if (age <=75){
            System.out.println("55-75");
        }else{
            System.out.println("old");
        }
    }

    static void array20(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        double[]A = new double[N];
        MyLib.fillDblArrayRnd(A);
        MyLib.showDblArray(A);

        System.out.print("K= ");
        int K = scanner.nextInt();
        System.out.print("L= ");
        int L = scanner.nextInt();

        double sum = 0;
        for(int i = K; i <= L; i++){
            System.out.println(A[i]);
            sum = sum + A[i];
        }
        System.out.println("sum = " + sum);
    }
    static void array19(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        int pos = -1;
        for(int i = N - 2; i > 0; i--){
            if(A[0] < A[i] && A[i] < A[N-1]){
                pos = i;
                break;
            }
        }
        System.out.println("pos = " + pos);
    }

    static void array18(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        A[N-1] = -300;
        MyLib.showIntArray(A);

        int pos = -1;
        for(int k = 0; k < A.length; k++){
            //System.out.println("A["+k+"] = " + A[k]);
            if (A[k] < A[N-1]){
                pos = k;
                break;
            }
        }

        System.out.println("pos = " + pos);
        if(pos !=-1) {
            int rez = A[pos];
            System.out.println("rez = " + rez);
        }
    }

    static void array17(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        int i = 0;
        int j = A.length - 1;
        int t = 0;
        while(i <= j){
            if (t == 0) System.out.print(A[i++] + " ");
            if (t == 1) System.out.print(A[i++] + " ");
            if (t == 2) System.out.print(A[j--] + " ");
            if (t == 3) System.out.print(A[j--] + " ");
            t++;
            if (t == 4) t = 0;
        }
    }
    static void array15(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        scanner.nextLine();
        scanner.nextLine();
        for(int i = 1; i < A.length; i+=2){
            System.out.print(A[i] + " ");
        }
        System.out.println();

        int n = (N - 1)/2*2;
        System.out.println("n = " + n);
        for(int i = n; i >=0; i-=2){
            System.out.print(A[i] + " ");
        }
    }

    static void array14(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        for(int i = 0; i < A.length; i+=2){
            System.out.print(A[i] + " ");
        }
        System.out.println();
        for(int i = 1; i < A.length; i+=2){
            System.out.print(A[i] + " ");
        }
    }

    static void array13(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        int n = N/2*2-1;
        for(int i = n; i > 0; i-=2){
            System.out.print(A[i] + " ");
        }
    }

    static void array12(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        for(int i = 0; i < N; i+=2){
            System.out.print(A[i] + " ");
        }
    }

    static void array11a(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);
        System.out.print("K= ");
        int K = scanner.nextInt();

        int i = 0;
        while (i < N/K){
            System.out.println("A["+(i*K)+ "] = " + A[i*K]);
            i++;
        }

    }
    static void array11(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);
        System.out.print("K= ");
        int K = scanner.nextInt();

        for(int i = 0; i < A.length; i+=K){
            System.out.println("A["+i+ "] = " + A[i]);
        }

    }
    static void array10(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){
                System.out.print(A[i] + " ");
            }
        }
        System.out.println();
        for(int i = A.length -1; i >= 0; i--){
            if(A[i] % 2 != 0){
                System.out.print(A[i] + " ");
            }
        }
    }
    static int showIntArrayReverseOdd(int [] A) {
        int N = A.length;
        int K = 0;
        for (int i = N - 1; i >= 0; i--) {
            if(A[i] % 2 == 0) {
                System.out.print(A[i] + " ");
                K++;
            }
        }
        System.out.println();
        return K;
    }
    static void array09(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        int K = showIntArrayReverseOdd(A);
        System.out.println("K = " + K);
    }

    static void array08(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        System.out.println("A[] = " + Arrays.toString(A));

        int K = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i]%2 != 0){
                System.out.println("A[" + i + "] = " + A[i]);
                K++;
            }
        }
        System.out.print("K = " + K);
    }

    static void array07(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[]A = new int[N];
        MyLib.fillIntArrayRnd(A);
        MyLib.showIntArray(A);

        MyLib.showIntArrayReverse(A);
        int[]B = A;
        A[0] = 333;
        System.out.println("B[0] = " + B[0]);
        //int[]C = A.clone();
        int[]C = MyLib.cloneIntArray(A);
        A[1]=777;
        MyLib.showIntArray(A);
        MyLib.showIntArray(C);
        MyLib.showIntArray(B);

    }
    static void array06(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("b= ");
        int b = scanner.nextInt();

        int[] A = new int[N];

        A[0] = a;
        A[1] = b;
        A[2] = a+b;
        for (int i = 3; i < N; i++){
            A[i] = A[i - 1] + A[i - 1];
        }

        System.out.println("A[] = " + Arrays.toString(A));
    }
    static void array05(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[] A = new int[N];

        A[0] = 1;
        A[1] = 1;
        for (int i = 2; i < N; i++){
            A[i] = A[i - 1] + A[i - 2];
        }

        System.out.println("A[] = " + Arrays.toString(A));
    }

    static void array04a(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("D= ");
        int D = scanner.nextInt();

        int[] A = new int[N];

        A[0] = a;
        for (int i = 1; i < N; i++){
            A[i] = A[i - 1] * D;
        }

        System.out.println("A[] = " + Arrays.toString(A));
    }

    static void array04(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("D= ");
        int D = scanner.nextInt();

        int[] A = new int[N];

        int x = a;
        for (int i = 0; i < N; i++){
            A[i] =x;
            x = x * D;
        }
        System.out.println("A[] = " + Arrays.toString(A));
    }

    static void array03(){
        System.out.print("N= ");
        int N = scanner.nextInt();
        System.out.print("a= ");
        int a = scanner.nextInt();
        System.out.print("D= ");
        int D = scanner.nextInt();

//      x = a
//      x = a + D
//      x = a + D + D
//      x = a + D + D + D == a + 3*D;
        int[] A = new int[N];
//        System.out.println("A[] = " + Arrays.toString(A));

        int x = a;
        for (int i = 0; i < N; i++){
            A[i] =x;
            x = x + D;
        }
        System.out.println("A[] = " + Arrays.toString(A));

    }
    static void array02(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[] A = new int[N+1];
        System.out.println("A[] = " + Arrays.toString(A));

        int x = 1;
        for (int i = 0; i < A.length; i++){
            A[i] = x;
            x = x * 2;
        }
        System.out.println("A[] = " + Arrays.toString(A));

    }
    static void array01(){
        System.out.print("N= ");
        int N = scanner.nextInt();

        int[] A = new int[N];
        System.out.println("A[] = " + Arrays.toString(A));

        int x = 1;
        for (int i = 0; i < A.length; i++){
            A[i] = x;
            x = x + 2;
        }
        System.out.println("A[] = " + Arrays.toString(A));

    }

    static int countDigit(int N, int D ){
        if(N==0 && D==0) return 1;
        int counter = 0;
        while(N!=0){
            int digit = N % 10;//взяли последнюю цифру числа N
            N=N/10;//убрали в числе N последнюю цифру
            if (digit == D) counter++ ;
        }
        return counter ;
    }


}
