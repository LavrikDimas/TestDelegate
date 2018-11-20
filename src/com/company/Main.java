package com.company;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static  void  main(String[] args)
    {
        int [] sumNumber = sumTwoNumbers((a, b) -> a + b);

        for (int i : sumNumber){
            System.out.println(i);
        }
    }

    static int [] sumTwoNumbers(FunctInterfaces functInterfaces)
    {
        int [] num1 = {1, 2, 3, 4, 5, 6};
        int [] num2 = {1, 22, 3, 5, 6, 90};

        int returnSum [] = new int[num1.length];

        for (int i = 0; i < num1.length; i++){
            returnSum[i] = functInterfaces.sumSometing(num1[i], num2[i]);
        }

        return returnSum;
    }

}
