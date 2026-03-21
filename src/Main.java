
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
    public static void main(String[] args) {






        //1. count substring
        //2. good or bad string
        //3 kitchen time table
        //name reduction
        //alternating string


        //q3)





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