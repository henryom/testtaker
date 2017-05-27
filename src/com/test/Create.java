package com.test;


import java.util.Scanner;
import java.lang.Math.random();

public class CreateQuestions extends read{
public CreateQuestions {
  int total;
  //"array" is the string array of questions
  for (int i = 0; i < lines.length; i++) {
    String question = lines[i];
    System.out.println(question);
    int A = (int)(Math.random() * 100 + 1);
    int B = (int)(Math.random() * 100 + 1);
    int C = (int)(Math.random() * 100 + 1);
    int D = (int)(Math.random() * 100 + 1);
    int Answer = (int)(Math.random() * 68 + 65);
    String guess = scanner.nextLine();
    int Guess = Integer.parseInt(guess);
    while (Guess > 68 || Guess < 65) {
      System.out.println("Enter A, B, C, or D");
      guess = scanner.nextLine();
      Guess = Integer.parseInt(guess);
    }
    if (Guess == Answer) {
      System.out.println("Correct!")
      total++;
    }
  }
  System.out.println("Total Score: " + total + "/5")
}
}
