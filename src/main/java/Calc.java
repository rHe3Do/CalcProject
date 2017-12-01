import java.util.Scanner;
/**
 * Created by user on 29.11.2017.
 */
public class Calc {
    public static void main(String[] args){
        double num1, num2, result;
        char oper;
        Calc c = new Calc();
        num1 = c.GetNumber();
        num2 = c.GetNumber();
        oper = c.GetOper();
        result = c.MathOper(num1, num2, oper);
        System.out.println("Результат операции:" + " " + result);
    }

    public double GetNumber(){
        Scanner get = new Scanner(System.in);
        double n;
        System.out.println("Введите число");
        do {
            while (!get.hasNextDouble()||!get.hasNext()) {
                System.out.println("Ввод некорректен, повторите ввод");
                get.next();
            }
        } while (!get.hasNextDouble());
        n = get.nextDouble();
        return n;
    }

    public char GetOper(){
        Scanner geto = new Scanner(System.in);
        char o;
        System.out.println("Введите операцию(поддерживаются '+' '-' '*' '/')");
        while (!geto.hasNext("[-+*/]")){
            System.out.println("Вы ввели неподдерживаемую операцию, повторите ввод");
            geto.next();
        }
        o = geto.next().charAt(0);
        return o;
    }

    public double MathOper(double ch1, double ch2, char op){
        double rez = 0;
        String oper = Character.toString(op);
        if (oper.equals("+")){
            rez = ch1 + ch2;
        }
        else if (oper.equals("-")){
            rez = ch1 - ch2;
        }
        else if (oper.equals("*")){
            rez = ch1*ch2;
        }
        else if (oper.equals("/")){
            rez = ch1/ch2;
        }
        return rez;
    }
}
