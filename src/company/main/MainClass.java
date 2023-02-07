package company.main;

import company.Arithemetic.ArithemeticOperations;

import javax.script.ScriptException;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) throws ScriptException {
        Scanner sc = new Scanner(System.in);
        String qtNumber;
        // choose question
        for(int i=0;i<37;i++){
            System.out.println("Choose a question number from the following questions: ");
            System.out.println("1_Question, Easy mode: ");
            System.out.println("2_Question, Hard mode: ");
            System.out.println("3_Question, Timer: ");
            qtNumber = sc.next();
            switch(qtNumber) {
                case "1":
                    ArithemeticOperations.question_1();
                    break;
                case "2":
                    ArithemeticOperations.question_2();
                    break;
                default:
                    System.out.println("Choose from 4- and 5- one question:");
                    qtNumber = sc.next();
                    switch(qtNumber) {
                        case "4":
                            ArithemeticOperations.question_3(10);
                            break;
                        default:
                    }
            }
        }

    }
}
