/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
        Задача 1.
        Даны два целых положительных числа произвольной длины (стоящие из любого
        количества цифр).
        Например:
        1234567889012345678890123456788901234567889012345678890123456788901234567
        8890123456788901234567889012345678890
        Вывести сумму этих чисел. В решении нельзя использовать BigInteger, Integer.
        Ввод чисел через stdin (standard input). Предусмотреть наличие юнит теста.
        Примеры
        Входные данные
        111
        123
        Выходные данные
        234
 */
package kz.beeline.assignments;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author ASSET
 */
public class Task1 {
    
    public static void main(String args[]){
        
        System.out.println("Enter two numbers to calculate their sum");
        Scanner input = new Scanner(System.in);
        
        //Read two numbers
        String num1 = input.next();
        String num2 = input.next();
        
        //call method for adding        
        addTwoNumbers(num1, num2);        
        
        //
        input.close();
            
        
    }
    
    /**
     * Method for adding two numbers
     * @param num1
     * @param num2
     * @return 
     */
    static String addTwoNumbers(String num1, String num2){
        
        //overflow when sum is greater than 10
        byte overflow = 0;
        
        //add zeros in front a number with less digits
        byte diff = (byte) (num1.length() - num2.length());
        
        if(diff >= 0) num2 = IntStream.range(0, diff).mapToObj(i -> "0").collect(Collectors.joining("")) + num2;
        else num1 = IntStream.range(0, diff * (-1)).mapToObj(i -> "0").collect(Collectors.joining("")) + num1;
        
        System.out.println("num1: " + num1 + ", length: " + num1.length()); //print a sum
        System.out.println("num2: " + num2 + ", length: " + num2.length()); //print a sum        
        
        //StringBuilder for sum. Note: Since we are not using multiple threads using StringBuilder is OK
        StringBuilder sum = new StringBuilder("");
        
        //calculating sum by digits
        for(int i = num1.length()-1; i >=0; i--)
        {
            
            //System.out.println("i: " + i + ") overflow: " + overflow + ", num1.charAt(i): " + num1.charAt(i) + ", num1.charAt(i): " + num2.charAt(i) + ", sumAt(i): " + ((Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i))) % 10 + overflow)); 
            
            sum.insert(0, (((Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i))) % 10 + overflow)));
            overflow =  (byte) ((Character.getNumericValue(num1.charAt(i)) + Character.getNumericValue(num2.charAt(i))) /10);
            
        }
        //handle last overflow
        if (overflow > 0) sum.insert(0,overflow);
        
        //print a sum
        System.out.println("sum: " + sum.toString());
        
        return sum.toString();
    }
    
}
