/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
*  Задача 3
       Алиса и Боб играют в игру «Пять в ряд» на поле 10 × 10. По очереди они ставят
       крестики и нолики, по одному за раз. Алиса ставит крестики, Боб — нолики.
       В текущей партии они совершили некоторое количество ходов, и теперь ход Алисы. Ей
       интересно, может ли она поставить крестик так, чтобы сразу победить.
       Алиса побеждает, когда какие-либо крестики на поле образуют линию длины не
       меньше 5. Линия может быть горизонтальной, вертикальной или диагональной.Ввод чисел через stdin (standard input). Предусмотреть наличие юнит теста.
       Входные данные
       Задана матрица 10 × 10 (10 строк по 10 символов в каждой) с крестиками,
       обозначаемыми заглавными латинскими буквами 'X', ноликами — буквами 'O' и
       пустыми клетками — символами '.'. Количество крестиков равно количеству ноликов, и
       существует хотя бы один крестик и нолик. Существует хотя бы одна пустая клетка.
       Гарантируется, что в текущей расстановке никто еще не достиг победы.
       Выходные данные
       Выведите 'YES', если Алиса может победить в один ход, поставить крестик в какуюлибо свободную клетку. В противном случае выведите 'NO'.
 */
package kz.beeline.assignments;

import java.util.Arrays;
import java.util.HashMap;

/**
 *
 * @author ASSET
 */
public class Task3 {
    
    static final int ROWS = 10;
    static final int COLS = 10;
    // 2d array
    static String [][] sField = new String [ROWS][COLS];
    
    static int conseq = 4;
    static String result = "NO";
        
    //Map to store reating sysmbols
    static HashMap<String, Integer> cntSymbols = new HashMap<String, Integer>();
    
    public static void main(String args[]){
        //fill with dots
        initFieldWithDots();
        //init with previous moves. Switch to various inits
        initSample2();        
        //show the grid
        showMatrix();
        //scan for result
        result = Scan();
        System.out.println("Result: " + result);
        
    }    
    
    /**
     * initialize field wit dots "."
     */
    static void initFieldWithDots(){
        // put values into the sField
        for(int i=0; i<ROWS; i++) {
            for(int j=0; j<COLS; j++) {
                    sField[i][j] = ".";
            }
        }
    }
    
    /**
     * setting Alice's and Bob's previous moves. 
     * Sample 1
     */
    static void initSample1(){
        // put values into the sField
        sField[0][0] = "X";
        sField[0][1] = "X";
        sField[0][3] = "X";
        sField[0][4] = "X";
        
        sField[1][5] = "O";
        sField[1][6] = "O";
        sField[1][7] = "O";
        sField[1][8] = "O";
    }
    /**
     * setting Alice's and Bob's previous moves. 
     * Sample 2
     */
    static void initSample2(){
        // put values into the sField
        sField[0][0] = "X";
        sField[0][1] = "X";
        sField[0][3] = "O";
        sField[0][4] = "X";
        sField[0][5] = "X";
        
        sField[1][5] = "O";
        sField[1][6] = "O";
        sField[1][7] = ".";
        sField[1][8] = "O";
    }
    /**
     * setting Alice's and Bob's previous moves. 
     * Sample 3
     */
    static void initSample3(){
        // put values into the sField
        sField[3][6] = "X";
        sField[4][6] = "X";
        sField[5][6] = "X";
        sField[6][6] = "X";
        sField[7][6] = ".";
        
        sField[1][5] = "O";
        sField[1][6] = "O";
        sField[1][7] = ".";
        sField[1][8] = "O";
    }
    /**
     * setting Alice's and Bob's previous moves. 
     * Sample 4
     */
    static void initSample4(){
        // put values into the sField
        sField[5][4] = "X";
        sField[4][5] = ".";
        sField[3][6] = "X";
        sField[2][7] = "X";
        sField[1][8] = "X";
        
        sField[1][5] = "O";
        sField[1][6] = "O";
        sField[1][7] = ".";        
    }
    
    static void showMatrix()
    {
        // retrieve all values of game field using foreach
        String sGameField = "Game field: \n";
        for (String [] row : sField) 
        {
            for (String val : row) 
            {
                sGameField += " " + val;
            }
            sGameField += "\n";
        }
            System.out.println(sGameField);
    }
    
    /**
     * Scanning for Alice"s winning move
     */
    static String Scan(){
        boolean flag = false;
        for(int i=0; i<ROWS; i++) {
            for(int j=0; j<COLS; j++) {
                if(sField[i][j].equals("X")){
                    //horizontal scan
                    if(j<=5)ScanX(i,j);
                    //vertical scan
                    if(i<=5)ScanY(i,j);
                    //diagonal scan
                    ScanD(i, j);
                }
            }
        }
        return result;
    }
    /**
     * Horizontal scan
     * @param x
     * @param y 
     */
    static void ScanX(int x, int y){
        
        cntSymbols.clear();

        for (int i = 1; i <= 4; ++i) 
        {
            String item = sField[x][y+i];
            //System.out.println("item:" + item);
            countSymbols(item);
        }
        
        checkYESorNO();        
    }
    
    /**
     * Vertical scan
     * @param x
     * @param y 
     */
    static void ScanY(int x, int y){   
        cntSymbols.clear();
        
        for (int i = 1; i <= 4; ++i) 
        {
            String item = sField[x+i][y];
            countSymbols(item);
        }        
        
        checkYESorNO();
    }
    
    /**
     * Diagonal scan
     * @param x
     * @param y 
     */
    static void ScanD(int x, int y){
        
        
        //4 possible case for diagonal
        if(x<=5 && y<=5)
        {
            cntSymbols.clear();
            for (int i = 1; i <= 4; ++i) 
            {
                String item = sField[x+i][y+i];
                countSymbols(item);            
            }    
            
            checkYESorNO();
        }
            
        if(x>=4 && y>=4)
        {
            cntSymbols.clear();
            for (int i = 1; i <= 4; ++i) 
            {
                String item = sField[x-i][y-i];
                countSymbols(item);            
            }    
            checkYESorNO();
        }
        
        if(x>=4 && y<=5)
        {
            cntSymbols.clear();
            for (int i = 1; i <= 4; ++i) 
            {
                String item = sField[x-i][y+i];
                countSymbols(item);            
            }        
            
            checkYESorNO();
        }
        
        if(x<=5 && y>=4)
        {
            cntSymbols.clear();
            for (int i = 1; i <= 4; ++i) 
            {
                String item = sField[x+i][y-i];
                countSymbols(item);            
            }  
            
            checkYESorNO();
        }
    }
    
    /**
     * sets value for key where key is repeating symbol
     * @param item 
     */
    static void countSymbols(String item){
        
        if (cntSymbols.containsKey(item))
                cntSymbols.put(item, cntSymbols.get(item) + 1);
        else
            cntSymbols.put(item, 1);
        
    }
    /**
     * If there are 3-'X' and no 'O' then result is YES
     */
    static void checkYESorNO(){
        /*
        System.out.print("X:" + cntSymbols.get("X"));
        System.out.print(",O:" + cntSymbols.get("O"));
        System.out.print(",.:" + cntSymbols.get(".") + "\n");
        */
        if(cntSymbols.get("O") == null && cntSymbols.get(".") == 1 && cntSymbols.get("X") ==3){
            result = "YES";
            return;
        }                    
    }
}
