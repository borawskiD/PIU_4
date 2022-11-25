package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectNumber {
    Scanner sc = new Scanner(System.in);
    List<Integer> dividers = new ArrayList<>();
    public boolean divideMe(int number){
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                dividers.add(i);
            }
        }
        long sum = dividers.stream().mapToInt(Integer::intValue).sum();
        System.out.print("Ta liczba"  + (sum == number ? " jest " : " nie jest "));
        System.out.print(" doskonala");
        System.out.println();
        if (sum == number) return true;
        return false;
    }
}
