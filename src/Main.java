import java.util.Scanner;

import static java.awt.AWTEventMulticaster.add;

public class Main {

    static int divisible(int number){
        int evenCounter = 0;
        int num_remainder = number;
        while(num_remainder > 0){
            int digit = num_remainder %10;
            if(digit !=0 && number % digit == 0){
                evenCounter = evenCounter+1;
            }
            num_remainder /= 10;
        }

        return evenCounter;

    }





    //q52) reverse a number
    void reverse(int n){
        int temp = 0;
        while(n > 0){
            int d = n % 10;
            temp = temp*10 + d;
            n /=10;
        }
        System.out.println("after reversing  = "+ temp);
    }



    //q51) sum of this series -> 1/1 + 1/2 + 1/3 .... 1/n;
    double sumOfSeries1(int n){
        double s= 0;
        for(int i=1; i<=n; i++){
            s += 1/i;
        }
        return s;
    }


    //50) sum of the series , 1 2 3 ... n;
    int sumOfSeries(int n){
        int s = 0;
        for(int i=1; i<=n; i++){
            s += i;
        }
        return s;
    }


    //q49)
    int funn(int a, int b, int c){
        for( c=4; c<=8; c++){
            a = (a+11)+b;
            a = (c+3)+b;
        }
        b = (5+10)+a;
        a = (10+8)+a;
        for( c=2; c<=5; c++){
            a = (10+2)&a;
            b = (3+4) + a;
        }
        return a+b;
    }


    //q48) factorial
    int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact *i;
        }
        return fact;
    }



    //q47) abs
    int abs(int num){
        if(num < 0)
            num = num*-1;
        return num;
    }


    // q46) add two number
    static int add(int a , int b){
        return a+b;
    }

    //47) area of rectangle
    int aor(int l, int b){
        return  2*(l+b);
    }

    //q48) area of circle
    double aoc(double r){
        return 3.14*r*r;
    }






    public static void main(String[] args) {

                // *** function  start***

        //q46) syntax
                System.out.println(add(5, 6));


                // *** function  end***


        //q45)
//        int c = 12, b= 4;
//        int a = c/b;
//        c = b>>a;
//        System.out.println(c); // 0


        //q44)
//        int x = 4, y = 8;
//        do{
//            System.out.println(x);  // 4 13
//            x = x+y+1;
//        }
//        while(x < 15);


        //q43)
//        int n =1, value = 32;
//        while( value >= n){
//            value = value >> 1;
//        }
//        System.out.println(value); // 0


        //q42)
//        int b=0, c=0;
//        for(int a=1; a<=5; a++){
//            System.out.println(c); // 0 1 3 6 10
//            b = b+1;
//            c = c+b;
//        }

        //q41)
//        int b = 4;
//        int c = 5;
//        int a = 0;
//        for(a=2; a<=4; a++){
//            System.out.println(c);  //5 8 10
//            b = b-1;
//            c = c+b;
//        }


        //q40)
//        int a=7, b=6, c=5;
//        b = a+b;
//        if((b+c)<(c-b) && 2<a)
//            c = 11+a;
//        c= (b+a)+a;
//        if((a&9) < b)
//            b = (a&a)+c;
//        System.out.println("a+b+c = "+ (a+b+c)); // 68


        //q39)
//        int p=4, q=2, r=8;
//        for(r=5; r<=6; r++){
//            p = (r+r)^r;
//            q = (8+3)+p;
//        }
//        for(r=5; r<=8; r++){
//            p = 4+r;
//            p = 1+q;
//        }
//        System.out.println("p+q = "+ (p+q)); //43


        //q38)
//        int p=5, q=2,r=5;
//        for(r=5; r<=6; r++){
//            p = (r+7)+r;
//            if((r+q)> (q-r)){
//                q = (p+r)+q;
//                continue;
//            }
//        }
//        System.out.println("p+q = "+ (p+q)); //68



        // q36)
//        int a =1, b=5, c=7;
//        if((c+b)<(a+c)){
//            b = a+b;
//        }
//        else{
//            if((c+9+b)< (6+c))
//                c = (3+8)+c;
//        }
//        System.out.println("a+b+c = "+ (a+b+c));


        //q35)
//        int p = 1;
//        int q = 5;
//        int r = 7;
//        if((3+p) < (q+3)){
//            if((r+q+8) < (q+p+r))
//                r = (3 + 30)+r;
//            r = (q+1)+q;
//        }
//        else{
//            if((r+q)<(p+r))
//                q = 12+q;
//            else
//                r = q+p;
//            r = (p+q)+r;
//        }
//        r = r+r;
//        System.out.println("p+q+r = "+ (p+q+r));//28


        //  *** control statements  starts***

        //q34) sum of digit of a number
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        while(n > 0){
//            int d = n % 10;
//            n /= 10;
//            sum += d;
//        }
//        System.out.println("sum 0f digit = "+ sum);

        //q33)  how many digit occur in a number

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int digit = sc.nextInt();
//        int count = 0;
//        while(n > 0){
//            int d = n % 10;
//            n /= 10;
//            if( d == digit){
//                count++;
//            }
//        }
//        System.out.println("count = " + count);


        //q32) find a digit into a number
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int digit = sc.nextInt();
//        boolean found = false;
//        while(n > 0){
//            int d = n % 10;
//            n /= 10;
//            if( d == digit){
//                found = true;
//                break;
//            }
//        }
//        if(found)
//            System.out.println("True digit found");
//        else
//            System.out.println("digit not found");

        //q31) fibonacci series

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int prev = 0;
//        int next = 1;
//        int sum = 0;
//        System.out.println(prev);
//        System.out.println(next);
//        int i=1;
//        while(i++ <= n-2){
//            sum = prev + next;
//            System.out.println(sum);
//            prev = next;
//            next = sum;
//
//        }



        //q30) prime check
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=2; i<n; i++){
//            if(n % i == 0){
//                System.out.println("not a prime");
//                break;
//            }
//        }
//        System.out.println("prime ");


        //q29) print all odd
//        for(int i=0; i<10; i++){
//            if(i % 2 == 0 )
//                continue;
//            System.out.println(i);
//        }



        //q28) use of continue

//        for(int i=0; i<10; i++){
//            if(i == 3)
//                continue;  //skip all statements below it
//            System.out.println(i);
//        }

        //q27) use of break;
//        for(int i=0; i<10; i++){
//            if( i == 5)
//                break;
//            System.out.println(i);
//        }




        //q26) palindrome check of a number
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        int n = num;
//        int b = 0;
//        while(n > 0){
//            int d = n % 10;
//            b = b*10 + d;
//            n /= 10;
//        }
//
//        if(b == num)
//            System.out.println("palindrome");
//        else
//            System.out.println("not a palindrome");


        //q25) armstrong number
        //153 = 1 5 3,  sum of cube of all digit
//        Scanner sc = new Scanner(System.in);
//        int num  = sc.nextInt();
//        int n = num;
//        int b = 0;
//        while(n > 0){
//            int d = n % 10;
//            b = b + (d*d*d);
//
//            n /= 10;
//        }
//
//        if(b == num)
//            System.out.println("armstrong number");
//        else
//            System.out.println("not a armstrong number");



        //q24)
//        int p = 4,  q = 2, r = 5;
//        p = (q + p ) + p;
//        if( (q+p) < (r-q) && (3>p)){
//            p = (q+r) + p;
//            if((p+r) + (r+q) > (p+r+q))
//                r = q+p;
//            else
//                r = (p+r)+p;
//
//            p = (q&r) + q;
//        }
//        else{
//            q &= r;
//            if((q-5) < (5-q)) {
//                r = (6 + 6) & q;
//                q = (q + 7) + r;
//            }
//            p = (1^11) + q;
//        }
//        System.out.println("p + q + r = "+ (p+q+r));//24

        //q23)  1^1  + 2^2 + 3^3
//        Scanner sc = new Scanner(System.in);
//        int sum  = 0;
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            sum += i*i;
//        }
//        System.out.println("sum = "+ sum);



        //q22) factorial
//        Scanner sc = new Scanner(System.in);
//        int fact  = 1;
//        int n = sc.nextInt();
//        for(int i = n; i>=1; i--){
//            fact *= i;
//        }
//        System.out.println("fact = "+ fact);


        //21) sum of the series

//        Scanner sc = new Scanner(System.in);
//        int sum  = 0;
//        int n = sc.nextInt();
//        for(int i = 1; i<=n; i++){
//            sum += i;
//        }
//        System.out.println("Sum = "+ sum);


        //q20)
//        int x = 1;
//        while(x <= 10){
//            System.out.println(x);
//            x++;
//        }

        //q19)
//        int x = 1;
//        do{
//            System.out.println(x);
//            x++;
//        }
//        while(x <= 10);


        //q18)

//        for(int x = 1; x <= 10; x++){
//            System.out.println(x);
//        }

        //q17)
//        int p = 8, q =4, r = 5;
//        if((r + q) < (q - r) ||( p > q))
//            q = (q & 8) & r;
//
//        System.out.println("P + q + r = "+ (p + q + r));//13

        //q16)
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            switch(x){
//                case 1:
//                    System.out.println(a+b);
//                    break;
//                case 2:
//                    System.out.println(a-b);
//                    break;
//                case 3:
//                    System.out.println(a*b);
//                    break;
//                case 4:
//                    System.out.println(a/b);
//                    break;
//                default:
//                    System.out.println("wrong selection");
//
//            }


        //q15)
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//
//        switch (x) {
//            case 1:
//                System.out.println("ONE");
//                break;
//            case 2:
//                System.out.println("TWO");
//                break;
//            case 3:
//                System.out.println("THREE");
//                break;
//            default:
//                System.out.println("WRONG");
//
//        }



        //q14)
//        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        if (x > 0 && y > 0){
//            System.out.println("first coordinate");
//        }
//        else if(x < 0 && y > 0){
//            System.out.println("second coordinate");
//        }
//        else if(x < 0 && y < 0 ){
//            System.out.println("third coordinate");
//        }
//        else if(x > 0 && y < 0){
//            System.out.println("fourth coordinate");
//        }
//        else{
//            System.out.println("origin");
//        }


        //q13)
//        Scanner sc = new Scanner(System.in);
//        int cn = sc.nextInt();
//        int cd = sc.nextInt();
//        int pm = sc.nextInt();
//        int dmbs = sc.nextInt();
//        int m1 = sc.nextInt();
//
//        double per = (cn + cd + pm + dmbs + m1)/5;
//
//        if(per >= 90)
//            System.out.println("A+");
//        else if(per >= 80)
//            System.out.println("A");
//        else if(per >= 70)
//            System.out.println("B+");
//        else if(per >= 60)
//            System.out.println("B");
//        else if(per >= 50)
//            System.out.println("C");
//        else
//            System.out.println("D");

        //12)
//        Scanner sc = new Scanner(System.in);
//        String uid = sc.nextLine();
//        String pass = sc.nextLine();
//        if(uid.equals("admin") && pass.equals("admin"))
//            System.out.println("Welcome");
//        else
//            System.out.println("wrong password or user id");

        //q11) mix
//        int p = 9, q = 7, r = 9;
//
//        p = (1 + 5) & p;
//        p = p + p;
//        p = (3 + 9)^ q;
//        r = 3 + p;
//        System.out.println("p + q + r = "+ (p + q + r)); // 32



        //q10)
//        Scanner sc =  new Scanner(System.in);
//        String uid = sc.nextLine();
//        String pass = sc.nextLine();
//        if(uid.equals("admin")){
//            if(pass.equals("admin"))
//                System.out.println("Welcome");
//            else
//                System.out.println("wrong password");
//        }
//        else{
//            System.out.println(" wrong uid");
//        }


        //q9)
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        if( a > b )
//            System.out.println("a is greater");
//        else
//            System.out.println("b is greater");


        //q8)
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        if(a % 2 == 0)
//            System.out.println("a is even");
//        else
//            System.out.println("a is odd");



            // *** control statement end ***

        //q7)
//        int a = 20;
//        int b = 40;
//        int c = 20;
//        a = a+b;
//        c = c+a;
//        a = a+c;
//        c = c+a;
//        System.out.println("a + b + c = "+ ( a + b + c)); // 400


        //q6) what will be the output?
//         int x = 2;
//         int y = 24;
//         int z = 2;
//         z = (x ^ z) ^ x;
//         y = y % 2;
//        System.out.println("x + y + z = "+ (x + y + z)); // 4


        //q5)
//        int pp = 2;
//        int qq = 9;
//        int rr = 5;
//        pp = (pp & rr) + pp;
//        rr = rr + rr;
//        rr = (rr + rr) & rr;
//        System.out.println(" pp + qq + rr = "+ (pp + qq + rr));




        //q4)

//        int a = 15;
//        int b = 7;
//        a = a % (a-3) ;
//        b = b % (b*3);
//        a = a % 1;
//        b = b % 1;
//        System.out.println("a + b = " + (a + b));


        //q3) xor, ||, &&
//        int a = 8;
//        int b = 51;
//        int c = 2;
//        c = (a^b)^a;
//        a = b % 4;
//        System.out.println("a + b + c = "+ (a+b+c));





        /*
        //q2) write pseudo code to swap two numbers using a temprory variable and without temp

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("before swapping");
        System.out.println("x = "+ x + " y = "+ y);
        int temp = y;
        y = x;
        x = temp;
        System.out.println("after swapping");
        System.out.println("x = "+ x + " y = "+ y);

        //without a temproray variable

        x = x+y;
        y = x-y;
        x = x-y;
        //or here can use xor operator to swap

        */


        /*
        //q1 print x +y
        int x = 3;
        int y = 5;
        //increment x
        x++;
        y = x+y;
        y++;
        x = y*2;
        System.out.println("x+y: " + x+y);

         */
    }
}