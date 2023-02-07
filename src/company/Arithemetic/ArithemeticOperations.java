package company.Arithemetic;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Random;
import java.util.Scanner;

public class ArithemeticOperations {

    private static Random rand = new Random();


    public static void question_1() throws ScriptException {
        Scanner sc = new Scanner(System.in);
        int randomNum1 = rand.nextInt(10) + 1;
        int randomNum2 = rand.nextInt(10) + 1;
        int randomOper = rand.nextInt(2);
        int oprResult;
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        Integer result;
        String operand;
        if(randomOper == 0){
            oprResult = randomNum1 - randomNum2;
            operand = "-";
            result = (Integer)engine.eval("4*5");
        }else{
            oprResult = randomNum1 + randomNum2;
            operand = "+";
            result = (Integer)engine.eval("4*5");
        }
        System.out.println(randomNum1 +"."+randomNum2+"="+result);
        System.out.println("Choose the right operator from the following operators '+','-' ");
        String response = sc.next();
        if(operand.equals(response)){
            System.out.println("Your response is correct");
        }else{
            System.out.println("Your response is not correct");
            System.out.println("The correct answer is: " + operand);
        }
    }

    public static void question_2(){

        Scanner sc = new Scanner(System.in);
        int randomNum1 = rand.nextInt(20) + 1;
        int randomNum2 = rand.nextInt(20) + 1;
        int randomNum3 = rand.nextInt(20) + 1;
        int randomOper1 = rand.nextInt(4);
        int randomOper2 = rand.nextInt(4);
        String[] operators = {"+","-","*","/"};
        float oprResult = calcule(calcule(randomNum1,randomNum2,operators[randomOper1]),randomNum3,operators[randomOper2]);
        System.out.println(randomNum1 +"."+randomNum2+"."+randomNum3+"="+oprResult);
        System.out.println("Choose two right operators from the following operators '+','-','*','/' ");
        String response1 = sc.next();
        String response2 = sc.next();

        if(operators[randomOper1].equals(response1) && operators[randomOper2].equals(response2)){
            System.out.println("Your response is correct");
        }else{
            System.out.println("Your response is not correct");
            System.out.println("The correct answer is: " + operators[randomOper1] + " followed by " + operators[randomOper2]);
        }
    }

    public static float calcule(float nmb1,int nmb2, String operator){
        float Oper;
        switch(operator) {
            case "+":
                Oper = nmb1 + nmb2;
                break;
            case "-":
                Oper = nmb1 - nmb2;
                break;
            case "/":
                Oper = nmb1 / nmb2;
                break;
            default:
                Oper = nmb1 * nmb2;
        }

        return Oper;
    }

    public static void question_3(int seconds){
        long start = System.currentTimeMillis();
        long end = start + (seconds)*1000; //  seconds * 1000 ms/sec
        for (int i = 0;i<100000000;){

            i++;

            if(System.currentTimeMillis() >= end) break;
        }
    }
}
