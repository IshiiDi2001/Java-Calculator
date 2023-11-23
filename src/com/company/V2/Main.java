package com.company.V2;

public class Main {
    public static void main(String[] args) {

        //Check whether the argument is not null or null
        if (args.length == 0){
            System.out.println("Please provide the operation as an argument");
            return;
        }

        String operator = args[0];

        //Check for invalid arguments
        if (!(operator.equals("Add") || operator.equals("Sub") || operator.equals("Mul") || operator.equals("Div"))) {
            System.out.println("Please provide Add, Sub, Mul or Div as the operation argument.");
            return;
        }

        System.out.println(args[0]);
    }
}
