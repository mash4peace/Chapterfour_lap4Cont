package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Mohamed Sheikhali on 2/15/2017.
 */
public class RecyClingBest {
    static Scanner sc = new Scanner(System.in);
    static int total_number_house = 8;
    static ArrayList <Integer> myLists = new ArrayList<Integer>(total_number_house);
    static  int houseCounting = 0;

    public static void main(String[] args) {

        for (int i = 0; i < total_number_house ; i++) {

            System.out.println("Enter recycling crates of house number "
                    + houseCounting + " :");
            int crates = sc.nextInt();
            houseCounting++;

            Integer [] arrayNumber = myLists.toArray
                    (new Integer[myLists.size()]);
            System.out.println("Enter data =>");
            for ( Integer inputNumb: arrayNumber) {
                System.out.println(inputNumb+" ,");

            }


        }
    }



}
