package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Model m=new Model();
        Controller c=new Controller();
        View view=new View();
        m.x=scan.nextInt();
        m.y=scan.nextInt();
        m.n = scan.next().charAt(0);
        int result;
        double result1;
        if(m.n == 43) { // ASCII number of "+" is 43
            result = c.summ(m.x, m.y);
            view.display(result);
        }
        else if(m.n == 45){ // ASCII number of "-" is 45
            result = c.subtraction(m.x, m.y);
            view.display(result);
        }
        else if(m.n == 42){ // ASCII number of "*" is 42
            result = c.multiplication(m.x, m.y);
            view.display(result);
        }
        else if(m.n == 47){ // ASCII number of "/" is 47
            result1 = c.division(m.x, m.y);
            view.display1(result1);
        }
    }
}
