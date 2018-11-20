package com.company;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Main {
    public static  void  main(String[] args)
    {
        /*
        int [] sumNumber = sumTwoNumbers((a, b) -> a + b);

        for (int i : sumNumber){
            //System.out.println(i);
        }
        System.out.println("-------");
        */
        bubbleSort();

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

    static void bubbleSort(){
        int [] masNum = new int[] {3, 4, 10, 22, 200, 6, 22};

        for(int i = 0; i < masNum.length; i++){
            for (int j = 0; j < masNum.length; j++){
                if (masNum[i] < masNum[j])
                {
                    int swap = masNum[i];
                    masNum[i] = masNum[j];
                    masNum[j] = swap;
                }
            }
        }

        for (int n : masNum){
            System.out.println(n);
        }
    }

}
