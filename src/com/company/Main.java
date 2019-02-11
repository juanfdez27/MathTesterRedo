package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstWord;
        String secondWord;
        int firstNumber;
        int secondNumber;

        firstWord = "Juan";
        secondWord = "Fernandez";
        firstNumber = 2;
        secondNumber = 4;


        System.out.println(firstWord+secondWord);
        System.out.println("My name is "+firstWord+secondWord+", I am "+secondNumber*secondNumber+" years old.");
        System.out.println("I have a little brother, he is in "+(firstNumber+secondNumber)+"th grade.");
        System.out.println("I also have a little sister, she is in "+(secondNumber-firstNumber)+"nd grade.");
        System.out.println("If I do not not take my sister to school on time she will get a "+(secondNumber%firstNumber)+" on her test.");
        System.out.println("Her teacher excused her even though she was "+secondNumber/firstNumber+" minutes late.");

    }
}
