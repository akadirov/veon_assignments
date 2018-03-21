/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
*      Задача 2.
       Дано целое положительное число не превышающее Integer. Посчитать сумму всех его
       цифр.
       В решении нельзя использовать цикл и работу со строками.
       Ввод чисел через stdin (standard input). Предусмотреть наличие юнит теста.
       Примеры
       Входные данные
       123
       Выходные данные
       6
 */
package kz.beeline.assignments;

import java.util.Scanner;

/**
 *
 * @author ASSET
 */
public class Task2 {
    
    public static void main(String args[]) throws java.io.IOException 
    {
        System.out.println("Enter a number to sum up all digits:");
        Scanner input = new Scanner(System.in);
        
        //Read a number
        int num1 = input.nextInt();       
        
        //call method for summing up   
                    
        //print result
        System.out.println("sum : " + SumUp(num1)); 
        //
        input.close();
    }
    
    /**
     * Recursive method for summing up all digits
     * @param n
     * @return 
     */
    static int SumUp(int n) 
    {
        return n == 0 ? 0 : n % 10 + SumUp(n/10);
    }
}
