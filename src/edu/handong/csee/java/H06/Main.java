package edu.handong.csee.java.H06;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main stepH = new Main();
        stepH.h06();
    }

    void h06() {
      Scanner s = new Scanner(System.in);
      int[] number = new int[5];
      int[][] pow_value = new int[5][5];
      int max, min; 
      int max_a = 0, max_b = 0; 
      int min_a = 0, min_b = 0;
      int i, j;

      // 5개 숫자 배열 입력하기
      System.out.print("Enter 5 numbers from 2 to 9 > ");
      number[0] = s.nextInt();
      number[1] = s.nextInt();
      number[2] = s.nextInt();
      number[3] = s.nextInt();
      number[4] = s.nextInt();
      
      // pow_value 배열 입력
      for(i = 0; i < 5; i++){
        for(j = 0; j < 5; j++){
          pow_value[i][j] = (int)Math.pow(number[i], number[j]);
        }
      }

      // max_a,b min_a,b 그리고 min, max 구하기
      max = pow_value[0][1];
      min = pow_value[0][1];
      for(i = 0; i < 5; i++){
        for(j = 0; j < 5; j++){
          if(pow_value[i][j] >= max && i != j){
            max = pow_value[i][j];
            max_a = number[i];
            max_b = number[j];
          }
          if(pow_value[i][j] <= min && i != j){
            min = pow_value[i][j];
            min_a = number[i];
            min_b = number[j];
          }
        }
      }
      
      //출력
      System.out.println("Max number is " + max + " which is " + max_b + " squared of " + max_a);
      System.out.println("Min number is " + min + " which is " + min_b + " squared of " + min_a);
    }
}
