package com.company.V2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {

        //Check whether the argument is not null or null
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        //Check for invalid arguments
        if (!(operator.equals("Add") || operator.equals("Sub") || operator.equals("Mul") || operator.equals("Div"))) {
            System.out.println("Please provide Add, Sub, Mul or Div as the operation argument.");
            return;
        }

        //read the numbers from text file
        List<String> numbersStr = Files.readAllLines(
                Paths.get("C:/Users/ishini dimani/Desktop/Calculator 2/Numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStr.get(0));
        double number2 = Double.parseDouble(numbersStr.get(1));

        double result = 0;
        if (operator.equals("Add")) {
            result = number1 + number2;
        } else if (operator.equals("Sub")) {
            result = number1 - number2;
        } else if (operator.equals("Mul")) {
            result = number1 * number2;
        }


        System.out.println("The result is " + result);
    }
}
