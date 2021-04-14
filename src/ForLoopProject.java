import java.util.Scanner;
//Q : 1 = print any 10 numbers between given/user input range
public class ForLoopProject {   // instance method with parameters
    public void printAnyNumbers(int a, int b)
    {
        System.out.println("Range between " + a + " and " + b + " is :");
        // applying condition to find value between a and b
        for (int i = a; i <= b && i <= a + 10; i++)
        {
            System.out.print(i + " ");
        }
    }

    //Q : 2 = print the sequence Fibonacci number - limitation is n
    // instance method with parameters
    public void fibonacciNumber(int n)
    {   // declaring instance variable
        int n1 = 0;
        int n2 = 1;
        // Printing heading
        System.out.println("Fibonacci number sequence is as follows:");
        // applying condition to find sequence Fibonacci number
        for (int i = 1; i <= n; i++)
        {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
            System.out.print(n1 + " + ");
            // when i = 1, it will check 1<=5 , it is yes, so it will go in bracket
            // sum = n1=0 + n2=1 so                                                     sum = 1
            // n1 = n2 so n2 has old value of 1 so now                                   n1 = 1
            // n2 = sum so now sum becomes 1 so                                          n2 = 1
            // sout will print value of n1 so it will                       print 1
            // now i = 1 goes to iteration and will add 1 so i becomes 2
            // when i = 2, it will check 2<=5, yes, so it will go in bracket
            // sum = 1+1 = 2                                                            sum = 2
            // n1 becomes n2 so                                                          n1 = 1
            // and n2 becomes sum so                                                     n2 = 2
            // sout will print value of n1 so it will                       print 1
            // now i = 2 goes to iteration and add 1 so i becomes 3
            // when i = 3, it will check 3<=5, yes, so it will go in bracket
            // sum = 1+2 = 3                                                            sum = 3
            // now n1 becomes n2                                                         n1 = 2
            // and n2 becomes sum so                                                     n2 = 3
            // sout will print value of n1 so it will                       print 2
            // now i = 3 goes to iteration and add 1 so i becomes 4
            // when i = 4, it will check 4<=5,yes, so it will go in bracket
            // sum = 2+3 = 5                                                            sum = 5
            // now n1 becomes n2 so                                                      n1 = 3
            // and n2 becomes sum so                                                     n2 = 5
            // sout will print value of n1 so it will                        print 3
            // and so on......
        }
    }

    //Q : 3 to check whether input number is prime or not
    // created instance method
    public void primeOrNot(int d)
    {   // declaring variable
        int temp =0;
        // loop to check weather the d is divisible by any number
        for (int i = 2; i <=d-1; i++)
        {
            if (d % i == 0) //if d number is divisible by any other number than it is not prime number
            {
                temp = temp + 1;
            }
        }
        if(temp==0) //if this condition is true number than number is prime number
        {
            System.out.println(d + " is Prime Number");
        }
        else
        {
            System.out.println(d+ " is not Prime Number");
        }
    }

    //Q : 4 reverse a number using for loop
    // created instance method
    public void reverseNumber(int e)
    { // declaring variable
        int reverse = 0;
        // applying condition to find reverse value
        for (; e != 0; e = e / 10) // if e is not 0 then we will divide by 10
        {
            int remainder = e % 10; // finding remainder
            reverse = reverse * 10 + remainder; // finding reverse by multiplying with 10
        }
        System.out.println("Reverse number of the given number is:- ");
        System.out.println(reverse);
    }

    //Q : 5 finding factorial of a number entered by user
    // created instance method
    public void factorialNumber(int f)
    {   // declaring variable
        long fact = 1;
        // applying condition to find factorial number
        for (int i = 1; i <= f; i++)
        {
            fact = fact * i; // multiplying fact with i during each iteration
        }
        System.out.println("Factorial of " + f + " is:- ");
        System.out.println(fact);
    }

    //Q : 6 display the sum of n natural number
    // declaring variable
    int sum = 0;

    // created instance method
    public void sumOfNaturalNumber(int g)
    {
        // applying condition to find sum of g number
        for (int i = 1; i <= g; i++)
        {
            sum = sum + i;  // adding value of i into variable sum
        }
        System.out.println("Sum of natural number " + g + " is:- ");
        System.out.println(sum);
    }

    //Q : 7 making calculator using the switch statement
    // created instance method with parameters
    public void calculator(double h, double k, char symbol) {// applying switch condition -  after entering two numbers, it should give result as per symbol which
        // user enter
        switch (symbol) {
            case '+': // if user add + symbol than output should be addition
                System.out.println("Addition of " + h + " and " + k + " is:- ");
                System.out.println(h + k);
                break;
            case '-':
                System.out.println("Subtraction of " + h + " and " + k + " is:- ");
                System.out.println(h - k);
                break;
            case '*':
                System.out.println("Multiplication of " + h + " and " + k + " is:- ");
                System.out.println(h * k);
                break;
            case '/':
                System.out.println("Division of " + h + " and " + k + " is:- ");
                System.out.println(h / k);
                break;
            case '%':
                System.out.println("Percentage of " + h + " is:- ");
                System.out.println(h * k / 100);
                break;
            default:
                System.out.println("Please Enter Valid Symbol");
                break;
        }
    }

    //Q : 8 prints the sum of n ranging from 1 to 20
    // declaring variable
    int sum1 = 0;
    // created instance method
    public void sumOfX(int l)
    {// applying condition to print sum of n number ranging from 1 to 20
        for (int i = 1; i <= l; i++)
        {
            if (l > 20) // if number is more than 20 than sum should not be printed
            {
                System.out.println("Please Enter range between 1 to 20");
                break;
            } else
                sum1 = sum1 + i;
        }
        System.out.println("Sum of " + l + " is:- ");
        System.out.println(sum1);
    }

    //Q : 9 print the numbers between 1 t0 100 which can be divided by 3 and 5 respectively
    // Created instance method without parameters and scanner
    public void dividedByNumbers()
    {   // title for print
        System.out.println("Divided by 3:- ");
        // applying condition to check number between 1 to 100 which can be divided by 3 and 5
        for (int i = 1; i < 100; i++)
        {
            if (i % 3 == 0) // if this condition satisfies, number will be printed
                System.out.print(i + " , ");
        }
        //title for print
        System.out.println("\nDivided by 5:- "); // used \n to print text in next line
        for (int i = 1; i < 100; i++)
        {
            if (i % 5 == 0) // if this condition satisfied, number will be printed
                System.out.print(i + " , ");
        }
    }

    //Q : 10 print Multiplication table for any number
    // created instance method
    public void multiplicationTable(int m)
    {// applying condition to print multiplication table for m number
        for (int i = m; i <= m; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    //Q : 11 enter any String and count total number of 'a' in that String
    // created instance method
    public void countAInString(String p)
    {
        System.out.println("Character\tFrequency");
        // applying condition to find character a from any string
        int count = 0;
        for (int i = 0; i < p.length(); i++)
        {
            if (p.charAt(i) == 'a')
                count++;
        }
        System.out.println('a' + " \t         " + count);
    }

//Q : 12 sum of numbers between a and b which are divisible by 9
    // created instance method
    public void sumOfNumbersAndDivisibleBy9(int q, int r)
    {   // declaring variable
        int sum = 0;
        System.out.println("Numbers between " + q + " and " + r + " which are divisible by 9 as follows:- ");
        // applying condition for number q to number r
        for (int i = q; i <= r; i++)
        {// if it is divisible by 9 than it will store and print
            if (i % 9 == 0)
            {
                System.out.print(i + " , ");
                // total number stored which are divisible by 9 will add here
                sum = sum + i;
            }
        }
        System.out.println("\nTotal of above numbers is:- ");
        System.out.println(sum);
    }

    // Q : 13 find minimum and maximum number from 3 numbers which user enters
    // created instance method
    public void minAndMaximumFrom3Numbers(int s, int t, int u)
    {   // applying condition for find out maximum number from 3 numbers
        if (s >= t && s >= u)
        {
            System.out.println(s + " is the maximum number");
        } else if (t >= s && t >= u)
        {
            System.out.println(t + " is the maximum number");
        } else
            {
            System.out.println(u + " is the maximum number");
        }
        // applying condition for find out minimum number from 3 numbers
        if (s <= t && s <= u)
        {
            System.out.println(s + " is the smallest number");
        } else if (t <= s && t <= u)
        {
            System.out.println(t + " is the smallest number");
        } else
            {
            System.out.println(u + " is the smallest number");
        }
    }

    //Q : 14 find the average and sum between two numbers which user enters
    // created instance method
    public void averageAndSumBetween2Numbers(int v, int w)
    {   // declaring variable
        int sum = 0;
        double rangeCount = 0; // to get average we need to find total count between range so here we will minus variable v from variable w
        // applying condition to count from v to w and then average of it
        for (int i = v; i <= w; i++)
        {
            sum = sum + i;
            rangeCount = w - v + 1; // added one to equalize count
        }
        System.out.println("Sum between " + v + " and " + w + " is:- ");
        System.out.println(sum);
        System.out.println("Average between " + v + " and " + w + " is:- ");
        System.out.println(sum / rangeCount);
    }

    // Q :15 print the triangular where as per user input
    // created instance method
    public void triangularPattern(int x)
    {   // declaring variable
        int sum = 0;
        // applying condition to print triangular pattern
        for (int i = 0; i <= x; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // main method
    public static void main(String[] args)
    {   // using scanner method
        Scanner scanner = new Scanner(System.in);
//        // called class in main method and created object
        ForLoopProject object = new ForLoopProject();
        System.out.println("Ans : 1 - Print 10 numbers between user/given input range ");
        System.out.println("Please Enter Your First Number:- ");
        int a = scanner.nextInt();
        System.out.println("Please Enter Your Second Number:- ");
        int b = scanner.nextInt();
       // called instance method via object
        object.printAnyNumbers(a,b);

        System.out.println(); // only used for space between two answers
        System.out.println("\nAns : 2 - Print the sequence of Fibonacci number");
        System.out.println("Please Enter your number:- ");
        int n = scanner.nextInt();
        object.fibonacciNumber(n);

        System.out.println(); // only used for space between two answers
        System.out.println("\nAns : 3 - Find Input number is prime or not ");
        System.out.println("Please Enter your number:- ");
        int d = scanner.nextInt();
        object.primeOrNot(d);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 4 - Print Reverse of the entered number");
        System.out.println("Please Enter your number:- ");
        int e = scanner.nextInt();
        object.reverseNumber(e);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 5 - Find factorial number of number entered by user");
        System.out.println("Please Enter your number:- ");
        int f = scanner.nextInt();
        object.factorialNumber(f);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 6 - Display sum of entered natural number");
        System.out.println("Please Enter your number:- ");
        int g = scanner.nextInt();
        object.sumOfNaturalNumber(g);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 7 - Making Calculator");
        System.out.println("Please Enter your first number:- ");
        double h = scanner.nextDouble();
        System.out.println("Please Enter your second number:- ");
        double k = scanner.nextDouble();
        System.out.println("Please Enter operator from (+,-,*,/,%) :- ");
        char symbol = scanner.next().charAt(0);
        object.calculator(h,k,symbol);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 8 - Prints the sum of number entered by user between the range of 1 to 20");
        System.out.println("Please Enter your number :-");
        int l = scanner.nextInt();
        object.sumOfX(l);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans :9 - Print the numbers between 1 to 100 which can be divided by 3 & 5 respectively");
        object.dividedByNumbers();

        System.out.println(); // only used for space between two answers
        System.out.println("\nAns :10 - Print Multiplication table for entered number");
        System.out.println("Please Enter your number to print multiplication table:- ");
        int m = scanner.nextInt();
        scanner.nextLine();
        object.multiplicationTable(m);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans :11 - Enter any String and count total number of 'a' in that String");
        System.out.println("Please Type any word or sentence:- ");
        String p = scanner.nextLine();
        object.countAInString(p);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans :12 - Find sum of numbers between range which are divisible by 9");
        System.out.println("Please Enter your first number:- ");
        int q = scanner.nextInt();
        System.out.println("Please Enter your second number:- ");
        int r = scanner.nextInt();
        object.sumOfNumbersAndDivisibleBy9(q, r);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 13 - Find Min & Maximum number from 3 numbers which user enters");
        System.out.println("Please Enter your first number:- ");
        int s = scanner.nextInt();
        System.out.println("Please Enter your second number:- ");
        int t = scanner.nextInt();
        System.out.println("Please Enter your third number:- ");
        int u = scanner.nextInt();
        object.minAndMaximumFrom3Numbers(s, t, u);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans : 14 - Find an average and sum between two numbers which user enters");
        System.out.println("Please Enter your first Number:- ");
        int v = scanner.nextInt();
        System.out.println("Please Enter your second number:- ");
        int w = scanner.nextInt();
        object.averageAndSumBetween2Numbers(v, w);

        System.out.println(); // only used for space between two answers
        System.out.println("Ans :15 - Print the triangular pattern");
        System.out.println("Please Enter your number:- ");
        int x = scanner.nextInt();
        object.triangularPattern(x);
    }
}
